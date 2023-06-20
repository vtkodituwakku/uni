public class Age {
  public void checkAge(int age) throws InvalidAge {
    if (age <= 0 || age >= 120) {
      throw new InvalidAge("Invlaid age");
    }
  }
}
