package Characters;

import Entity.Entity;
import Items.Container;
import Items.Item;

public class Karlson extends Character implements IGrabbable {
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
    this.setState(String.format("%s %s", this.getName(), feel));
  }

  @Override
  public void moveTo(Entity obj) {
    this.setPosition(obj);
    this.setState(String.format("%s сделал шаг к %s", this.getGender(), obj));
  }

  @Override
  public void grab(Item obj) {
    this.itemInHand = obj;
    this.setState(String.format("%s взял %s", this.getGender(), obj));
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
