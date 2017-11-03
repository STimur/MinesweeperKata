import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CellTest {
    @Test
    public void printCellWithMine() throws Exception {
        assertEquals("*", new Cell("*").print());
    }
}
