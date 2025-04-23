//------------------------------------------------------
// Assignment (1)
// Written by: (Rayan Ansari 2174698)
// For SES350 Section (631) – Spring 2025
//Purpose:  the purpose is to show  the edges and the rows.

package org.example;
public class MatrixOutlinePrinter implements MatrixPrinter {
//gives a string the shows the outer edges fo the matrix
    @Override public String print(Matrix m) {
        StringBuilder sb = new StringBuilder();
        int r = m.rowCount(), c = m.colCount();
        sb.append(edges(c)).append('\n');
        for (int i = 0; i < r; i++)
            sb.append('|').append(printRow(i, m)).append("|\n");
        sb.append(edges(c));
        return sb.toString();
    }

    // creates the edges with plueses and minuses
    private String edges(int cols) { return "+" + "-".repeat(cols) + "+"; }

    protected String printRow(int row, Matrix m) {
        return " ".repeat(m.colCount());
    }
}
