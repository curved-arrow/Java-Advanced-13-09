public class Student extends Person {
    public int class_status;

    public Student(String name, String address, String phone, String email, int status) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        final int class_status = status;
    }

    /* Displays the status */
    public String getStatus(int class_status) {
        switch (class_status) {
            case 1:
                return "freshman";
            case 2:
                return "sophomore";
            case 3:
                return "junior";
            case 4:
                return "senior";
            default:
                return "Unknown";
        }
    }

    /* Getter to display all information of the object */
    public String toString() {
        return super.toString() + "\nStatus: " + this.class_status + "\nCourse:";
    }
}
