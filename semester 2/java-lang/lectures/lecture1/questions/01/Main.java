import java.time.Year;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name;
    int birthYear;

    System.out.print("Enter your name : ");
    name = sc.nextLine();

    System.out.print("Enter your birth year : ");
    birthYear = sc.nextInt();

    sc.close();

    int currentYear = Year.now().getValue();
    if (birthYear > currentYear) {
      System.out.println("Invalid birth year was enetered !");
      return;
    }

    int age = currentYear - birthYear;

    System.out.printf("The username is : %s\n", name);
    System.out.printf("The age is : %d\n", age);
  }
}
