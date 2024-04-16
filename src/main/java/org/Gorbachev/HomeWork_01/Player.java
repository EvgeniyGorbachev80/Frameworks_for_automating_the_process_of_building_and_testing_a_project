package org.Gorbachev.HomeWork_01;

public class Player {

    private int playerNumber;
    private int wins;

    public Player(int playerNumber) {
        this.playerNumber = playerNumber;
        this.wins = 0;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public int getWins() {
        return wins;
    }

    public void incrementWins() {
        wins++;
    }
}
