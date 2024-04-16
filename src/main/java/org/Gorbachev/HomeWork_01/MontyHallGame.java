package org.Gorbachev.HomeWork_01;

public class MontyHallGame {

    public static void main(String[] args) {
        int numGames = 1000;
        Player player = new Player(1);

        // Предположим, что приз всегда находится за дверью с индексом 0
        int prizeDoorIndex = 0;

        for (int i = 0; i < numGames; i++) {
            Game game = new Game(3, prizeDoorIndex); // Создаем новую игру с указанным индексом двери с призом
            int playerChoice = (int) (Math.random() * 3); // Player randomly chooses a door
            game.playerChoosesDoor(playerChoice);

            // Monty Hall reveals an empty door
            int emptyDoor = game.revealEmptyDoor();

            // Player switches doors
            game.playerSwitchesDoor();

            // Check if player wins
            if (game.isPlayerWinner()) {
                player.incrementWins();
            }
        }

        System.out.println("Out of " + numGames + " games, the total wins: " + player.getWins());
    }
}
