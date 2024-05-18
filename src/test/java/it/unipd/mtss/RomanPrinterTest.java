////////////////////////////////////////////////////////////////////
// [CATERINA] [VALLOTTO] [2076434]
// [VICTORIA] [DURNEA] [2076324]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;
import static org.junit.Assert.*;
import org.junit.Test;

public class RomanPrinterTest {

    @Test
     public void testPrint1to10(){

        assertEquals(" _____ \n" + "|_   _|\n" + "  | |  \n" + "  | |  \n" + " _| |_ \n" + "|_____|\n", RomanPrinter.print(1));
        assertEquals("__      __\n" + "\\ \\    / /\n" + " \\ \\  / / \n" + "  \\ \\/ /  \n" + "   \\  /   \n" + "    \\/    \n", RomanPrinter.print(5));
        assertEquals("__      __ _____ \n" + "\\ \\    / /|_   _|\n" + " \\ \\  / /   | |  \n" + "  \\ \\/ /    | |  \n" + "   \\  /    _| |_ \n" + "    \\/    |_____|\n", RomanPrinter.print(6));
        assertEquals("__      __ _____  _____  _____ \n" + "\\ \\    / /|_   _||_   _||_   _|\n" + " \\ \\  / /   | |    | |    | |  \n" + "  \\ \\/ /    | |    | |    | |  \n" + "   \\  /    _| |_  _| |_  _| |_ \n" + "    \\/    |_____||_____||_____|\n", RomanPrinter.print(8));
        assertEquals(" _____  __   __\n" + "|_   _| \\ \\ / /\n" + "  | |    \\ V / \n" + "  | |     > <  \n" + " _| |_   / . \\ \n" + "|_____| /_/ \\_\\\n", RomanPrinter.print(9));
        assertEquals(" __   __\n" + " \\ \\ / /\n" + "  \\ V / \n" + "   > <  \n" + "  / . \\ \n" + " /_/ \\_\\\n", RomanPrinter.print(10));
        assertEquals(" __   __ _____ __      __\n" + " \\ \\ / /|_   _|\\ \\    / /\n" + "  \\ V /   | |   \\ \\  / / \n" + "   > <    | |    \\ \\/ /  \n" + "  / . \\  _| |_    \\  /   \n" + " /_/ \\_\\|_____|    \\/    \n", RomanPrinter.print(14));
        assertEquals(" __   __ __   __\n" + " \\ \\ / / \\ \\ / /\n" + "  \\ V /   \\ V / \n" + "   > <     > <  \n" + "  / . \\   / . \\ \n" + " /_/ \\_\\ /_/ \\_\\\n", RomanPrinter.print(20));

        assertEquals("Numero non valido", RomanPrinter.print(0));
        assertEquals("Numero non valido", RomanPrinter.print(1001));

    }

}
