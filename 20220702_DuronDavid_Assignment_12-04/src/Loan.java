class Loan {
  private double annualInterestRate;
  private int numberOfYears;
  private double loanAmount;
  private java.util.Date loanDate;

  /* Default constructor */
  public Loan() {
    this(2.5, 1, 1000);
  }

  /* Construct a loan with specified annual interest rate,
   number of years, and loan amount
   */
  public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
    if (loanAmount <= 0)
      throw new IllegalArgumentException("loanAmount must be greater than 0.");
    if (annualInterestRate <= 0)
      throw new IllegalArgumentException("annualInterestRate must be greater than 0.");
    if (numberOfYears <= 0)
      throw new IllegalArgumentException("numberOfYears must be greater than 0.");

    this.annualInterestRate = annualInterestRate;
    this.numberOfYears = numberOfYears;
    this.loanAmount = loanAmount;
    loanDate = new java.util.Date();
  }

/** Setters */
  /* Setter for annualInterestRate */
  public void setAnnualInterestRate(double annualInterestRate) {
    if (annualInterestRate <= 0)
      throw new IllegalArgumentException("annualInterestRate must be greater than 0.");
    this.annualInterestRate = annualInterestRate;
  }

  /* Setter for loanAmount */
  public void setLoanAmount(double loanAmount) {
    if (loanAmount <= 0)
      throw new IllegalArgumentException("loanAmount must be greater than 0.");
    this.loanAmount = loanAmount;
  }

  /* Setter for numberOfYears */
  public void setNumberOfYears(int numberOfYears) {
    if (numberOfYears <= 0)
      throw new IllegalArgumentException("numberOfYears must be greater than 0.");
    this.numberOfYears = numberOfYears;
  }

/** Getters */
  /* Getter for the annualInterestRate */
  public double getAnnualInterestRate() {
    return this.annualInterestRate;
  }

  /* Getter for the numberOfYears */
  public int getNumberOfYears() {
    return this.numberOfYears;
  }

  /* Getter for the loanAmount */
  public double getLoanAmount() {
    return this.loanAmount;
  }

  /* Getter for the monthly payment */
  public double getMonthlyPayment() {
    double monthlyInterestRate = this.annualInterestRate / 1200;
    double monthlyPayment = this.loanAmount * monthlyInterestRate / (1 -
            (1 / Math.pow(1 + monthlyInterestRate, this.numberOfYears * 12)));
    return monthlyPayment;
  }

  /* Getter for the total payment */
  public double getTotalPayment() {
    double totalPayment = this.getMonthlyPayment() * this.numberOfYears * 12;
    return totalPayment;
  }

  /* Getter for the loan date */
  public java.util.Date getLoanDate() {
    return this.loanDate;
  }
}