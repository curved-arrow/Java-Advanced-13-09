import java.util.GregorianCalendar; // Java APi

public class Main {
    public static void main(String[] args) {
        // Use the Java Api to create a calendar with full functionality
        GregorianCalendar calender = new GregorianCalendar(); // creates object of the class

        int current_year = calender.get(calender.YEAR); // stores this information in the variable
        int current_month = calender.get(calender.MONTH); // stores this information in the variable
        int current_day = calender.get(calender.DAY_OF_MONTH); // stores this information in the variable
        String current_date = current_year + "/" + current_month + "/" + current_day;

        // Display the current year, month, and day.
        System.out.println("Current date:\n" + current_date + "\n");

        // Set elapsed time since January 1, 1970 to 1234567898765L

        GregorianCalendar given_epoch = new GregorianCalendar();
        given_epoch.setTimeInMillis(1234567898765L);

        int elapsed_year = given_epoch.get(given_epoch.YEAR);
        int elapsed_month = given_epoch.get(given_epoch.MONTH);
        int elapsed_day = given_epoch.get(given_epoch.DAY_OF_MONTH);
        String elapsed_date = elapsed_year + "/" + elapsed_month + "/" + elapsed_day;

        // Display the year, month and day
        System.out.println("Elapsed date:\n" + elapsed_date + "\n");

    }
}