public class Field {
    private final Cell cell;

    public Field(String str) {
        cell = new Cell(str);
    }

    public String print() {
        return cell.print();
    }
}
