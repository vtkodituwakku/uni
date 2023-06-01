public class Student extends Person {
  private String course;

  Student(String id, String name, String course) {
    super(id, name);
    this.course = course;
  }

  public String getCourse() {
    return course;
  }

  public void setCourse(String course) {
    this.course = course;
  }
}
