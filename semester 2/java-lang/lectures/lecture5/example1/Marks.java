public class Marks extends Student {
  private float mark1;
  private float mark2;

  Marks(int addmissionNo, String studentName, float mark1, float mark2) {
    super(addmissionNo, studentName);
    this.mark1 = mark1;
    this.mark2 = mark2;
  }

  public void displayAvg() {
    System.out.printf("The average marks is : %.2f\n", (mark1 + mark2) / 2);
  }
}
