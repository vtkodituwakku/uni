public class Employee {
  private int EmployeeID;
  private String EmployeeName;
  private float EmployeeSalary;

  Employee(int EmployeeID, String EmployeeName, float EmployeeSalary) {
    this.EmployeeID = EmployeeID;
    this.EmployeeName = EmployeeName;
    this.EmployeeSalary = EmployeeSalary;
  }

  public void setEmployeeID(int EmployeeID) {
    this.EmployeeID = EmployeeID;
  }

  public void setEmployeeName(String EmployeeName) {
    this.EmployeeName = EmployeeName;
  }

  public void setEmployeeSalary(float EmployeeSalary) {
    this.EmployeeSalary = EmployeeSalary;
  }

  public int getEmployeeID() {
    return EmployeeID;
  }

  public String getEmployeeName() {
    return EmployeeName;
  }

  public float getEmployeeSalary() {
    return EmployeeSalary;
  }
}
