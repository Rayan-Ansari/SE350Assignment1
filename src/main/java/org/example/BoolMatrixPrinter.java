//------------------------------------------------------
// Assignment (1)
// Written by: (Rayan Ansari 2174698)
// For SES350 Section (631) – Spring 2025
//Purpose:  the purpose is to show how the gameoflife is changing while makiung sure only boolean matrix are  passing through
package org.example;
public class BoolMatrixPrinter extends MatrixOutlinePrinter {

    /**prints a matrix where the value is either 0 or 1.*/
    @Override protected String printRow(int row, Matrix m) {
        StringBuilder sb = new StringBuilder();
        for (int v : m.getData()[row]) {
            if (v != 0 && v != 1)
                throw new IllegalArgumentException("matrix has to have values of 0 or 1");
            sb.append(v == 1 ? '█' : ' ');
        }
        return sb.toString();
    }
}
