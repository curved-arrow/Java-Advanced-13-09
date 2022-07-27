public class Transaction {
    private java.util.Date date = new java.util.Date(); // uses java utilities api to get current timestamp
    private char type;
    private double amount;
    private double balance;
    private String description;

    /* Getters */
    public String getDate() {
        return this.date.toString();
    }

    public char getType() {
        return this.type;
    }

    public double getAmount() {
        return this.amount;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getDescription() {
        return this.description;
    }

    /* Setters */
    public void setType(char type) {
        this.type = type;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /* Constructor */
    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

}
