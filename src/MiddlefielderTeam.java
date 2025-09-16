class MiddlefielderTeam extends Team {
    @Override
    public Player createPlayer() {
        return new Middlefielder();
    }
}
