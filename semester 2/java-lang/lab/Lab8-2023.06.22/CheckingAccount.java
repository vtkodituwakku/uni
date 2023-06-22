public class CheckingAccount extends BankAccount {
  private float intrestRate = 2;

  CheckingAccount(int account, double initialDeposit) {
    super(account, initialDeposit);
  }

  @Override
  public double calculateIntrest() {
    double balance = this.getBalance();
    double intrest = balance * intrestRate / 100;
    this.setBalance(balance + intrest);

    return intrest;
  }
}
