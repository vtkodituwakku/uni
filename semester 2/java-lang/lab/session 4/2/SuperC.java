public class SuperC extends SuperB {
  @Override
  void triple() {
    x = x + 3;
  } // override existing method

  void quadruple() {
    x = x * 4;
  } // new method
}
