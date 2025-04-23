import org.example.Matrix;
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
