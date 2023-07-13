public class Main {
  public static void main(String[] args) {
    Thread t1 = new Thread(new Threading());
    Thread t2 = new Thread(new Threading());
    Thread t3 = new Thread(new Threading());

    t1.start();
    t2.start();
    t3.start();
  }
}
