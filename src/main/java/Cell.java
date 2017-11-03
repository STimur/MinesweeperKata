public class Cell {
    private final boolean isMine;

    public Cell(String str) {
        isMine = str.equals("*");
    }

    public String print() {
        if (isMine)
            return "*";
        return "0";
    }
}
