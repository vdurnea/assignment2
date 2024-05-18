////////////////////////////////////////////////////////////////////
// [CATERINA] [VALLOTTO] [2076434]
// [VICTORIA] [DURNEA] [2076324]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerToRomanTest {

    @Test
    public void testConvert1to500() {
        assertEquals("V", IntegerToRoman.convert(5));
        assertEquals("IX", IntegerToRoman.convert(9));
        assertEquals("X", IntegerToRoman.convert(10));
        assertEquals("XI", IntegerToRoman.convert(11));
        assertEquals("XX", IntegerToRoman.convert(20));
        assertEquals("XXIV", IntegerToRoman.convert(24));
        assertEquals("XXX", IntegerToRoman.convert(30));
        assertEquals("XL", IntegerToRoman.convert(40));
        assertEquals("L", IntegerToRoman.convert(50));
        assertEquals("XC", IntegerToRoman.convert(90));
        assertEquals("C", IntegerToRoman.convert(100));
        assertEquals("CD", IntegerToRoman.convert(400));
        assertEquals("D", IntegerToRoman.convert(500));
        assertEquals("Numero non valido", IntegerToRoman.convert(501));
        assertEquals("Numero non valido", IntegerToRoman.convert(0));
    }
}
