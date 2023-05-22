public class Rectangle {
  float width;
  float height;

  Rectangle(float width, float height) {
    this.width = width;
    this.height = height;
  }

  // public void setValues(float width, float height) {
  //   this.width = width;
  //   this.height = height;
  // }

  public void displayArea() {
    float area = width * height;
    System.out.printf("The area is : %.2f\n", area);
  }
}
