
package practica04;

import java.util.Scanner;

public class Exercise05 {
    
    static Scanner sc = new Scanner(System.in);
    static final int vat = 21;
    
    public static void main(String[] args) {
        
        System.out.println("Introduce el precio del producto:");
        double precio = sc.nextDouble();
        double precioSinVat;
        
        precioSinVat = precio * 100 / (100+vat);
        
        System.out.println("El precio del producto sin vat es: " + precioSinVat);
        
    }
    
}
