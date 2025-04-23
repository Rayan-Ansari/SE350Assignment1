//------------------------------------------------------
// Assignment (1)
// Written by: (Rayan Ansari 2174698)
// For SES350 Section (631) – Spring 2025
//Purpose:  the purpose is to test the printed matrix whether it follows the constarints of rows and colums as well as if it matches the string result.
package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MatrixPrinterTest {

    @Test void outlineSize() {
        Matrix m = new Matrix(3,4);
        String expected = """
                +----+
                |    |
                |    |
                |    |
                +----+""";
        assertEquals(expected, new MatrixOutlinePrinter().print(m));
    }

    @Test void boolRejectsNonBinary() {
        Matrix bad = new Matrix(new int[][]{{2}});
        assertThrows(IllegalArgumentException.class, () -> new BoolMatrixPrinter().print(bad));
    }
}
