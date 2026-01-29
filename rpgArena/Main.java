package general_practice.rpgArena;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static List<Character> generateParty(int n) {
        List<Character> party = new ArrayList<>();
        if (n < 1) return party;

        String[] names = {"Herbert", "Hercules", "Tony", "Mike", "Dennis", "Minos Prime", "Lina", "Jennifer", "Ava", "Mars", "Lilly"};
        int maxArmor = 20;
        int maxMana = 50;

        for (int i = 0; i < n; i++) {
            int rN = (int) (Math.random() * names.length);
            double rC = Math.random();
            int rA = (int) (Math.random() * maxArmor);
            int rM = (int) (Math.random() * maxMana);

            if (rC > 0.7) party.add(new Character(names[rN], 100));
            if (rC > 0.3) party.add(new Warrior(names[rN], 100, rA));
            if (rC <= 0.3) party.add(new Mage(names[rN], 80, rM));
        }

        return party;
    }
    public static void main(String[] args) {
        List<Character> party = generateParty(20);
        Arena newArena = new Arena(party);
        newArena.printStatus();
        System.out.println(newArena.getChampion(party));
    }
}