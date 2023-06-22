public abstract class BankAccount {
  private int accountNumber;
  private double balance;

  BankAccount(int acccountNumber, double initialDeposit) {
    this.accountNumber = acccountNumber;
    this.balance = initialDeposit;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  abstract double calculateIntrest();
}
