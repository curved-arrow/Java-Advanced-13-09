public class Staff extends Employee {
    public String title;

    /* Constructor */
    public Staff(String name, String address, String phone, String email, int office, double salary, String title) {
        super(name, address, phone, email, office, salary); // using the Employee properties, we fill in the information from the superclass
        this.title = title;
    }

    /* Getter for this title */
    public String getTitle() {
        return this.title;
    }

    /* Getter to display all information of the object */
    public String toString() {
        return super.toString() + "\nTitle: " + this.title;
    }

    /* Setter for new title */
    public void setTitle(String title) {
        this.title = title;
    }
}
