public class Employee {
  public static String CompanyName;
  private double EmpNo;
  private String EmpName;
  public static int EmpCount = 0;

  Employee(double EmpNo, String EmpName) {
    this.EmpNo = EmpNo;
    this.EmpName = EmpName;
    EmpCount++;
  }

  public void display() {
    System.out.printf("The employee number is : %.0f\n", EmpNo);
    System.out.printf("The employee name is   : %s\n", EmpName);
    System.out.printf("The company name is    : %s\n", CompanyName);
    System.out.printf("The emp count is       : %d\n", EmpCount);
  }
}
