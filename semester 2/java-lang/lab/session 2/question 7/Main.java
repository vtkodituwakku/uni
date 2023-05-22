public class Main {
  public static void main(String[] args) {
    int[] numbers = {10, 20, 30, 40, 50};
    int i = 0;
    for (int x : numbers) {
      System.out.print(x);

      if (i == numbers.length - 1) {
        System.out.println();
        continue;
      }

      System.out.print(",");
      i++;
    }

    System.out.println();

    String[] names = {"James", "Larry", "Tom", "Lacy"};
    int j = 0;
    for (String name : names) {
      System.out.print(name);

      if (j == names.length - 1) {
        System.out.println();
        continue;
      }

      System.out.print(",");
      j++;
    }
  }
}
