package cw1013_WordTransformer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransformTest {
    @Test
    public void transform2_StringLength2_updatedString() {
        assertEquals("xx", Main.transform2("XX"));
    }

    @Test
    public void transform2_StringLengthLess2_baseString() {
        assertEquals("xxx", Main.transform2("xxx"));
    }

    @Test
    public void transform2_StringLengthMore2_baseString() {
        assertEquals("xxxxx", Main.transform2("xxxxx"));
    }

    @Test
    public void transform3_StringLength3_updatedString() {
        assertEquals("XXX", Main.transform3("xxx"));
    }

    @Test
    public void transform3_StringLengthLess3_baseString() {
        assertEquals("xx", Main.transform3("xx"));
    }

    @Test
    public void transform3_StringLengthMore3_baseString() {
        assertEquals("xxxx", Main.transform3("xxxx"));
    }

    @Test
    public void transform5_StringLength5_updatedString() {
        assertEquals("*****", Main.transform5("xxxxx"));
    }

    @Test
    public void transform5_StringLengthLess5_baseString() {
        assertEquals("xxxx", Main.transform5("xxxx"));
    }

    @Test
    public void transform5_StringLengthMore5_baseString() {
        assertEquals("xxxxxx", Main.transform5("xxxxxx"));
    }
}