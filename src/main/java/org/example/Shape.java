//------------------------------------------------------
// Assignment (1)
// Written by: (Rayan Ansari 2174698)
// For SES350 Section (631) – Spring 2025
//Purpose:  the purpose is to implement a shape class that makes shapes using the matrix
package org.example;
public final class Shape extends Matrix {
    private final String name;
/**builds a new shape*/
    public Shape(String name, int[][] pattern) {
        super(pattern);
        this.name = name;

        /** makes sure every cell is eiother 0 or 1 and to keep it simple*/
        for (int[] row : pattern)
            for (int v : row)
                if (v != 0 && v != 1)
                    throw new IllegalArgumentException("the shape has to be 0 or 1");
    }
/**creates the shape while*/
    public String getName() { return name; }
    public static Shape blinker() {
        return new Shape("Blinker", new int[][] { {1,1,1} });
    }

    public static Shape glider() {
        return new Shape("Glider", new int[][] {
                {0,1,0},
                {0,0,1},
                {1,1,1}
        });
    }

    public static Shape beehive() {
        return new Shape("Beehive", new int[][] {
                {0, 1, 1, 0},
                {1, 0, 0, 1},
                {0, 1, 1, 0}
        });
    }

    public static Shape boat() {
        return new Shape("Boat", new int[][] {
                {1, 1, 0},
                {1, 0, 1},
                {0, 1, 0}
        });
    }
    public String toString() {
        return new BoolMatrixPrinter().print(this);
    }

    /** prints the beehive and boat instances*/
    public static void showcase() {
        Shape beehive = beehive();
        Shape boat    = boat();

        System.out.println("Beehive:");
        System.out.println(beehive);

        System.out.println("\nBoat:");
        System.out.println(boat);
    }
}
