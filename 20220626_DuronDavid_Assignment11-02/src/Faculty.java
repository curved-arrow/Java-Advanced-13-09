public class Faculty extends Employee {
    public String officeHours;
    public String rank;

    /* Constructor */
    public Faculty(String name, String address, String phone, String email, int office, double salary, String officeHours, String rank) {
        super(name, address, phone, email, office, salary); // using the Employee properties, we fill in the information from the superclass
        this.officeHours = officeHours;
        this.rank = rank;
    }

    /* Getter to return  officeHours */
    public String getOfficeHours() {
        return this.officeHours;
    }

    /* Getter to return rank */
    public String getRank() {
        return this.rank;
    }

    /* Setter for new officeHours */
    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    /* Setter for new rank */
    public void setRank(String rank) {
        this.rank = rank;
    }

    /* Getter to display all information of the object */
    public String toString() {
        return super.toString() + "\nOffice hours: " + this.officeHours +
                "\nRank: " + this.rank;
    }

}
