public class Main {
  public static void main(String[] args) {
    SavingsAccount savingsAccount = new SavingsAccount(12, 20000000);
    double savingsIntrest = savingsAccount.calculateIntrest();
    System.out.printf(
        "The intrest for the savings account is  : %s\n", String.format("%,.1f", savingsIntrest));

    CheckingAccount checkingAccount = new CheckingAccount(23, 1000000);
    double checkingIntrest = checkingAccount.calculateIntrest();
    System.out.printf(
        "The intrest for the checking account is : %s\n", String.format("%,.1f", checkingIntrest));
  }
}
