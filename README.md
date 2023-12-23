## Выполнял
**ФИ:** Зинченко Иван

**ИСУ:** 408657

**Вариант:** 528475

## Задание

> У Карлсона дрогнули губы, и он надулся. Он сделал шаг к плите и взял со сковородки одну тефтельку. Вот этого ему не следовало делать. Фрекен Бок взревела от бешенства и кинулась на Карлсона, схватила его за шиворот и вытолкнула за дверь. 

## Вывод программы

```
Кралсон дрогнул губой
Кралсон надулся
Он сделал шаг к плита
Кралсон взял одну тефтелька из сковородка
Вот этого ему не следовало делать
Фрекен Бок взревела от бешенства
Она кинулась к Кралсон
Она схватила Кралсон за шиворот
Она вытолкнула Кралсон за дверь
```

## Структура проекта
```mermaid
graph TD;
    Entity-->Character;
    Character-->FenBok;
    Character-->Karlson;
    Entity-->Item;
    Item-->Container;
```
Главный абстрактный класс - Entity, который имеет только имя. От него наследуются предметы и персонажи. Персонажи могут чувствовать *(IFeelabe)*, двигаться *(IMovable)* и брать вещи *(ITakeable)*. Также персонажи имеют гендер *(enum Feels)*.

За историю отвечает класс *StoryTeller*. Он меняет состояние персонажей и отображает их состояние.

## UML Диаграмма
```mermaid
classDiagram
class Entity {
  # String name
  + getName() String
}
class Character {
  # Item itemInHand
  # Feels feel
  - String currentState
  - Gender gender
  - Entity position
  + setFeel(Feels)* void
  + moveTo(Entity)* void
  + grab(Item)* void
  + getItemInHand() Item
  + getPosition() Entity
  + getGender() String
  + getState() String
  # setState(String) void
  # setPosition(Entity) void
}
class FrenBok {
  - IGrabbable characterInHand
  + grabCharacter(IGrabbable) void
  + setFeel(Feels) void
  + moveTo(Entity) void
  + grab(Item) void
  + pushCharacterBehindItem(Item) void
}
class Karlson {
  + grab(Item) void
  + setFeel(Feels) void
  + moveTo(Entity) void
  + grabFrom(Container) void
  + getGrabbablePart() String
}

class Item {
  - Character owner
  + getOwner() Character
  + setOwner(Character) void
}
class Container {
  - Item innerItem
  + getInnerItem() Item
}

class Feels {
<<enumeration>>
  +  SAD
  +  ANGRY
  +  SCARY
  +  RAGE
  +  NORMAL
  - String feel
  + values() Feels[]
  + toString() String
  + valueOf(String) Feels
}

class Gender {
<<enumeration>>
  - String gender
  +  MAN
  +  WOMAN
  + valueOf(String) Gender
  + toString() String
  + values() Gender[]
}

class StoryTeller {
  - Item door
  - Item meatball
  - Container fryingPan
  - FrenBok frenBok
  - Karlson karlson
  - Item kitchenHob
  + play() void
}

class ICanTake {
    <<interface>>
    + grab(Item) void
}

class IMovable {
    <<interface>>
    + moveTo(Entity) void
}

class IFeelable {
    <<interface>>
    + setFeel(Feels) void
}

class IGrabbable {
    <<interface>>
    + getGrabbablePart() String
}

IGrabbable --|> IMovable

Character  --|>  Entity 
Container  --|>  Item 
FrenBok  --|>  Character 
Item  --|>  Entity 
Karlson  --|>  Character 

Character ..|> IFeelable
Character ..|> IMovable
Character ..|> ICanTake
Karlson ..|> IGrabbable

Character --> Feels
Character --> Gender
```