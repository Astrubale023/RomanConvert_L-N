package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.*;
        import java.security.InvalidParameterException;

public class IntegerToRomanTest {

    @Test
    public void convert1Test() {
        // Arrange
        int num = 1;

        // Act
        String roman = IntegerToRoman.convert(num);

        // Assert
        assertEquals("I", roman);
    }

    @Test
    public void convert6Test() {
        int num = 6;

        String roman = IntegerToRoman.convert(num);

        assertEquals("VI", roman);
    }

    @Test
    public void convert9Test() {
        int num = 9;

        String roman = IntegerToRoman.convert(num);

        assertEquals("IX", roman);
    }

    @Test
    public void convert27Test() {
        int num = 27;

        String roman = IntegerToRoman.convert(num);

        assertEquals("XXVII", roman);
    }

    @Test
    public void convert34Test() {
        int num = 34;

        String roman = IntegerToRoman.convert(num);

        assertEquals("XXXIV", roman);
    }

    @Test
    public void convert116Test() {
        int num = 116;

        String roman = IntegerToRoman.convert(num);

        assertEquals("CXVI", roman);
    }

    @Test
    public void convert353Test() {
        int num = 353;

        String roman = IntegerToRoman.convert(num);

        assertEquals("CCCLIII", roman);
    }

    @Test
    public void convert865Test() {
        int num = 865;

        String roman = IntegerToRoman.convert(num);

        assertEquals("DCCCLXV", roman);
    }

    @Test(expected = InvalidParameterException.class)
    public void testConvertFailOnZero() {
        int num = 0;

        String result = IntegerToRoman.convert(num);

        fail();
    }

    @Test(expected = InvalidParameterException.class)
    public void testConvertFailOnNegativeNumber() {
        int num = -100;

        String result = IntegerToRoman.convert(num);

        fail();
    }

    @Test(expected = NullPointerException.class)
    public void testConvertFailOnNullNumber() {
        Integer num = null;

        String result = IntegerToRoman.convert(num);

        fail();
    }
}