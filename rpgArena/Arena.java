package general_practice.rpgArena;
import java.util.List;

public class Arena {
    private List<Character> party;

    public Arena(List<Character> p) {
        this.party = p;
    }

    public void printStatus() {
        if (this.party == null) return;

        for (Character c : this.party) {
            System.out.println(c);

            if (c instanceof Warrior) {
                System.out.println("-> STARK: " + c.getName());
            } else if(c instanceof Mage) {
                Mage m = (Mage) c;
                if (m.getMana() < 10) {
                    System.out.println(String.format("-> WARNING: %s is exhausted! (Mana: %d)", m.getName(), m.getMana()));
                }
            }
        }
    }

    public Character getChampion(List<Character> party) {
        if (party == null) return null;

        Character current = party.get(0);

        for (Character c : party) {
            int health = (c instanceof Warrior) ? c.getHealth() * 2 : c.getHealth();
            current = (health > current.getHealth()) ? c : current;
        }

        return current;
    }

    public String toString() {
        StringBuilder res = new StringBuilder("Arena Status:\n");
        for (Character c : party) {
            res.append(" - ").append(c).append("\n");
        }
        return res.toString();
    }
}