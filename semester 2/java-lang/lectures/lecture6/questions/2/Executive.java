public class Executive extends Employee implements Paybonus {
  private double travelAllowance;

  Executive(
      String employeeID,
      String employeeName,
      String address,
      String dob,
      double salary,
      double travelAllowance) {
    super(employeeID, employeeName, address, dob, salary);
    this.travelAllowance = travelAllowance;
  }

  @Override
  public void calcincentive() {
    if (salary > 5000) {
      incentive = (salary * 10) / 100;
    }
  }

  @Override
  public void displayInfo() {
    System.out.printf("The executive ID        : %s\n", employeeID);
    System.out.printf("The executive name      : %s\n", employeeName);
    System.out.printf("The executive address   : %s\n", address);
    System.out.printf("The executive dob       : %s\n", dob);
    System.out.printf("The executive salaray   : %.2f\n", salary);
    System.out.printf("The executive incentive : %.2f\n", incentive);
    System.out.printf("The executive allowance : %.2f\n", travelAllowance);
  }
}
