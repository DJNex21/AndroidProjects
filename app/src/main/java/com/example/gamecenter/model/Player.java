package com.example.gamecenter.model;

public class Player {
    String playerName;
    int playerPnts;

    public Player() {

    }

    public Player(String playerName, int playerPnts) {
        this.playerName = playerName;
        this.playerPnts = playerPnts;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerPnts() {
        return playerPnts;
    }

    public void setPlayerPnts(int playerPnts) {
        this.playerPnts = playerPnts;
    }
}
