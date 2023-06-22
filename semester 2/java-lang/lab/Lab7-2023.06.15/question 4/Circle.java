public class Circle extends Shape {
  float radius;

  Circle(float radius) {
    this.radius = radius;
  }

  @Override
  public double calculateArea() {
    return 3.14 * radius * radius;
  }

  @Override
  public void display() {
    System.out.printf("The radius of the circle is %.2f\n", radius);
  }
}
