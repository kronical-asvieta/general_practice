package general_practice.teamBuilder;

public class Team {
    private String trainer;
    private String player;

    public Team(String t, String p) {
        this.trainer = t;
        this.player = p;
    }

    public String toString() {
        return "[T: " + this.trainer + ", P: " + player + " ]";
    }
}