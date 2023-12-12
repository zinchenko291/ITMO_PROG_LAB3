package Characters;

public enum Feels {
  ANGRY("злиться"),
  SCARY("дрогнул губой"),
  SAD("надулся"),
  RAGE("взревела от бешенства"),
  NORMAL("Нормально");

  private final String feel;

  Feels(String feel) {
    this.feel = feel;
  }

  @Override
  public String toString() {
    return this.feel;
  }
}
