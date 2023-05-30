public class B extends A {
  private int c;

  B(int a, int b, int c) {
    super(a, b);
    this.c = c;
  }

  @Override
  public void display() {
    System.out.printf("The value of a is : %d\n", a);
    System.out.printf("The value of b is : %d\n", b);
    System.out.printf("The value of c is : %d\n", c);
  }
}
