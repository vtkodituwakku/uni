public class Item {
  private int location;
  private String description;

  Item(int location, String description) {
    this.location = location;
    this.description = description;
  }

  public void setLocation(int location) {
    this.location = location;
  }

  public int getLocation() {
    return this.location;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getDescription() {
    return this.description;
  }
}
