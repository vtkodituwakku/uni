public class Main {
  public static void main(String[] args) {
    Monster m1 =
        new Monster(
            23,
            "Lorem ipsum dolor sit amet, qui minim labore adipisicing minim sint cillum sint"
                + " consectetur cupidatat.");
    m1.setLocation(44);
    int location = m1.getLocation();

    m1.setDescription(
        "Lorem ipsum dolor sit amet, qui minim labore adipisicing minim sint cillum sint"
            + " consectetur cupidatat.");
    String description = m1.getDescription();

    System.out.println(location);
    System.out.println(description);
  }
}
