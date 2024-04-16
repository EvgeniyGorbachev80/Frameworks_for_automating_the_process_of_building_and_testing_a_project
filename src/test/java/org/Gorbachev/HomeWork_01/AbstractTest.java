package org.Gorbachev.HomeWork_01;

import org.junit.jupiter.api.BeforeEach;

public abstract class AbstractTest {
    static Game game;

    @BeforeEach
    void setUp() {
        // Создаем новую игру перед каждым тестом.
        // В этом примере предполагаем, что приз всегда находится за дверью с индексом 0.
        game = new Game(3, 0);
    }
}
