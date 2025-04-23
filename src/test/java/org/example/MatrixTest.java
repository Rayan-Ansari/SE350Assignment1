//------------------------------------------------------
// Assignment (1)
// Written by: (Rayan Ansari 2174698)
// For SES350 Section (631) – Spring 2025
//purpose is to check and see whether the matrix reports illegal arguaments and if it returms the expected rows and columns.
package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    @Test
    void constructorRejectsZeroRows() {
        assertThrows(IllegalArgumentException.class, () -> new Matrix(0, 5));
    }
    @Test
    void constructorRejectsZeroCols() {
        assertThrows(IllegalArgumentException.class, () -> new Matrix(5, 0));
    }
    @Test
    void dimensionsAreReportedCorrectly() {
        Matrix m = new Matrix(3, 4);
        assertEquals(3, m.rowCount());
        assertEquals(4, m.colCount());
    }
}
