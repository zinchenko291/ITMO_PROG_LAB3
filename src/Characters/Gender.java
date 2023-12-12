package Characters;

public enum Gender {
  MAN("Он"),
  WOMAN("Она");

  private final String gender;

  Gender(String gender) {
    this.gender = gender;
  }

  @Override
  public String toString() {
    return gender;
  }
}
