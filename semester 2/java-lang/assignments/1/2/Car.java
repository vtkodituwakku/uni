public class Car {
  private String make, mode, color;
  private int year;
  private double mileage;

  Car(String make, String mode, String color, int year, double mileage) {
    this.make = make;
    this.mode = mode;
    this.color = color;
    this.year = year;
    this.mileage = mileage;
  }

  public String getMake() {
    return make;
  }

  public String getMode() {
    return mode;
  }

  public String getColor() {
    return color;
  }

  public int getYear() {
    return year;
  }

  public double getMilage() {
    return mileage;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void setMilage(double mileage) {
    this.mileage = mileage;
  }

  public void drive(double distance) {
    mileage += distance;
  }

  public void displayCarInfo() {
    System.out.printf("The make of the car is    : %s", make);
    System.out.printf("The model of the car is   : %s", mode);
    System.out.printf("The color of the car is   : %s", color);
    System.out.printf("The year of the car is    : %d", year);
    System.out.printf("The mileage of the car is : %.2f", mileage);
  }
}
