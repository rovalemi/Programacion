
package practica04;

import java.util.Scanner;

public class Exercise06 {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Introduce tu curso (char):");
        char grado = sc.next().charAt(0);
        System.out.println("Introduce tu carrera (String):");
        String curso = sc.next();
        
        System.out.println("Perteneces al grupo: " + grado + curso);
        
    }
}
