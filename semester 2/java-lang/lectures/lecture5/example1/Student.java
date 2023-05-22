public class Student {
  protected int addmissionNo;
  protected String studentName;

  Student(int addmissionNo, String studentName) {
    this.addmissionNo = addmissionNo;
    this.studentName = studentName;
  }

  public void display() {
    System.out.printf("The student addmission number is : %f\n", addmissionNo);
    System.out.printf("The student name is : %s\n", studentName);
  }
}
