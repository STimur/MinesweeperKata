import org.junit.Test;

import java.awt.print.PrinterJob;

import static org.junit.Assert.assertEquals;

public class CellTest {
    @Test
    public void printCellWithMine() throws Exception {
        assertEquals("*", new Cell("*").print());
    }

    @Test
    public void printCellWithoutMine() throws Exception {
        assertEquals("0", new Cell(".").print());
    }

    @Test
    public void printCellWithoutMineWithOneMineNeighbour() throws Exception {
        Cell cell = new Cell(".");
        Cell cellWithMine = new Cell("*");
        cell.addNeighbour(cellWithMine);
        assertEquals("1", cell.print());
    }
}
