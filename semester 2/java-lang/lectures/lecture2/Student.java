public class Student {
  String name;
  int admissionNumber;

  Student() {}

  public void setValue(int admissionNumber, String name) {
    this.name = name;
    this.admissionNumber = admissionNumber;
  }

  public void display() {
    System.out.printf("The name is : %s\n", this.name);
    System.out.printf("The admission number is : %d\n", this.admissionNumber);
  }
}
