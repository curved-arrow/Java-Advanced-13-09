public class Person {
    public String name;
    public String address;
    public String phone;
    public String email;

    /* no-arg constructor */
    public Person() {
        this.name = "name not set";
        this.address = "address not set";
        this.phone = "phone not set";
        this.email = "email not set";
    }

    public Person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    /* Getter Methods */
    /* Return name */
    public String getName() {
        return this.name;
    }

    /* Return address */
    public String getAddress() {
        return this.address;
    }

    /* Return phone */
    public String getPhone() {
        return this.phone;
    }

    /* Return email */
    public String getEmail() {
        return this.email;
    }

    /* Setter Methods */
    /* Set new name */
    public void setName(String name) {
        this.name = name;
    }

    /* Set new address */
    public void setAddress(String address) {
        this.address = address;
    }

    /* Set new phone number */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /* Set new email */
    public void setEmail(String email) {
        this.email = email;
    }

    /* Display all information of the class */
    public String toString() {
        return "\nName: " + this.name + "\nAddress: " + this.address +
                "\nPhone number: " + this.phone + "\nEmail address: " + this.email;
    }

}
