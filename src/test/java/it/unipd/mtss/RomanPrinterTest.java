////////////////////////////////////////////////////////////////////
// [CATERINA] [VALLOTTO] [2076434]
// [VICTORIA] [DURNEA] [2076324]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;
import static org.junit.Assert.*;
import org.junit.Test;

public class RomanPrinterTest {

    @Test
     public void testPrint1to3(){

        assertEquals(" _____ \n" + "|_   _|\n" + "  | |  \n" + "  | |  \n" + " _| |_ \n" + "|_____|\n", RomanPrinter.print(1));
        assertEquals("Numero non valido", RomanPrinter.print(0));

    }
}
