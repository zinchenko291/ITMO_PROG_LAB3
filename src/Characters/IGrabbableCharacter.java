package Characters;

import Entity.Entity;
import Entity.IGrabbable;

public interface IGrabbableCharacter extends IGrabbable {
  String getGrabbablePart();
  void moveTo(Entity obj);
}
