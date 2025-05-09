////////////////////////////////////////////////////////////////////
// Bianca Zaghetto 1167741
// Nicholas Moretto 1226318
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegerToRomanTest {
    
    //test di valori corretti
    @Test
    public void testConvertOneReturnsI() {
        String result = IntegerToRoman.convert(1);
        assertEquals("I", result);
    }

    @Test
    public void testConvertOneHundredElevenReturnsCXI() {
        String result = IntegerToRoman.convert(111);
        assertEquals("CXI", result);
    }

    @Test
    public void testConvertTwoHundredTwentyTwoReturnsXXII() {
        String result = IntegerToRoman.convert(222);
        assertEquals("CCXXII", result);
    }

    @Test
    public void testConvertThreeHundredThirtyThreeReturnsCCCXXXIII() {
        String result = IntegerToRoman.convert(333);
        assertEquals("CCCXXXIII", result);
    }

    @Test
    public void testConvertFourHundredFortyFourReturnsCDXLIV() {
        String result = IntegerToRoman.convert(444);
        assertEquals("CDXLIV", result);
    }

    @Test
    public void testConvertFiveHundredFiftyFiveReturnsDLV() {
        String result = IntegerToRoman.convert(555);
        assertEquals("DLV", result);
    }

    @Test
    public void testConvertSixHundredSixtySixReturnsDCLXVI() {
        String result = IntegerToRoman.convert(666);
        assertEquals("DCLXVI", result);
    }

    @Test
    public void testConvertSevenHundredSeventySevenReturnsDCCLXXVII() {
        String result = IntegerToRoman.convert(777);
        assertEquals("DCCLXXVII", result);
    }

    @Test
    public void testConvertEightHundredEightyEightReturnsDCCCLXXXVIII() {
        String result = IntegerToRoman.convert(888);
        assertEquals("DCCCLXXXVIII", result);
    }

    @Test
    public void testConvertNineHundredNinetyNineReturnsCMXCIX() {
        String result = IntegerToRoman.convert(999);
        assertEquals("CMXCIX", result);
    }

    @Test
    public void testConvertEightHundredNinetyReturnsDCCCXC() {
        String result = IntegerToRoman.convert(890);
        assertEquals("DCCCXC", result);
    }

    @Test
    public void testConvertOneThousandReturnsM() {
        String result = IntegerToRoman.convert(1000);
        assertEquals("M", result);
    }

    //test dei limiti validi
    @Test
    public void testConvertLowerBoundaryOne() {
        String result = IntegerToRoman.convert(1);
        assertEquals("I", result);
    }

    @Test
    public void testConvertUpperBoundaryOneThousand() {
        String result = IntegerToRoman.convert(1000);
        assertEquals("M", result);
    }

    //test con valori non validi
    @Test
    public void testConvertZeroThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            IntegerToRoman.convert(0);
        });
        assertEquals("Il numero deve essere compreso tra 1 e 1000", exception.getMessage());
    }

    @Test
    public void testConvertNegativeNumberThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            IntegerToRoman.convert(-5);
        });
        assertEquals("Il numero deve essere compreso tra 1 e 1000", exception.getMessage());
    }

    @Test
    public void testConvertAboveThousandThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            IntegerToRoman.convert(1001);
        });
        assertEquals("Il numero deve essere compreso tra 1 e 1000", exception.getMessage());
    }

}
