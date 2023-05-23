public class Main {
  public static void main(String[] args) {
    Circle circle = new Circle(7);
    System.out.printf("The area of the circle is : %.2f\n", circle.calculateArea());

    Rectangle rect = new Rectangle(3, 7);
    System.out.printf("The area of the rectangle is : %.2f\n", rect.calculateArea());
  }
}
