
package practica04;

import java.util.Scanner;

public class Exercise03 {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        sc.useDelimiter("\n");
        
        System.out.println("Introduce tu nombre:");
        String name = sc.next();
        System.out.println("Introduce tu direccion:");
        String address = sc.next();
        System.out.println("Introduce tu telefono:");
        String phoneNumber = sc.next();
        
        System.out.println("Mi nombre es " + name + ", mi direccion es " + address + " y mi telefono es " + phoneNumber);
        
    }
}
