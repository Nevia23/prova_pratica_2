////////////////////////////////////////////////////////////////////
// Bianca Zaghetto 1167741
// Nicholas Moretto 1226318
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RomanPrinterTest {

    @Test
    public void testPrintI() {
        String[] expectedLines = {
            " _____",
            "|_   _|",
            "  | |",
            "  | |",
            " _| |_",
            "|_____|"
        };
    
        String expected = String.join("\n", expectedLines) + "\n";
        String actual = RomanPrinter.print(1);
    
        assertEquals(expected, actual);
    }

    @Test
    public void testPrintV() {
        String expected = 
                "__      __\n" +
                "\\ \\    / /\n" +
                " \\ \\  / /\n" +
                "  \\ \\/ /\n" +
                "   \\  /\n" +
                "    \\/\n";

        String actual = RomanPrinter.print(5);

        assertEquals(expected, actual);
    }

    @Test
    public void testPrintX() {
        String expected = 
                "__   __\n" +
                "\\ \\ / /\n" +
                " \\ V /\n" +
                "  > <\n" +
                " / . \\\n" +
                "/_/ \\_\\\n";

        String actual = RomanPrinter.print(10);

        assertEquals(expected, actual);
    }

    @Test
    public void testPrintL() {
        String expected = 
                " _\n" +
                "| |\n" +
                "| |\n" +
                "| |\n" +
                "| |____\n" +
                "|______|\n";

        String actual = RomanPrinter.print(50);

        assertEquals(expected, actual);
    }

    @Test
    public void testPrintC() {
        String expected = 
                "  _____\n" +
                " / ____|\n" +
                "| |\n" +
                "| |\n" +
                "| |____\n" +
                " \\_____|\n";

        String actual = RomanPrinter.print(100);

        assertEquals(expected, actual);
    }

    @Test
    public void testPrintD() {
        String expected = 
                " _____\n" +
                "|  __ \\\n" +
                "| |  | |\n" +
                "| |  | |\n" +
                "| |__| |\n" +
                "|_____/\n";

        String actual = RomanPrinter.print(500);

        assertEquals(expected, actual);
    }

    @Test
    public void testPrintM() {
        String expected = 
                " __  __\n" +
                "|  \\/  |\n" +
                "| \\  / |\n" +
                "| |\\/| |\n" +
                "| |  | |\n" +
                "|_|  |_|\n";

        String actual = RomanPrinter.print(1000);

        assertEquals(expected, actual);
    }

    @Test
    public void testPrintXV() {
        String actual = RomanPrinter.print(15); // 15 -> XV

        String expected = 
                "__   __ __      __\n" +
                "\\ \\ / / \\ \\    / /\n" +
                " \\ V /   \\ \\  / /\n" +
                "  > <     \\ \\/ /\n" +
                " / . \\     \\  /\n" +
                "/_/ \\_\\     \\/\n";

        assertEquals(expected, actual);
    }

    @Test
    public void testPrintXLIX() {
        String expected = "__   __  _         _____   __   __\n" +
                "\\ \\ / / | |       |_   _|  \\ \\ / /\n" +
                " \\ V /  | |         | |     \\ V /\n" +
                "  > <   | |         | |      > <\n" +
                " / . \\  | |____    _| |_    / . \\\n" +
                "/_/ \\_\\ |______|  |_____|  /_/ \\_\\\n";

        String actual = RomanPrinter.print(49); // XLIX

        assertEquals(expected, actual);
    }

    @Test
    public void testInvalidCharacterThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            RomanPrinter.printAsciiArt("A"); // A non Ã¨ un carattere romano valido
        });

        String expectedMessage = "Carattere non valido";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testPrintEmptyRomanNumber() {
        String actual = RomanPrinter.printAsciiArt("");
        assertEquals("\n\n\n\n\n\n", actual);
    }

}