////////////////////////////////////////////////////////////////////
// Bianca Zaghetto 1167741
// Nicholas Moretto 1226318
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {

    // ASCII Art per le lettere romane
    private static final String[] I = {
        " _____  ",
        "|_   _| ",
        "  | |   ",
        "  | |   ",
        " _| |_  ",
        "|_____| "
    };

    private static final String[] V = {
        "__      __",
        "\\ \\    / /",
        " \\ \\  / / ",
        "  \\ \\/ /  ",
        "   \\  /   ",
        "    \\/    "
    };

    private static final String[] X = {
        "__   __",
        "\\ \\ / /",
        " \\ V / ",
        "  > <  ",
        " / . \\ ",
        "/_/ \\_\\"
    };

    private static final String[] L = {
        " _       ",
        "| |      ",
        "| |      ",
        "| |      ",
        "| |____  ",
        "|______| "
    };

    private static final String[] C = {
        "  _____ ",
        " / ____|",
        "| |     ",
        "| |     ",
        "| |____ ",
        " \\_____|"
    };

    private static final String[] D = {
        " _____  ",
        "|  __ \\ ",
        "| |  | |",
        "| |  | |",
        "| |__| |",
        "|_____/ "
    };

    private static final String[] M = {
        " __  __ ",
        "|  \\/  |",
        "| \\  / |",
        "| |\\/| |",
        "| |  | |",
        "|_|  |_|"
    };

    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }
    
    static String printAsciiArt(String romanNumber){
        StringBuilder[] righe = new StringBuilder[6];
        for (int i = 0; i < 6; i++) {
            righe[i] = new StringBuilder();
        }

        for (char c : romanNumber.toCharArray()) {
            String[] lettera = getAsciiArt(c);
            for (int i = 0; i < 6; i++) {
                righe[i].append(lettera[i]).append(" ");
            }
        }

        StringBuilder risultato = new StringBuilder();
        for (StringBuilder riga : righe) {
            risultato.append(riga.toString().stripTrailing()).append("\n");
        }

        return risultato.toString();
    }

    private static String[] getAsciiArt(char c) {
        switch (c) {
            case 'I':
                return I;
            case 'V':
                return V;
            case 'X':
                return X;
            case 'L':
                return L;
            case 'C':
                return C;
            case 'D':
                return D;
            case 'M':
                return M;
            default:
                throw new IllegalArgumentException("Carattere non valido: " + c);
        }
    }
}