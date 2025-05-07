
package examples;

import java.util.Scanner;

public class BuclesTest {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        String opcion = "";
        sc.useDelimiter("\n");
        
        // EJEMPLO WHILE
        while (!opcion.equals("z")) {
            System.out.println("Menu:");
            System.out.println("1 - Please select an exercise (1-5): ");
            System.out.println("Z - Salir");
            System.out.println("Enter option:");
            opcion = sc.next();
            
            switch (opcion) {
            case "1":
                exercise01();
                break;
            case "2":
                exercise02();
                break;
            case "3":
                exercise03();
                break;
            case "4":
                exercise04();
                break;
            case "5":
                exercise05();
                break;
            default:
                System.out.println("Adios");
                //exercise06();
            }
        }
    }

    static void exercise01() {
        System.out.println("Ejercicio 1");
    }
    
    static void exercise02() {
        System.out.println("Ejercicio 2");
    }
    
    static void exercise03() {
        System.out.println("Ejercicio 3");
    }
    
    static void exercise04() {
        System.out.println("Ejercicio 4");
    }
    
    static void exercise05() {
        System.out.println("Ejercicio 5");
    }
}