
package practica03;

public class Exercise05 {
    
    static final int iva = 21;
    
    public static void main(String[] args) {
        
        double precio = 121;
        double precioSinIva;
        
        precioSinIva = precio * 100 / (100+iva);
        
        System.out.println("El precio del producto sin iva es: " + (int) precioSinIva);
    }
    
}