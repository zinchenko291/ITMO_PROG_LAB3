package StoryTeller;

import Characters.Character;
import Characters.Feels;
import Characters.FrenBok;
import Characters.Karlson;
import Entity.*;
import Items.Container;
import Items.Item;
import Items.SmallItem;

import java.util.function.Function;

public class StoryTeller {
  // Персонажи
  private final Karlson karlson = new Karlson();
  private final FrenBok frenBok = new FrenBok();

  // Предметы
  private final Item kitchenHob = new Item("плита");
  private final SmallItem meatball = new SmallItem("тефтелька");
  private final Container fryingPan = new Container("сковородка", meatball, frenBok);
  private final Item door = new Item("дверь");

  public void play() {
    karlson.setFeel(Feels.SCARY);
    System.out.println(karlson);
    karlson.setFeel(Feels.SAD);
    System.out.println(karlson);
    karlson.moveTo(kitchenHob);
    System.out.println(karlson);
    karlson.grabFrom(fryingPan);
    System.out.println(karlson);
    if (fryingPan.getOwner() == frenBok) {
      System.out.println("Вот этого ему не следовало делать");
      frenBok.setFeel(Feels.RAGE);
      System.out.println(frenBok);
      frenBok.moveTo(karlson);
      System.out.println(frenBok);
      frenBok.grabCharacter(karlson);
      System.out.println(frenBok);
      frenBok.pushCharacterBehindItem(door);
      System.out.println(frenBok);
    } else {
      frenBok.setFeel(Feels.NORMAL);
      System.out.println(frenBok);
    }
  }
}
