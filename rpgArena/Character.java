package general_practice.rpgArena;

public class Character {
    private String name;
    private int health;

    public Character(String n, int h) {
        this.name = n;
        this.health = h;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public String toString() {
        return String.format("%-15s | HP: %3d", name, health);
    }
}