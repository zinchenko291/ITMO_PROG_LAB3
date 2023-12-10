package Characters;

import Entity.*;
import Items.Item;

public class FrenBok extends Character {
  public FrenBok() {
    super("Фрекен Бок", Gender.WOMAN);
  }

  @Override
  public void setFeel(Feels feel) {
    this.feel = feel;
    switch (this.feel) {
      case NORMAL -> this.setState(String.format("%s спокойна", this.getName()));
      case ANGRY -> this.setState(String.format("%s начала злиться", this.getName()));
      case SAD -> this.setState(String.format("%s взгрустнула", this.getName()));
      case SCARY -> this.setState(String.format("У %s задрожали коленки", this.getName()));
      case RAGE -> this.setState(String.format("%s взревела от бешенства", this.getName()));
    }
  }

  @Override
  public void moveTo(Entity obj) {
    this.setPosition(obj);
    this.setState(String.format("%s кинулась к %s", this.getGender(), obj.getName()));
  }

  @Override
  public void grab(IGrabbable obj) {
    this.itemInHand = obj;
    this.setState(String.format("%s взяла %s", this.getGender(), obj.getName()));
  }

  public void grabCharacter(IGrabbableCharacter character) {
    this.itemInHand = character;
    this.setState(String.format("%s схватила %s за %s", this.getGender(), character.getName(), character.getGrabbablePart()));
  }

  public void pushCharacterBehindItem(Item item) {
    if (this.itemInHand instanceof Character) {
      ((Character) this.itemInHand).moveTo(item);
      this.setState(String.format("%s вытолкнула %s за %s", this.getGender(), this.itemInHand.getName(), item));
      this.itemInHand = null;
    }
  }
}
