
package practica04;

import java.util.Scanner;

public class Exercise07 {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Introduce 5 valores (char):");
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        char c = sc.next().charAt(0);
        char d = sc.next().charAt(0);
        char e = sc.next().charAt(0);
        
        String mensaje;
        
        mensaje = ""+a+b+c+d+e;
        
        System.out.println("El mensaje es: " + mensaje);
    }
}
