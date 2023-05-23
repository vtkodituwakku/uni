public class Rectangle extends Shape {
  private float length, height;

  Rectangle(float length, float height) {
    super(height, length);
    this.height = height;
    this.length = length;
  }
}
