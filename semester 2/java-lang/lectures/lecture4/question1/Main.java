public class Main {
  public static void main(String[] args) {
    Employee emp1 = new Employee(1, "Vinuka", 10000);

    // Increase the basic salary
    emp1.increaseBasicSalary(10000);
    emp1.display();

    double basicSalary = emp1.getBasicSalary();
    System.out.printf("The new basic salary is : %.0f", basicSalary);
  }
}
