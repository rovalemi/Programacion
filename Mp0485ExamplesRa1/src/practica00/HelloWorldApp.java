package practica00;

/**
 *
 * @author alizonrosvid
 */
public class HelloWorldApp {
    /**
     * Este es el método principal de mi programa que contiene el código que
     * se ejecutará en primera instancia
     * @param args 
     */
    public static void main (String args[]) {
        
        // EJEMPLO 1
        String saludo = "Hello World";
        String despedida = "Bye World";
        //System.out.print(saludo +"\n"+ despedida +"\n");
        System.out.println(saludo +"\n"+ despedida);
        System.out.print("\n");
        
        // EJEMPLO 2
        System.out.print("Hola\t");
        System.out.println("C:\\Desktop");
        System.out.print("\n");
        
        // EJEMPLO 3
        System.out.println("Articulo    Precio  Num. Unidades");
        System.out.println("Manzana     10,5    123");
        System.out.println("Pera\t\t10,5\t\t123");
        System.out.print("\n");

        // EJEMPLO 4
        System.out.printf("%-15s %-15s %-15s\n", "Articulo", "Precio", "Num. Unidades");
        System.out.printf("%-15s %-15s %-15s\n", "a", "a", "a");
        System.out.printf("%-15s %-15s %-15s\n", "b", "Precio", "Num. Unidades");
    }
}