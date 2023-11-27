package Items;

import Entity.*;

import java.util.Objects;

public class Item extends Entity implements IGrabbable {
  public Item(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Item item = (Item) o;
    return Objects.equals(this.name, item.name);
  }
}
