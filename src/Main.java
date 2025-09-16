public class Main {
    public static void main(String[] args) {
        Team team;

        team = new StrikerTeam();
        team.startMatch();

        team = new MiddlefielderTeam();
        team.startMatch();

    }
}