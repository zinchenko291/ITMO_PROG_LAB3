package StoryTeller;

import Characters.Feels;
import Characters.FrenBok;
import Characters.Karlson;
import Items.Container;
import Items.Item;

public class StoryTeller {
  // Персонажи
  private final Karlson karlson = new Karlson();
  private final FrenBok frenBok = new FrenBok();

  // Предметы
  private final Item kitchenHob = new Item("плита");
  private final Item meatball = new Item("тефтелька");
  private final Container fryingPan = new Container("сковородка", meatball, frenBok);
  private final Item door = new Item("дверь");

  public void play() {
    karlson.setFeel(Feels.SCARY);
    System.out.println(karlson.getState());
    karlson.setFeel(Feels.SAD);
    System.out.println(karlson.getState());
    karlson.moveTo(kitchenHob);
    System.out.println(karlson.getState());
    karlson.grabFrom(fryingPan);
    System.out.println(karlson.getState());
    if (fryingPan.getOwner() == frenBok) {
      System.out.println("Вот этого ему не следовало делать");
      frenBok.setFeel(Feels.RAGE);
      System.out.println(frenBok.getState());
      frenBok.moveTo(karlson);
      System.out.println(frenBok.getState());
      frenBok.grabCharacter(karlson);
      System.out.println(frenBok.getState());
      frenBok.pushCharacterBehindItem(door);
      System.out.println(frenBok.getState());
    } else {
      frenBok.setFeel(Feels.NORMAL);
      System.out.println(frenBok);
    }
  }
}
