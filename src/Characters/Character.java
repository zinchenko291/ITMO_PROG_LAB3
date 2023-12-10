package Characters;

import Entity.*;

import java.util.Objects;

public abstract class Character extends Entity {
  private final Gender gender;
  private Entity position;
  private String currentState = "";
  protected Feels feel;
  protected IGrabbable itemInHand;

  public Character(String name, Gender gender) {
    this(name, gender, Feels.NORMAL);
  }

  public Character(String name, Gender gender, Feels feel) {
    this.name = name;
    this.gender = gender;
    this.feel = feel;
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

  public abstract void setFeel(Feels feel);
  public abstract void moveTo(Entity obj);
  public abstract void grab(IGrabbable obj);
  public IGrabbable getItemInHand() {
    return this.itemInHand;
  }
  public Entity getPosition() {
    return this.position;
  }
  protected void setPosition(Entity obj) {
    this.position = obj;
  }

  @Override
  public String toString() {
    return this.currentState;
  }
  protected void setState(String state) {
    this.currentState = state;
  }
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
