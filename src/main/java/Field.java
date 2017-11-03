public class Field {
    private final Cell[] cells;

    public Field(String str) {
        int l = str.length();
        cells = new Cell[l];
        for (int i = 0; i < l; i++)
            cells[i] = new Cell(String.valueOf(str.charAt(i)));
    }

    public String print() {
        String str = "";
        for (Cell c : cells)
            str += c.print();
        return str;
    }
}
