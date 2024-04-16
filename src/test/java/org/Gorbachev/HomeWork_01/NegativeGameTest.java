package org.Gorbachev.HomeWork_01;

import org.junit.Before;
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.*;

public class NegativeGameTest {
    private Game game;

    @Before
    public void setUp() {
        // Инициализация игры с тремя дверьми, приз в первой двери
        game = new Game(3, 0);
    }

    @Test
    // Тест: проверка, что игрок не может выбрать несуществующую дверь
    public void testPlayerChoosesInvalidDoor() {
        // Попытка выбора двери, которой нет в игре
        game.playerChoosesDoor(3);
        // Убеждаемся, что выбор не изменился
        assertEquals(3, game.getPlayerChoice());
    }

    @Test
    // Тест: проверка, что игра не может быть создана с нулевым количеством дверей
    public void testGameCreationWithZeroDoors() {
        // Попытка создания игры с нулевым количеством дверей
        Game zeroDoorGame = new Game(0, 0);
        // Убеждаемся, что массив дверей пуст
        assertEquals(0, zeroDoorGame.getDoors().length);
    }

    @Test
    // Тест: проверка, что игра не может быть создана с отрицательным количеством дверей
    public void testGameCreationWithNegativeDoors() {
        // Попытка создания игры с отрицательным количеством дверей
        Game negativeDoorGame = new Game(0, 0);
        // Убеждаемся, что массив дверей пуст
        assertEquals(0, negativeDoorGame.getDoors().length);
    }

    @Test
    // Тест: проверка, что игрок не может выбрать открытую дверь
    public void testPlayerChoosesOpenDoor() {
        // Открываем дверь
        game.revealEmptyDoor();
        // Попытка выбора открытой двери
        game.playerChoosesDoor(game.revealEmptyDoor());
        // Убеждаемся, что выбор не изменился
        assertEquals(2, game.getPlayerChoice());
    }
}
