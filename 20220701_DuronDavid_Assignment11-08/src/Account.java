import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.text.DecimalFormat;

public class Account {
    // private attributes, accessible through getters and setters
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private long dateCreated = Instant.now().getEpochSecond();

    private String customerName = ""; // added for 11.8

    public ArrayList<Transaction> transaction = new ArrayList<>(); // added for 11.8
    public void setBalance(double balance) {
        this.balance = balance;
    }

    private void setInterestRate(double rate) {
        this.annualInterestRate = rate;
    }

    // getter methods

    public int getID() {
        return this.id;
    }

    public String getCustomerName() {
        return this.customerName;
    }
    public double getBalance() {
        return this.balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return this.annualInterestRate / 12 / 1000;
    }

    public String getMonthlyInterest() {
        DecimalFormat interest_formatter = new DecimalFormat("0.00");
        return interest_formatter.format(this.balance * this.getMonthlyInterestRate());
    }

    public Date getDateCreated() {
        Date dateTime= new Date((long)this.dateCreated*1000);
        return dateTime;
    }

    // setter method
    public void setId(int id) {
        this.id = id;
    }

    public void deposit(double amount) {
        double currentAmount = this.getBalance();
        double depositAmount = amount;
        double newAmount = currentAmount + depositAmount;

        this.setBalance(newAmount);
        Transaction transaction_storage = new Transaction('W', depositAmount, newAmount, "Withdrawal from account");
        this.transaction.add(transaction_storage);
//        this.transaction.add(new Transaction('D', depositAmount, newAmount, "Deposit to account")); // uses the add method from the class
    }

    public void withdraw(double amount) {
        double currentAmount = this.getBalance();
        double withdrawAmount = amount;
        double newAmount = currentAmount - withdrawAmount;

        this.setBalance(newAmount);
        Transaction transaction_storage = new Transaction('W', withdrawAmount, newAmount, "Withdrawal from account");
        this.transaction.add(transaction_storage);
//        this.transaction.add(new Transaction('W', withdrawAmount, newAmount, "Withdrawal from account")); // uses the add method from the class
    }

    public void setAnnualInterestRate(double newRate) {
        this.setInterestRate(newRate);
    }

    // constructors
    public Account() {
        // empty default
    }

    public Account(int id, double balance) {
        this.setId(id);
        this.setBalance(balance);
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.setId(id);
        this.setBalance(balance);
        this.setAnnualInterestRate(annualInterestRate);
    }

    public Account(int id, String customerName, double balance, double annualInterestRate) {
        this.customerName = customerName;
        this.setId(id);
        this.setBalance(balance);
        this.setAnnualInterestRate(annualInterestRate);
    }

    public String toString() {
        return super.toString() + "\nAccount ID: " + this.getID() + "\nType: null\nBalance: " + this.getBalance() + "\nAnnual Interest Rate: " + this.getAnnualInterestRate() + "percent.";
    }

    /* Displays the transactions from the object */
    public ArrayList<Transaction> getTransactions() {
        return this.transaction;
    }
}
