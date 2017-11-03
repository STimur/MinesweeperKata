import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FieldTest {
    @Test
    public void printField() throws Exception {
        assertEquals("*", new Field("*").toString());
        assertEquals("0", new Field(".").toString());
        assertEquals("**", new Field("**").toString());
        assertEquals("*1", new Field("*.").toString());
        assertEquals("1*", new Field(".*").toString());
        assertEquals("1*1", new Field(".*.").toString());
        assertEquals("*\n*", new Field("*\n*").toString());
        assertEquals("*\n1", new Field("*\n.").toString());
        assertEquals("1\n*", new Field(".\n*").toString());
        assertEquals("*1\n11", new Field("*.\n..").toString());
        assertEquals("1*\n11", new Field(".*\n..").toString());
        assertEquals("11\n*1", new Field("..\n*.").toString());
        assertEquals("11\n1*", new Field("..\n.*").toString());
    }
}
