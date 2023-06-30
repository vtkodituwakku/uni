public class CheckWeightException extends Exception {
  private String str;

  CheckWeightException(String str) {
    this.str = str;
  }

  public String toString() {
    return str;
  }
}
