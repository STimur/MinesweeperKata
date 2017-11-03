public class Cell {
    private boolean isMine = false;
    private int minesAround = 0;

    public Cell(char c) {
        isMine = (c == '*');
    }

    public String toString() {
        if (isMine)
            return "*";
        return String.valueOf(minesAround);
    }

    public void addNeighbour(Cell cell) {
        if (cell.isMine)
            minesAround++;
    }
}
