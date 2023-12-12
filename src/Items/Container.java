package Items;

import Characters.Character;

import java.util.Objects;

public class Container extends Item {
  private final Item innerItem;

  public Container(String name, Item item) {
    super(name);
    this.innerItem = item;
  }

  public Container(String name, Item item, Character owner) {
    super(name, owner);
    item.setOwner(owner);
    this.innerItem = item;
  }

  public Item getInnerItem() {
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
