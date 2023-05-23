public class Shape {
  private float length, height;

  Shape(float length, float height) {
    this.height = height;
    this.length = length;
  }

  public double calculateArea() {
    // If length and height is equal then I will assume the shape as a circle 😉
    if (length == height) {
      double area = 3.14 * length * length;
      return area;
    }

    double area = length * height;
    return area;
  }
}
