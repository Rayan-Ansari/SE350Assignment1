import static org.junit.Assert.*;

import org.example.Matrix;
import org.junit.Test;

public class MatrixTest {
    @Test(expected = IllegalArgumentException.class)
    public void constructorRejectsZeroRows() {
        new Matrix(0, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorRejectsZeroCols() {
        new Matrix(5, 0);
    }

    @Test
    public void dimensionsAreReportedCorrectly() {
        Matrix m = new Matrix(3, 4);
        assertEquals(3, m.rowCount());
        assertEquals(4, m.colCount());
    }
}
