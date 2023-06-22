public class Rectangle extends Shape {
  float width, height;

  Rectangle(float width, float height) {
    this.width = width;
    this.height = height;
  }

  @Override
  public double calculateArea() {
    return width * height;
  }

  @Override
  public void display() {
    System.out.printf("The width of the rectangle is  : %.2f\n", width);
    System.out.printf("The height of the rectangle is : %.2f\n", height);
  }
}
