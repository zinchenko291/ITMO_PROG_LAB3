package Characters;

import Entity.Entity;
import Items.Item;

public class FrenBok extends Character {
  private IGrabbableCharacter characterInHand;

  public FrenBok() {
    super("Фрекен Бок", Gender.WOMAN);
  }

  @Override
  public void setFeel(Feels feel) {
    this.feel = feel;
    this.setState(String.format("%s %s", this.getName(), feel));
  }

  @Override
  public void moveTo(Entity obj) {
    this.setPosition(obj);
    this.setState(String.format("%s кинулась к %s", this.getGender(), obj.getName()));
  }

  @Override
  public void grab(Item obj) {
    this.itemInHand = obj;
    this.setState(String.format("%s взяла %s", this.getGender(), obj.getName()));
  }

  public void grabCharacter(IGrabbableCharacter character) {
    this.characterInHand = character;
    this.setState(String.format("%s схватила %s за %s", this.getGender(), character.getName(), character.getGrabbablePart()));
  }

  public void pushCharacterBehindItem(Item item) {
    this.characterInHand.moveTo(item);
    this.setState(String.format("%s вытолкнула %s за %s", this.getGender(), this.characterInHand.getName(), item));
    this.characterInHand = null;
  }
}
