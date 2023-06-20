public class Main {
  public static void main(String[] args) {
    Age age = new Age();
    try {
      age.checkAge(145);
      System.out.println("The age you entered is valid");
    } catch (InvalidAge e) {
      System.out.println(e.getMessage());
    }
  }
}
