//------------------------------------------------------
// Assignment (1)
// Written by: (Rayan Ansari 2174698)
// For SES350 Section (631) – Spring 2025
//Purpose:  the purpose is to implement a Matrix class using a 2d array
package org.example;
public class Matrix {
    /** storage for ints */
    private int[][] data;


    public Matrix(int rows, int cols) {
        if (rows < 1 || cols < 1) {
            // We make sure that every matrix has one row and one column.
            throw new IllegalArgumentException("Matrix dimensions must be ≥ 1: got " + rows + "×" + cols);
        }
        this.data = new int[rows][cols];
    }

    /**
     * we make a matrix  from a 2d array
     *
     */
    public Matrix(int[][] array) {
        if (array == null || array.length == 0 || array[0].length == 0) {
            throw new IllegalArgumentException("array should not be null");
        }
        this.data = array;
    }


    public int[][] getData() {
        return data;
    }


    public void setData(int[][] newData) {
        // Could add checks here if needed (e.g., dimensions match).
        this.data = newData;
    }

    // retuyrns the number of  rows in the matrix
    public int rowCount() {
        return data.length;
    }

    // returns the number of columns  in the matrix
    public int colCount() {
        return data[0].length;
    }
}
