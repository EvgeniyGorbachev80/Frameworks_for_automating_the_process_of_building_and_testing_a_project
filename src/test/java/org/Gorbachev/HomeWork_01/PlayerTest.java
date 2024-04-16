package org.Gorbachev.HomeWork_01;

import static org.junit.Assert.*;
import org.junit.Test;

// Класс для тестирования функциональности класса Player
public class PlayerTest {
    // Тест для проверки, что номер игрока корректно инициализируется
    @Test
    public void testPlayerNumberInitialization() {
        int playerNumber = 1;
        Player player = new Player(playerNumber);
        assertEquals(playerNumber, player.getPlayerNumber());
    }

    // Тест для проверки, что количество побед игрока инициализируется как 0
    @Test
    public void testWinsInitialization() {
        Player player = new Player(1);
        assertEquals(0, player.getWins());
    }

    // Тест для проверки, что метод incrementWins() увеличивает количество побед на 1
    @Test
    public void testIncrementWins() {
        Player player = new Player(1);
        player.incrementWins();
        assertEquals(1, player.getWins());
    }
}
