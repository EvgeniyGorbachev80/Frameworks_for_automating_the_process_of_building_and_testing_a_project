package org.Gorbachev.HomeWork_01;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.provider.ValueSource;


public class ParametrizedTest {
    @ParameterizedTest
    @CsvSource({"3, 0", "5, 2", "10, 5"})
    @Disabled
    public void testGameWithSwitch(int numDoors, int prizeDoorIndex) {
        Game game = new Game(numDoors, prizeDoorIndex);
        game.playerChoosesDoor(0);
        game.revealEmptyDoor();
        game.playerSwitchesDoor();
        assertEquals(game.isPlayerWinner(), prizeDoorIndex != 0);
    }

    @ParameterizedTest
    @CsvSource({"3, 0", "5, 2", "10, 5"})
    public void testGameWithoutSwitch(int numDoors, int prizeDoorIndex) {
        Game game = new Game(numDoors, prizeDoorIndex);
        game.playerChoosesDoor(0);
        game.revealEmptyDoor();
        assertEquals(game.isPlayerWinner(), prizeDoorIndex == 0);
    }

    // Пример параметризированного теста с использованием @ValueSource
    @ParameterizedTest
    @ValueSource(ints = {3, 5, 10})
    public void testGameWithValueSource(int numDoors) {
        // Создание экземпляра игры и выполнение тестовых действий
    }
//
    // Пример параметризированного теста с использованием @CsvSource
    @ParameterizedTest
    @CsvSource({"3, 0", "5, 2", "10, 5"})
    public void testGameWithCsvSource(int numDoors, int prizeDoorIndex) {
        // Создание экземпляра игры и выполнение тестовых действий
    }
}
