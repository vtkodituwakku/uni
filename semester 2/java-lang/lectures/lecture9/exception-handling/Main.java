public class Main {
  public static void main(String[] args) {
    try {
      Calc c = new Calc();
      float result = c.divide(20, 0);
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
    }
  }
}
