
package mp0485examplesra1;

import java.util.Scanner;

public class EjemplosEstructurasCondicionales {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        sc.useDelimiter("\n");
        
        /*
        boolean puedeTrabajar = false;
        
        System.out.print("Edad: ");
        
        int edad = sc.nextInt();
        
        puedeTrabajar = (edad >= 18 && edad <= 65);
        
        if (puedeTrabajar) {
            System.out.println("Puedes trabajar");
        } else {
            System.out.println("No puedes trabajar");
        }
        
        System.out.println("Esto se ejecuta siempre");
        */
        
        // EJEMPLO 2
        System.out.println("¿Cual es la capital de Francia? (Escribe en mayusculas)");
        
        String rpta = sc.next();
        
        if (rpta.equals("PARIS")) {
            System.out.println("Respuesta correcta");
        } else {
            System.out.println("Respuesta incorrecta");
        }
    }
    
}