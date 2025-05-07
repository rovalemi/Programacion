
package practica04;

import java.util.Scanner;

public class Exercise04 {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Introduce la moneda a la que deseas convertir:");
        String currency = sc.next();
        System.out.println("Introduce la cantidad de euros deseas convertir:");
        double euro = sc.nextDouble();
        System.out.println("Introduce el tipo de cambio:");
        double tc = sc.nextDouble();
        
        double conversion = euro * tc;
        
        System.out.println("La conversion de " + euro + " euros a " + currency + " es: " + conversion + " (T/C: " + tc + ")");
        
    }
}
