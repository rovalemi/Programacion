
package practica04;

import java.util.Scanner;

public class Exercise02 {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        sc.useDelimiter("\n");
        
        System.out.println("Introduce tu nombre completo:");
        String name = sc.next();
        
        System.out.println("Tu nombre completo es: " + name);
    }
    
}
