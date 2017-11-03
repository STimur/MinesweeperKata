import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CellTest {
    @Test
    public void printCellWithMine() throws Exception {
        assertEquals("*", new Cell('*').toString());
    }

    @Test
    public void printCellWithoutMine() throws Exception {
        assertEquals("0", new Cell('.').toString());
    }

    @Test
    public void printCellWithMineNeighbour() throws Exception {
        Cell cell = new Cell('.');
        cell.addNeighbour(new Cell('*'));
        assertEquals("1", cell.toString());
    }
}
