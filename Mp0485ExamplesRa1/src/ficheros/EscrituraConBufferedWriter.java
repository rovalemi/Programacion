
package ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscrituraConBufferedWriter {
    
    public static void main(String[] args) {
        
        FileWriter fw = null;
        BufferedWriter bw = null;
        
        try {
            File fichero = new File("src\\recursos\\arf.txt");
            fw = new FileWriter(fichero, true);
            bw = new BufferedWriter(fw);
            bw.write("primera\n");
            bw.write("segunda");
            bw.newLine();
            bw.write("tercera");
            bw.newLine();
            bw.flush();
            bw.close();
        } catch (IOException ex) {
            System.out.println("Error de entrada/salida. " + ex.getMessage());
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                System.out.println("Error de entrada del fichero");
            }
        }
    }
}