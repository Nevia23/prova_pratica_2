////////////////////////////////////////////////////////////////////
// Bianca Zaghetto 1167741
// Nicholas Moretto 1226318
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {

        if (number < 1 || number > 1000) {
            throw new IllegalArgumentException("Il numero deve essere compreso tra 1 e 1000");
        }

        if (number == 1000) {
            return "M";
        }

        String roman = "";
        int centinaia = number / 100;
        int decine = (number % 100) / 10;
        int unita = number % 10;

        switch (centinaia) {
            case 1:
                roman += "C";
                break;
            case 2:
                roman += "CC";
                break;
            case 3:
                roman += "CCC";
                break;
            case 4:
                roman += "CD";
                break;
            case 5:
                roman += "D";
                break;
            case 6:
                roman += "DC";
                break;
            case 7:
                roman += "DCC";
                break;
            case 8:
                roman += "DCCC";
                break;
            case 9:
                roman += "CM";
                break;
        }

        switch (decine) {
            case 1:
                roman += "X";
                break;
            case 2:
                roman += "XX";
                break;
            case 3:
                roman += "XXX";
                break;
            case 4:
                roman += "XL";
                break;
            case 5:
                roman += "L";
                break;
            case 6:
                roman += "LX";
                break;
            case 7:
                roman += "LXX";
                break;
            case 8:
                roman += "LXXX";
                break;
            case 9:
                roman += "XC";
                break;
        }

        switch (unita) {
            case 1:
                roman += "I";
                break;
            case 2:
                roman += "II";
                break;
            case 3:
                roman += "III";
                break;
            case 4:
                roman += "IV";
                break;
            case 5:
                roman += "V";
                break;
            case 6:
                roman += "VI";
                break;
            case 7:
                roman += "VII";
                break;
            case 8:
                roman += "VIII";
                break;
            case 9:
                roman += "IX";
                break;
        }

        return roman;
    }
}