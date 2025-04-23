//------------------------------------------------------
// Assignment (1)
// Written by: (Rayan Ansari 2174698)
// For SES350 Section (631) – Spring 2025
//Purpose:  the purpose is to implement the gameoflife class with the use of shape and figuiring out how the games works
package org.example;

public class GameOfLife extends Matrix {

    public GameOfLife(int rows,int cols){ super(rows,cols); }
/**creates a shape into the feield following all constraints and throws illegal argument if noit in bounds*/
    public void addShape(Shape s,int r0,int c0){
        int[][] f=getData(),p=s.getData();

        if(r0<0||c0<0||r0+p.length>rowCount()||c0+p[0].length>colCount())
            throw new IllegalArgumentException("the shape is not in the bounds");
        for(int r=0;r<p.length;r++)
            System.arraycopy(p[r],0,f[r0+r],c0,p[r].length);
    }
/**looks at every cell counts all neighbors and decides whether the cell should be alive or dead just like the game*/
    public void step(){

        int R=rowCount(),C=colCount();
        int[][] cur=getData(),next=new int[R][C];
        for(int r=0;r<R;r++)
            for(int c=0;c<C;c++){
                int live=0;
                for(int dr=-1;dr<=1;dr++)
                    for(int dc=-1;dc<=1;dc++)
                        if(!(dr==0&&dc==0)&&inside(r+dr,c+dc,R,C))
                            live+=cur[r+dr][c+dc];
                next[r][c]=cur[r][c]==1?(live==2||live==3?1:0):(live==3?1:0);
            }
        setData(next);
    }
    /**sees whether the row or column is inside the board*/
    private boolean inside(int r,int c,int R,int C){return r>=0&&c>=0&&r<R&&c<C;}
    /**implemenets the glider and blinker as well as uses a for loop to print every game state.*/
    public static void main(String[] args) throws InterruptedException {
        System.out.println("The game of life game\n");

        GameOfLife game = new GameOfLife(20, 40);
        game.addShape(Shape.blinker(), 5, 5);   // oscillator
        game.addShape(Shape.glider(),  10, 10); // moving pattern

        BoolMatrixPrinter printer = new BoolMatrixPrinter();

        for (int gen = 0; gen < 20; gen++) {
            System.out.printf("Generation %d:%n%s%n%n", gen, printer.print(game));
            game.step();
            Thread.sleep(250);
        }
        System.out.println("Simulation finished.");
    }
}

