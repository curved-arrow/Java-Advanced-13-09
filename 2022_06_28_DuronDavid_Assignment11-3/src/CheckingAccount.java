public class CheckingAccount extends Account {
    public double overDraftLimit;

    public CheckingAccount(int id, double balance, double overDraftLimit) {
        super(id, balance);
        this.overDraftLimit = overDraftLimit;
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    public double getOverDraftLimit() {
        return this.overDraftLimit;
    }

    public void withdraw(double amount) {
        if(this.getBalance() - amount > overDraftLimit) this.setBalance(getBalance() - amount);
        else System.out.println("You've reach the overdraft limit.");
    }

    /* returns a string to describe the object properties */
    public String toString() {
        return super.toString() + "\nAccount ID: " + this.getID() + "\nType: Checking\nOverdraft limit: $" +
                String.format("%.2f", overDraftLimit) + "\nBalance: " + this.getBalance() + "\nAnnual Interest Rate: " + this.getAnnualInterestRate() + "percent.";
    }
}
