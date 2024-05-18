////////////////////////////////////////////////////////////////////
// [CATERINA] [VALLOTTO] [2076434]
// [VICTORIA] [DURNEA] [2076324]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerToRomanTest {

    @Test
    public void testConvert1to10() {
        assertEquals("V", IntegerToRoman.convert(5));
        assertEquals("VII", IntegerToRoman.convert(7));
        assertEquals("IX", IntegerToRoman.convert(9));
        assertEquals("X", IntegerToRoman.convert(10));
        assertEquals("XI", IntegerToRoman.convert(11));
        assertEquals("XVI", IntegerToRoman.convert(16));
        assertEquals("XXI", IntegerToRoman.convert(21));
        assertEquals("XXIV", IntegerToRoman.convert(24));
        assertEquals("XXIX", IntegerToRoman.convert(29));
        assertEquals("XXX", IntegerToRoman.convert(30));
        assertEquals("XL", IntegerToRoman.convert(40));
        assertEquals("XLIX", IntegerToRoman.convert(49));
        assertEquals("L", IntegerToRoman.convert(50));
        assertEquals("Numero non valido", IntegerToRoman.convert(51));
        assertEquals("Numero non valido", IntegerToRoman.convert(0));
    }
}
