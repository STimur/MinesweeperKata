import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FieldTest {
    private void assertFieldToStringEquals(String input, String expected) {
        assertEquals(expected, new Field(input).toString());
    }

    @Test
    public void fieldToString() throws Exception {
        assertFieldToStringEquals("*", "*");
        assertFieldToStringEquals(".", "0");
        assertFieldToStringEquals("**", "**");
        assertFieldToStringEquals("*.", "*1");
        assertFieldToStringEquals(".*", "1*");
        assertFieldToStringEquals(".*.", "1*1");
        assertFieldToStringEquals("*\n*", "*\n*");
        assertFieldToStringEquals("*\n.", "*\n1");
        assertFieldToStringEquals(".\n*", "1\n*");
        assertFieldToStringEquals("*.\n..", "*1\n11");
        assertFieldToStringEquals(".*\n..", "1*\n11");
        assertFieldToStringEquals("..\n*.", "11\n*1");
        assertFieldToStringEquals("..\n.*", "11\n1*");
    }
}
