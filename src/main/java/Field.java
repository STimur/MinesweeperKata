public class Field {
    private final Cell[] cells;
    private final int l;

    public Field(String str) {
        l = str.length();
        cells = new Cell[l];
        for (int i = 0; i < l; i++)
            cells[i] = new Cell(str.charAt(i));
        addNeighbours();
    }

    public String toString() {
        String str = "";
        for (Cell c : cells)
            str += c.toString();
        return str;
    }

    private void addNeighbours() {
        for (int x = 0; x < l; x++) {
            addLeftNeighbourForCell(x);
            addRightNeighbourForCell(x);
        }
    }

    private void addRightNeighbourForCell(int x) {
        if (x - 1 >= 0)
            cells[x].addNeighbour(cells[x - 1]);
    }

    private void addLeftNeighbourForCell(int x) {
        if (x + 1 < l)
            cells[x].addNeighbour(cells[x + 1]);
    }
}
