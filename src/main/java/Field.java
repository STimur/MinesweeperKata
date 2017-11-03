public class Field {
    private final Cell[][] cells;
    private final int h;
    private final int l;

    public Field(String str) {
        String[] lines = str.split("\n");
        h = lines.length;
        l = lines[0].length();
        cells = new Cell[h][l];
        for (int row = 0; row < h; row++)
            for (int col = 0; col < l; col++)
                cells[row][col] = new Cell(lines[row].charAt(col));
        addNeighbours();
    }

    public String toString() {
        String str = "";
        for (Cell[] cs : cells) {
            for (Cell c : cs)
                str += c.toString();
            str += "\n";
        }
        return str.trim();
    }

    private void addNeighbours() {
        for (int row = 0; row < h; row++)
            for (int col = 0; col < l; col++) {
                addLeftNeighbourForCell(row, col);
                addTopNeighbourForCell(row, col);
                addRightNeighbourForCell(row, col);
            }
    }

    private void addLeftNeighbourForCell(int row, int col) {
        if (col + 1 < l)
            cells[row][col].addNeighbour(cells[row][col + 1]);
    }

    private void addTopNeighbourForCell(int row, int col) {
        if (row - 1 >= 0)
            cells[row][col].addNeighbour(cells[row-1][col]);
    }

    private void addRightNeighbourForCell(int row, int col) {
        if (col - 1 >= 0)
            cells[row][col].addNeighbour(cells[row][col - 1]);
    }
}
