class StrikerTeam extends Team {
    @Override
    public Player createPlayer() {
        return new Striker();
    }
}
