public class Main {
  public static void main(String[] args) {
    Employee emp1 = new Employee("11", "Mr.Bogdan", "Manager");
    emp1.setEmpDesignation("Senior manager");

    Employee emp2 = new Employee("22", "Ms.Bird", "Intern");
    emp2.setEmpDesignation("Manager");

    System.out.println(
        "The employee designation of " + emp1.getEmpName() + " is : " + emp1.getEmpDesignation());
    System.out.println(
        "The employee designation of " + emp2.getEmpName() + " is : " + emp2.getEmpDesignation());
  }
}
