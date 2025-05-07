
package practica04;

import java.util.Scanner;

public class Exercise01 {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Introduce el valor de x:");
        int x = sc.nextInt();
        System.out.println("Introduce el valor de y:");
        int y = sc.nextInt();
        
        int suma = x + y;
        int resta = y - x;
        double division = (double) y / (double) x;
        int multiplicacion = x * y;
        
        System.out.println("Resultados");
        System.out.println("La suma es " + suma + ", la resta es " + resta + ", la division es " + division + " y la multiplicacion es " + multiplicacion);
    }
    
}
