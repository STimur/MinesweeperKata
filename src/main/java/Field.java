public class Field {
    private final Cell[] cells;

    public Field(String str) {
        int l = str.length();
        cells = new Cell[l];
        for (int i = 0; i < l; i++)
            cells[i] = new Cell(String.valueOf(str.charAt(i)));
        if (l > 1) {
            cells[0].addNeighbour(cells[1]);
            cells[1].addNeighbour(cells[0]);
        }
        if (l > 2) {
            cells[1].addNeighbour(cells[2]);
            cells[2].addNeighbour(cells[1]);
        }
    }

    public String toString() {
        String str = "";
        for (Cell c : cells)
            str += c.toString();
        return str;
    }
}
