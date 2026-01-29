package general_practice.rpgArena;

public class Warrior extends Character {
    private int armor;

    public Warrior(String n, int h, int a) {
        super(n, h);
        this.armor = a;
    }

    public int getArmor() {
        return this.armor;
    }

    public String toString() {
        return String.format("%s | Armor: %2d", super.toString(), armor);
    }
}