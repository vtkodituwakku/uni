public class A {
  protected int a, b;

  A(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public void display() {
    System.out.printf("The value of a is : %d", a);
    System.out.printf("The value of b is : %d", b);
  }
}
