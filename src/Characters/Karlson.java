package Characters;

import Entity.*;
import Items.Container;

public class Karlson extends Character implements IGrabbableCharacter {
  public Karlson() {
    super("Кралсон", Gender.MAN);
  }
  public Karlson(Feels feel) {
    this();
    this.feel = feel;
  }

  @Override
  public void setFeel(Feels feel) {
    this.feel = feel;
    switch (this.feel) {
      case NORMAL -> this.setState(String.format("%sу нормально", this.getName()));
      case ANGRY -> this.setState(String.format("%s злиться", this.getName()));
      case SAD -> this.setState(String.format("%s надулся", this.getName()));
      case SCARY -> this.setState(String.format("%s дрогнул губой", this.getName()));
      case RAGE -> this.setState(String.format("%s в ярости", this.getName()));
    }
  }

  @Override
  public void moveTo(Entity obj) {
    this.setPosition(obj);
    this.setState(String.format("%s сделал шаг к %s", this.getGender(), obj));
  }

  @Override
  public void grab(IGrabbable obj) {
    this.itemInHand = obj;
    this.setState(String.format("%s взял %s", this.getGender() ,obj));
  }

  public void grabFrom(Container container) {
    this.grab(container.getInnerItem());
    this.setState(String.format("%s взял одну %s из %s", this.getName(), container.getInnerItem(), container));
  }

  @Override
  public String getGrabbablePart() {
    return "шиворот";
  }
}
