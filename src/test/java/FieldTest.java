import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FieldTest {
    @Test
    public void printField() throws Exception {
        assertEquals("*", new Field("*").print());
    }
}
