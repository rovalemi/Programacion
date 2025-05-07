
package examples;

public class ExamplePrintf {
    
    public static void main(String[] args) {
        double precio = 10.229;
        
        // Da 10 espacios y deja 2 espacio de izquierda a derecha
        System.out.printf("%10.2f\n", precio);
        
        // Da 10 espacios, con el "-" comienza de izquierda a derecha
        System.out.printf("%-10s\n", "Total:");
        
        // Da 10 espacios y en general comienza de derecha a izquierda
        System.out.printf("%10s\n", "Demo");
        
        // Da 10 espacios de izquierda a derecha a String, el segundo parametro es de 10 espacios con formato de 2 decimales de derecha a izquierda
        System.out.printf("%-10s%10.2f\n", "Total:", precio);
        
        // Ejemplos
        System.out.printf("%d\n", 21);
        System.out.printf("%4d\n", 21);
        System.out.printf("%04d\n", 21);
        
        System.out.printf("%f\n", precio);
        System.out.printf("%.2f\n", precio);
        System.out.printf("%10.2f\n", precio);
        
        System.out.printf("%s\n", "Demo");
        System.out.printf("%15s\n", "Demo");
        System.out.printf("%-15s\n", "Demo");
        
        // FORMATEADA PRINTLN
        System.out.println("This is a tab \t and this is not \\t");
        
        System.out.printf("El numero %d no tiene decimales. \n", 21);
        System.out.printf("El numero %f sale con decimales .\n", 21.0);
        System.out.printf("El %.3f sale exactamente con 3 decimales. \n", 21.0);
        
        System.out.println("   Articulo     Precio/caja     N cajas");
        System.out.println("----------------------------------------");
        System.out.printf("%-10s        %8.2f       %6d\n", "manzanas", 4.5, 10);
        System.out.printf("%-10s        %8.2f       %6d\n", "peras", 2.75, 120);
        System.out.printf("%-10s        %8.2f       %6d\n", "aguacates", 10.0, 6);
        
        // CONCATENAR
        System.out.println("texto1" + "texto2");
    }
    
}