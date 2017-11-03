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
    }
}
