package Characters;

import Entity.*;
import Items.Item;

public class FrenBok extends Character {
  public FrenBok() {
    super("Фрекен Бок", Gender.WOMAN);
  }

  @Override
  public String moveTo(Entity obj) {
    return String.format("%s кинулась на %s", this.getGender(), obj);
  }

  @Override
  public String feel() {
    return String.format("%s взревела от бешенства", this);
  }

  @Override
  public String grab(IGrabbable obj) {
    return String.format("%s взяла %s", this.getGender(), obj);
  }

  public String grabCharacter(IGrabbableCharacter character) {
    return String.format("%s схватила %s за %s", this.getGender(), character.getName(), character.getGrabbablePart());
  }

  public String pushCharacterBehindItem(Character character, Item item) {
    return String.format("%s вытолкнула %s за %s", this.getGender(), character, item);
  }
}
