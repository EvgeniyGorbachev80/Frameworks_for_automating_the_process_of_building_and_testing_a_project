package org.Gorbachev.HomeWork_01;

import static org.junit.Assert.*;
import org.junit.Test;



// Класс для тестирования функциональности класса Door
public class DoorTest {
    // Тест для проверки, что дверь с призом возвращает true при вызове hasPrize()
    @Test
    public void testHasPrizeWhenConstructedWithTrue() {
        Door door = new Door(true);
        assertTrue(door.hasPrize());
    }

    // Тест для проверки, что дверь без приза возвращает false при вызове hasPrize()
    @Test
    public void testHasPrizeWhenConstructedWithFalse() {
        Door door = new Door(false);
        assertFalse(door.hasPrize());
    }

    // Тест для проверки, что дверь закрыта при создании
    @Test
    public void testIsOpenWhenConstructedWithFalse() {
        Door door = new Door(false);
        assertFalse(door.isOpen());
    }

    // Тест для проверки, что дверь открывается после вызова setOpen(true)
    @Test
    public void testSetOpen() {
        Door door = new Door(false);
        door.setOpen(true);
        assertTrue(door.isOpen());
    }
}
