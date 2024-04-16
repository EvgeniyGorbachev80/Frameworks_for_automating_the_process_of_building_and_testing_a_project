package org.Gorbachev.HomeWork_01;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class GameTest extends AbstractTest {

    @Test
    void testPlayerWinsWithoutRisking() {
        // Given
        int playerChoice = 0; // Игрок выбирает дверь с призом
        game.playerChoosesDoor(playerChoice);

        // When
        boolean playerWins = game.isPlayerWinner();

        // Then
        Assertions.assertTrue(playerWins, "Player should win without risking");
    }

    @Test
    void testPlayerLosesWithoutRisking() {
        // Given
        int playerChoice = 1; // Игрок выбирает дверь без приза
        game.playerChoosesDoor(playerChoice);

        // When
        boolean playerWins = game.isPlayerWinner();

        // Then
        Assertions.assertFalse(playerWins, "Player should lose without risking");
    }

    @Test
    void testPlayerWinsWithRisk() {
        // Given
        int playerChoice = 1; // Игрок выбирает дверь без приза
        game.playerChoosesDoor(playerChoice);

        // When
        game.revealEmptyDoor(); // Ведущий открывает дверь без приза
        game.playerSwitchesDoor(); // Игрок меняет выбор

        // Then
        Assertions.assertTrue(game.isPlayerWinner(), "Player should win with risking");
    }

    @Test
    void testPlayerLosesWithRisk() {
        // Given
        int playerChoice = 0; // Игрок выбирает дверь с призом
        game.playerChoosesDoor(playerChoice);

        // When
        game.revealEmptyDoor(); // Ведущий открывает дверь без приза
        game.playerSwitchesDoor(); // Игрок меняет выбор

        // Then
        Assertions.assertFalse(game.isPlayerWinner(), "Player should lose with risking");
    }
}
