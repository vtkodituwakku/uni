public class Lecturer extends Person {
  private String program;

  Lecturer(String id, String name, String program) {
    super(id, name);
    this.program = program;
  }

  public String getProgram() {
    return program;
  }

  public void setProgram(String program) {
    this.program = program;
  }
}
