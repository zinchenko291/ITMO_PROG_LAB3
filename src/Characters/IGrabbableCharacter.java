package Characters;

import Entity.Entity;

interface IGrabbableCharacter {
  String getGrabbablePart();

  void moveTo(Entity obj);

  String getName();
}
