public class Employee extends Person {
    public int office; // assumed to be office phone number
    public double salary;
    public MyDate dateHired;

    /* Constructor */
    public Employee(String name, String address, String phone, String email, int office, double salary) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = new MyDate();
    }

    /* Getter to return office phone number */
    public int getOffice() {
        return office;
    }

    /* Getter to return salary */
    public String getSalary() {
        return String.format("%.2f", this.salary); // salary is returned with two decimal precision
    }

    /* Getter to return dateHired */
    public String getDateHired() {
        return this.dateHired.getMonth() + "/" + this.dateHired.getDay()
                + "/" + this.dateHired.getYear();
    }

    /* Setter for office */
    public void setOffice(int office) {
        this.office = office;
    }

    /* Setter for salary */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /* Setter for dateHired, using current epoch timestamp */
    public void setDateHired() {
        this.dateHired = new MyDate();
    }

    /* Setter for dateHired, using given epoch timestamp */
    public void setDateHired(long epoch) {
        this.dateHired = new MyDate(epoch);
    }

    /* Getter to display all information of the object */
    public String toString() {
        return super.toString() + "\nOffice: " + this.office +
                "\nSalary: $" + getSalary() + "\nDate hired: " + getDateHired();
    }
}
