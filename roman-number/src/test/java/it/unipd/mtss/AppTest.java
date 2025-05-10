////////////////////////////////////////////////////////////////////
// Bianca Zaghetto 1167741
// Nicholas Moretto 1226318
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.*;

public class AppTest 
{

    @Test
    public void testAppWithValidInput(){
        //input di test simulato
        String input = "123\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        //output di test simulato
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(output);
        System.setOut(out);

        //esecuzione del main
        App.main(new String[]{});

        //verifica dell'output
        String result = output.toString().trim();
        assertTrue (result.contains("Numero romano: CXXIII"));
    }
        
    @Test
    public void testAppWithInvalidInput() throws Exception{
        String input = "0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(output);
        System.setOut(out);

        App.main(new String[]{});

        String result = output.toString().trim();
        assertTrue (result.toLowerCase().contains("errore"));

    }
}
