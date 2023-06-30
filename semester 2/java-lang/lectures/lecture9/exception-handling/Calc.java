public class Calc {
  public float divide(int a, int b) throws ArithmeticException {
    if (b == 0) {
      throw new ArithmeticException("cannot divide by zero");
    }
    float ans = a / b;
    return ans;
  }
}
