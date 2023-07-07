public class Main {
  public static long factorial(int n) {
    if (n == 1) {
      return 1;
    }

    if (n == 0) {
      return 1;
    }

    if (n < 1) {
      return -1;
    }

    return n * factorial(n - 1);
  }

  public static void main(String[] args) {
    System.out.println(factorial(10));
  }
}
