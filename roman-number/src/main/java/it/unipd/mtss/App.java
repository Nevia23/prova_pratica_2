////////////////////////////////////////////////////////////////////
// Bianca Zaghetto 1167741
// Nicholas Moretto 1226318
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Inserisci un numero da 1 a 1000:");
        Scanner s = new Scanner(System.in);

        try {
            int numero = s.nextInt();
            String romano = IntegerToRoman.convert(numero);
            System.out.println("Numero romano: " + romano);
        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Errore generico: " + e.getMessage());
        }

        s.close();
    }
}