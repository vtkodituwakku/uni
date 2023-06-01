public class Employee {
  String empID, empName, empDesignation;

  Employee(String empID, String empName, String empDesignation) {
    this.empID = empID;
    this.empName = empName;
    this.empDesignation = empDesignation;
  }

  public String getEmpID() {
    return empID;
  }

  public void setEmpID(String empID) {
    this.empID = empID;
  }

  public String getEmpName() {
    return empName;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }

  public String getEmpDesignation() {
    return empDesignation;
  }

  public void setEmpDesignation(String empDesignation) {
    this.empDesignation = empDesignation;
  }
}
