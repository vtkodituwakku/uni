public class Employee {
  int empNo;
  String empName;
  double basicSalary;

  Employee(int empNo, String empName, double basicSalary) {
    this.empNo = empNo;
    this.empName = empName;
    this.basicSalary = basicSalary;
  }

  public void setValues(int empNo, String empName, double basicSalary) {
    this.empNo = empNo;
    this.empName = empName;
    this.basicSalary = basicSalary;
  }

  public void display() {
    System.out.printf("Employee number       : %d\n", empNo);
    System.out.printf("Employee name         : %s\n", empName);
    System.out.printf("Employee basic salary : %.0f\n", basicSalary);
  }

  public void increaseBasicSalary(double basicSalary) {
    this.basicSalary += basicSalary;
  }

  public double getBasicSalary() {
    return this.basicSalary;
  }
}
