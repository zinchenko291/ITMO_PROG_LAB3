package Characters;

import Entity.*;
import Items.Container;

public class Karlson extends Character implements IGrabbableCharacter {
  public Karlson() {
    super("Кралсон", Gender.MAN);
  }

  @Override
  public String feel() {
    return String.format("%s дрогнул губой и надулся", this);
  }

  @Override
  public String moveTo(Entity obj) {
    return String.format("%s сделал шаг к %s", this.getGender(), obj);
  }

  @Override
  public String grab(IGrabbable obj) {
    return String.format("%s взял %s", this, obj);
  }

  public String grabFrom(Container container) {
    return String.format("%s взял одну %s из %s", this.getGender(), container.getInnerItem(), container);
  }

  @Override
  public String getGrabbablePart() {
    return "шиворот";
  }
}
