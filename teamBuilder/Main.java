package general_practice.teamBuilder;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static List<Team> teamBuilder(List<String> trainers, List<String> players) {
        List<Team> teams = new ArrayList<>();

        if (trainers == null || players == null) return teams;

        for (String t : trainers) {
            for (String p : players) {
                teams.add(new Team(t, p));
            }
        }

        return teams;
    }
    
    public static void main(String[] args) {
        System.out.println("arh");
    }
}