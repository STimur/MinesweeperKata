public class Cell {
    private boolean isMine = false;
    private int minesAround = 0;

    public Cell(String str) {
        isMine = str.equals("*");
    }

    public String print() {
        if (isMine)
            return "*";
        return String.valueOf(minesAround);
    }

    public void addNeighbour(Cell cell) {
        if (cell.isMine)
            minesAround++;
    }
}
