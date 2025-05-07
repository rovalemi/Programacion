
package practica00;

import java.util.Scanner;

public class Exercise00 {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        sc.useDelimiter("\n");
        
        System.out.println("Nombre: ");
        
        String nombre = sc.next();
        
        System.out.println("Hola " + nombre + "!");
    }
    
}