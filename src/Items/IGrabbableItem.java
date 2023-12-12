package Items;

import Characters.Character;
import Entity.IGrabbable;

public interface IGrabbableItem extends IGrabbable {
  void setOwner(Character owner);
}
