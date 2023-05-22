public class Bank {
  String accountNumber;
  String accountHoldersName;
  float balance;

  Bank(String accountNumber, String accountHoldersName, float balance) {
    this.accountNumber = accountNumber;
    this.accountHoldersName = accountHoldersName;
    this.balance = balance;
  }

  public void setValues(String accountNumber, String accountHoldersName, float balance) {
    this.accountNumber = accountNumber;
    this.accountHoldersName = accountHoldersName;
    this.balance = balance;
  }

  public void deposit(float amount) {
    balance += amount;
  }

  public void checkBalance() {
    System.out.printf("The balance is : %.2f\n", balance);
  }

  public void displayDetails() {
    System.out.printf("The account number       : %s\n", accountNumber);
    System.out.printf("The account holders name : %s\n", accountHoldersName);
    System.out.printf("The account balance is   : %.2f\n", balance);
  }
}
