
package practica04;

import java.util.Scanner;

public class Exercise09 {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Introduce el radio del cono:");
        double radius = sc.nextDouble();
        System.out.println("Introduce la altura del cono:");
        double height = sc.nextDouble();
        double volume;
        
        volume = (1.0/3) * Math.PI * Math.pow(radius, 2) * height;
        
        System.out.printf("El volumen del cono es: %.2f%n", volume);
    }
    
}
