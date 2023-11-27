import Characters.FrenBok;
import Characters.Karlson;
import Items.Container;
import Items.Item;

public class Main {
  public static void main(String[] args) {
    // Персонажи
    Karlson karlson = new Karlson();
    FrenBok frenBok = new FrenBok();

    // Предметы
    Item kitchenHob = new Item("плита");
    Item meatball = new Item("тефтелька");
    Container fryingPan = new Container("сковородка", meatball);
    Item door = new Item("дверь");

    System.out.println(karlson.feel() + '.');
    System.out.println(karlson.moveTo(kitchenHob) + '.');
    System.out.println(karlson.grabFrom(fryingPan) + '.');
    System.out.println("Вот этого ему не следовало делать.");
    System.out.println(frenBok.feel() + '.');
    System.out.println(frenBok.moveTo(karlson) + '.');
    System.out.println(frenBok.grabCharacter(karlson) + '.');
    System.out.println(frenBok.pushCharacterBehindItem(karlson, door) + '.');
  }
}