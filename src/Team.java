abstract class Team {
    public abstract Player createPlayer();

    public void startMatch() {
        Player player = createPlayer();
        player.play();
    }
}
