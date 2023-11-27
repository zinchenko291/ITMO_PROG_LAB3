package Characters;

import Entity.*;

import java.util.Objects;

public abstract class Character extends Entity {
  private final Gender gender;

  public Character(String name, Gender gender) {
    this.name = name;
    this.gender = gender;
  }

  public final String getGender() {
    switch (this.gender) {
      case MAN -> {
        return "Он";
      }
      case WOMAN -> {
        return "Она";
      }
      default -> {
        return "";
      }
    }
  }

  public abstract String feel();
  public abstract String grab(IGrabbable obj);
  public abstract String moveTo(Entity obj);

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Character character = (Character) o;
    return Objects.equals(this.name, character.name) && this.gender == character.gender;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name, this.gender);
  }
}
