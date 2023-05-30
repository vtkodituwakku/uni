public class Employee {
  protected String employeeID, employeeName, address, dob;
  protected double salary;
  protected double incentive = 0;

  Employee(String employeeID, String employeeName, String address, String dob, double salary) {
    this.employeeID = employeeID;
    this.employeeName = employeeName;
    this.address = address;
    this.dob = dob;
    this.salary = salary;
  }

  public void displayInfo() {
    System.out.printf("The employee ID        : %s\n", employeeID);
    System.out.printf("The employee name      : %s\n", employeeName);
    System.out.printf("The employee address   : %s\n", address);
    System.out.printf("The employee dob       : %s\n", dob);
    System.out.printf("The employee salaray   : %.2f\n", salary);
    System.out.printf("The employee incentive : %.2f\n", incentive);
  }
}
