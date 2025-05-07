
package examples;

import java.util.Scanner;

public class Menu {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        sc.useDelimiter("\n");
        
        System.out.println("PRACTICA 05");
        System.out.println("MENU: ");
        System.out.println("1.- Ejercicio 1");
        System.out.println("2.- Ejercicio 2");
        System.out.println("3.- Ejercicio 3\n");
        
        System.out.print("Opcion: ");
        String opcion = sc.next();
        
        switch (opcion) {
            case "1":
                ejercicio1();
                break;
            case "2":
                ejercicio2();
                break;
            case "3":
                ejercicio3();
                break;
            default:
                System.out.println("Opcion incorrecta");
        }
        
    }

    static void ejercicio1() {
        //System.out.println("Hola 1");
        System.out.println("Introduce el numero entero:");
        String numStr = sc.next();
        int num = Integer.parseInt(numStr);
        double numDec = Double.parseDouble(numStr);
        System.out.println("Mostrar: " + num + " y el otro es " + numDec);
    }

    static void ejercicio2() {
        System.out.println("Hola 2");
    }

    static void ejercicio3() {
        System.out.println("Hola 3");
    }
    
}