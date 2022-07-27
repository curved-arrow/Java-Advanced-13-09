public class Main {
    public static void main(String[] args) {
        // Create Account, SavingsAccount and Checking Account objects
        Account generic_account = new Account(1122, 20000);
        SavingsAccount new_savings = new SavingsAccount(1001, 20000);
        CheckingAccount new_checking = new CheckingAccount(1004, 20000, -20);

        // Set annual interest rate of 4.5%
        generic_account.setAnnualInterestRate(4.5);
        new_savings.setAnnualInterestRate(4.5);
        new_checking.setAnnualInterestRate(4.5);

        // Withdraw $2,500
        generic_account.withdraw(2500);
        new_savings.withdraw(2500);
        new_checking.withdraw(2500);

        // Deposit $3,000
        generic_account.deposit(3000);
        new_savings.deposit(3000);
        new_checking.deposit(3000);

        // Invoke toString methods
        System.out.println("\n"+generic_account.toString()+"\n");
        System.out.println("\n"+new_savings.toString()+"\n");
        System.out.println("\n"+new_checking.toString()+"\n");
    }
}