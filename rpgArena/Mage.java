package general_practice.rpgArena;

public class Mage extends Character {
    private int mana;

    public Mage(String n, int h, int m) {
        super(n, h);
        this.mana = m;
    }

    public int getMana() {
        return this.mana;
    }

    public String toString() {
        return super.toString() + " | Mana: " + this.mana;
    }
}