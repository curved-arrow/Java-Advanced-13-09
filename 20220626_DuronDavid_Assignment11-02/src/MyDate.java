import java.util.GregorianCalendar;

public class MyDate {

    private int year;
    private int month;
    private int day;

    /* No-arg constructor for current date */
    MyDate() {
        GregorianCalendar current_epoch = new GregorianCalendar();
        this.year = current_epoch.get(current_epoch.YEAR);
        this.month = current_epoch.get(current_epoch.MONTH);
        this.day = current_epoch.get(current_epoch.DAY_OF_MONTH);
    }

    /* Uses the passed epoch to set the date*/
    MyDate(long epoch) {
        GregorianCalendar specific_epoch = new GregorianCalendar();
        specific_epoch.setTimeInMillis(epoch);

        this.year = specific_epoch.get(specific_epoch.YEAR);
        this.month = specific_epoch.get(specific_epoch.MONTH);
        this.day = specific_epoch.get(specific_epoch.DAY_OF_MONTH);
    }

    /* display the year */
    public int getYear() {
        return this.year;
    }

    /* display the month */
    public String getMonth() {
        String m = String.valueOf(this.month);
        return m;
    }

    /* display the day */
    public String getDay() {
        String d = String.valueOf(this.day);
        return d;
    }

    /* set new date */
    public void setDate(long elapsedTime) {
        GregorianCalendar set_epoch = new GregorianCalendar();
        long new_epoch = elapsedTime;

        set_epoch.setTimeInMillis(elapsedTime);

        this.year = set_epoch.get(set_epoch.YEAR);
        this.month = set_epoch.get(set_epoch.MONTH);
        this.day = set_epoch.get(set_epoch.DAY_OF_MONTH);
    }
}
