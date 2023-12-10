package Items;

import Characters.Character;
import Entity.*;

import java.util.Objects;

public class Item extends Entity {
  private Character owner;
  public Item(String name) {
    this.name = name;
  }
  public Item(String name, Character owner) {
    this.name = name;
    this.owner = owner;
  }

  public Character getOwner() {
    return owner;
  }
  public void setOwner(Character owner) {
    this.owner = owner;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Item item = (Item) o;
    return Objects.equals(this.name, item.name);
  }
}
