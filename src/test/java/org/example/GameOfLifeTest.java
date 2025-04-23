//------------------------------------------------------
// Assignment (1)
// Written by: (Rayan Ansari 2174698)
// For SES350 Section (631) – Spring 2025
//Purpose:  the purpose is to test how the game functions using one step or after 10 steps
package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameOfLifeTest {

    @Test
    void boardMatch() {
        GameOfLife game = new GameOfLife(5, 5);
        game.addShape(Shape.blinker(), 1, 1);
        game.addShape(Shape.glider(), 0, 0);


        int[][] expected1 = {
                {0,0,1,0,0},
                {1,0,0,1,0},
                {0,1,1,1,0},
                {0,1,0,0,0},
                {0,0,0,0,0}
        };


        game.step();
        System.out.println(new BoolMatrixPrinter().print(game));
        assertArrayEquals(expected1, game.getData(),
                "Board didnt change as expected after one step");


        for (int i = 0; i < 9; i++) game.step();


        int[][] expected10 = {
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0}
        };
        System.out.println(new BoolMatrixPrinter().print(game));

        assertArrayEquals(expected10, game.getData(),
                "Board didn't change as expected after 10 steps");
    }
}