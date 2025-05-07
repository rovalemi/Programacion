
package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaConScanner {
    
    static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        String fileName = "C:\\Users\\alizonros\\Desktop\\Lorem.txt";
        
        String opcion = "";
        
        do {
            try {
                System.out.println("MENU:");
                System.out.println("1.- Leer fichero");
                System.out.println("Z.- Salir");

                System.out.print("Opcion: ");
                opcion = keyboard.next();

                switch (opcion) {
                    case "1":
                        String contentFile;
                        contentFile = leerFichero(fileName);
                        System.out.println(contentFile);
                        break;
                    case "Z":
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                }
            } catch(FileNotFoundException ex) {
                System.out.println("Error " + ex.getMessage());
            }
        } while (!opcion.equals("Z"));
    }
    
    private static String leerFichero(String fileName) throws FileNotFoundException {
        String contenido = "";
        File fichero = new File(fileName);
        Scanner scan = new Scanner(fichero);
        
        scan.useDelimiter("\n");
        String linea;
        while (scan.hasNext()) {
            linea = scan.next();
            contenido += linea + "\n";
//            System.out.println(palabra);
        }
        scan.close();
        return contenido;
    }
}