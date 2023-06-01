public class Main {
  public static void main(String[] args) {
    SuperB b = new SuperB();
    b.setIt(2);
    b.increase();
    b.triple();

    System.out.println(b.returnIt());
    SuperC c = new SuperC();
    c.setIt(2);
    c.increase();
    c.triple();

    System.out.println(c.returnIt());
  }
}
