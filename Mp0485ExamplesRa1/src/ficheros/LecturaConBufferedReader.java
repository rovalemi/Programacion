
package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LecturaConBufferedReader {
    
    public static void main(String[] args) {
        
        FileReader fr = null;
        try {
            File archivo = new File("Lorem.txt");
            fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error de entrada/salida");
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(LecturaConBufferedReader.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }
}