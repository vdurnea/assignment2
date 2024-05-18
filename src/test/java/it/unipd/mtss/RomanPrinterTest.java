////////////////////////////////////////////////////////////////////
// [CATERINA] [VALLOTTO] [2076434]
// [VICTORIA] [DURNEA] [2076324]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;
import static org.junit.Assert.*;
import org.junit.Test;

public class RomanPrinterTest {

    @Test
     public void testPrint1to1000(){

        assertEquals(" _____ \n" + "|_   _|\n" + "  | |  \n" + "  | |  \n" + " _| |_ \n" + "|_____|\n", RomanPrinter.print(1));
        assertEquals("__      __\n" + "\\ \\    / /\n" + " \\ \\  / / \n" + "  \\ \\/ /  \n" + "   \\  /   \n" + "    \\/    \n", RomanPrinter.print(5));
        assertEquals("__      __ _____ \n" + "\\ \\    / /|_   _|\n" + " \\ \\  / /   | |  \n" + "  \\ \\/ /    | |  \n" + "   \\  /    _| |_ \n" + "    \\/    |_____|\n", RomanPrinter.print(6));
        assertEquals("__      __ _____  _____  _____ \n" + "\\ \\    / /|_   _||_   _||_   _|\n" + " \\ \\  / /   | |    | |    | |  \n" + "  \\ \\/ /    | |    | |    | |  \n" + "   \\  /    _| |_  _| |_  _| |_ \n" + "    \\/    |_____||_____||_____|\n", RomanPrinter.print(8));
        assertEquals(" _____  __   __\n" + "|_   _| \\ \\ / /\n" + "  | |    \\ V / \n" + "  | |     > <  \n" + " _| |_   / . \\ \n" + "|_____| /_/ \\_\\\n", RomanPrinter.print(9));
        assertEquals(" __   __\n" + " \\ \\ / /\n" + "  \\ V / \n" + "   > <  \n" + "  / . \\ \n" + " /_/ \\_\\\n", RomanPrinter.print(10));
        assertEquals(" __   __ _____ __      __\n" + " \\ \\ / /|_   _|\\ \\    / /\n" + "  \\ V /   | |   \\ \\  / / \n" + "   > <    | |    \\ \\/ /  \n" + "  / . \\  _| |_    \\  /   \n" + " /_/ \\_\\|_____|    \\/    \n", RomanPrinter.print(14));
        assertEquals(" __   __ __   __\n" + " \\ \\ / / \\ \\ / /\n" + "  \\ V /   \\ V / \n" + "   > <     > <  \n" + "  / . \\   / . \\ \n" + " /_/ \\_\\ /_/ \\_\\\n", RomanPrinter.print(20));
        assertEquals(" __   __  _      \n" + " \\ \\ / / | |     \n" + "  \\ V /  | |     \n" + "   > <   | |     \n" + "  / . \\  | |____ \n" + " /_/ \\_\\ |______|\n", RomanPrinter.print(40));
        assertEquals("  _      \n" + " | |     \n" + " | |     \n" + " | |     \n" + " | |____ \n" + " |______|\n", RomanPrinter.print(50));
        assertEquals(" __   __   _____ \n" + " \\ \\ / /  / ____|\n" + "  \\ V /  | |     \n" + "   > <   | |     \n" + "  / . \\  | |____ \n" + " /_/ \\_\\  \\_____|\n", RomanPrinter.print(90));
        assertEquals("   _____ \n" + "  / ____|\n" + " | |     \n" + " | |     \n" + " | |____ \n" + "  \\_____|\n", RomanPrinter.print(100));
        assertEquals("   _____   _____  \n" + "  / ____| |  __ \\ \n" + " | |      | |  | |\n" + " | |      | |  | |\n" + " | |____  | |__| |\n" + "  \\_____| |_____/ \n", RomanPrinter.print(400));
        assertEquals("  _____  \n" + " |  __ \\ \n" + " | |  | |\n" + " | |  | |\n" + " | |__| |\n" + " |_____/ \n", RomanPrinter.print(500));
        assertEquals("   _____   __  __ \n" + "  / ____| |  \\/  |\n" + " | |      | \\  / |\n" + " | |      | |\\/| |\n" + " | |____  | |  | |\n" + "  \\_____| |_|  |_|\n", RomanPrinter.print(900));
        assertEquals("  __  __ \n" + " |  \\/  |\n" + " | \\  / |\n" + " | |\\/| |\n" + " | |  | |\n" + " |_|  |_|\n", RomanPrinter.print(1000));

        assertEquals("Numero non valido", RomanPrinter.print(0));
        assertEquals("Numero non valido", RomanPrinter.print(1001));

    }

}
