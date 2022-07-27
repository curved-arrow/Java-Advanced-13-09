public class Main {
    public static void main(String[] args) {
        double variable_1 = 12.9;
        int variable_2 = 30;
        double variable_3 = 1000.00;

        try {
            Loan loan = new Loan(2, 0, -10);
        } catch (IllegalArgumentException ex) {
            System.out.println("IllegalArgumentException: " + ex.getMessage());
        }
    }
}