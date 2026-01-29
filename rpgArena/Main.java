package general_practice.rpgArena;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static List<Character> generateParty(int n) {
        List<Character> party = new ArrayList<>();
        if (n < 1) return party;

        String[] names = {"Herbert", "Hercules", "Tony", "Mike", "Dennis", "Minos Prime"};

        for (int i = 0; i < n; i++) {
            int r = (int) (Math.random() * 6);
            party.add(new Character(names[r], 100));
        }

        return party;
    }
    public static void main(String[] args) {
        List<Character> party = generateParty(20);
        Arena newArena = new Arena(party);
        System.out.println(newArena);
        System.out.println(newArena.getChampion(party));
    }
}