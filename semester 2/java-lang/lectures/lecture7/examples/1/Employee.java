public class Employee {
  public static String CompanyName;
  private double EmpNo;
  private String EmpName;

  Employee(double EmpNo, String EmpName) {
    this.EmpNo = EmpNo;
    this.EmpName = EmpName;
  }

  public void display() {
    System.out.printf("The employee number is : %.0f\n", EmpNo);
    System.out.printf("The employee name is   : %s\n", EmpName);
    System.out.printf("The company name is    : %s\n", CompanyName);
  }
}
