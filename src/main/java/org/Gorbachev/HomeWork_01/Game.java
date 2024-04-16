package org.Gorbachev.HomeWork_01;

public class Game {

    private Door[] doors;
    private int playerChoice;

    public Game(int numDoors, int prizeDoorIndex) {
        doors = new Door[numDoors];
        for (int i = 0; i < numDoors; i++) {
            doors[i] = new Door(i == prizeDoorIndex);
        }
    }

    public void playerChoosesDoor(int doorIndex) {
        playerChoice = doorIndex;
    }

    public int revealEmptyDoor() {
        for (int i = 0; i < doors.length; i++) {
            if (i != playerChoice && !doors[i].hasPrize() && !doors[i].isOpen()) {
                doors[i].setOpen(true);
                return i;
            }
        }
        return -1; // No empty door found
    }

    public boolean playerSwitchesDoor() {
        for (int i = 0; i < doors.length; i++) {
            if (i != playerChoice && !doors[i].isOpen()) {
                playerChoice = i;
                return true;
            }
        }
        return false; // Couldn't switch door
    }

    public boolean isPlayerWinner() {
        return doors[playerChoice].hasPrize();
    }

    public Door[] getDoors() {
        return doors;
    }

    public int getPlayerChoice() {
        return playerChoice;
    }
}
