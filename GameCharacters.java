public class GameCharacters {
    public static void main(String[] args) {

        GameCharacter[] characters = {
            new Warrior("Stark"),
            new Archer("Ashitaka", 5),
            new Mage("Frieren", 100)
        };

        for (GameCharacter character : characters) {
            character.attack();
        }
    }
}

abstract class GameCharacter {
    private String name;

    public GameCharacter(String name) {
        this.name = name;
    }

    public abstract void attack();

    public String getName() {
        return name;
    }
}

class Warrior extends GameCharacter {

    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("Warrior: " + getName());
        System.out.println("Weapon: Double-headed axe");
        System.out.println(getName() + " deals 25 melee damage.");
        System.out.println();
    }
}

class Archer extends GameCharacter {
    private int arrowCount;

    public Archer(String name, int arrowCount) {
        super(name);
        this.arrowCount = arrowCount;
    }

    @Override
    public void attack() {
        System.out.println("Archer: " + getName());
        System.out.println("Arrows left: " + arrowCount);

        if (arrowCount > 0) {
            arrowCount--;
            System.out.println(getName() + " shoots an arrow!");
        } else {
            System.out.println(getName() + " has no arrows left!");
        }

        System.out.println();
    }
}

class Mage extends GameCharacter {
    private int mana;

    public Mage(String name, int mana) {
        super(name);
        this.mana = mana;
    }

    @Override
    public void attack() {
        System.out.println("Mage: " + getName());
        System.out.println("Mana: " + mana + "%");

        if (mana >= 10) {
            mana -= 10;
            System.out.println(getName() + " casts a spell!");
        } else {
            System.out.println(getName() + " is out of mana!");
        }

        System.out.println("Remaining Mana: " + mana + "%");
        System.out.println();
    }
}