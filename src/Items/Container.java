package Items;

import Characters.Character;
import Entity.IGrabbable;

import java.util.Objects;

public class Container extends Item {
  private final IGrabbable innerItem;

  public Container(String name, IGrabbable item) {
    super(name);
    this.innerItem = item;
  }

  public Container(String name, IGrabbableItem item, Character owner) {
    super(name, owner);
    item.setOwner(owner);
    this.innerItem = (IGrabbable) item;
  }

  public IGrabbable getInnerItem() {
    return this.innerItem;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    Container container = (Container) o;
    return Objects.equals(innerItem, container.innerItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), innerItem);
  }
}
