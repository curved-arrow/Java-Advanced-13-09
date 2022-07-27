public class SavingsAccount extends Account {
    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    public void withdraw(double amount) {
        if (amount < this.getBalance()) this.setBalance(this.getBalance() - amount);
        else System.out.println("Amount exceeds overdraw limit, unable to process");
    }

    public String toString() {
        return super.toString() + "\nAccount ID: " + this.getID() + "\nType: Savings\nBalance: " + this.getBalance() + "\nAnnual Interest Rate: " + this.getAnnualInterestRate() + "percent.";
    }
}
