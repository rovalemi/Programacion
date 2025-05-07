
package examples;

import java.util.Scanner;

public class EjemplosArrays {
    
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        /*
        double[] listaTemp;
        listaTemp = new double[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Introduce la temperatura del dia " + (i + 1));
            listaTemp[i] = sc.nextDouble();
        }
        
        System.out.println("");
        
        for (int i = 0; i < 3; i++) {
            System.out.println("La temperatura del dia " + (i + 1) + " es: " + listaTemp[i]);
        }
        */
        
        double[] notasArray;
        notasArray = new double[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingresa la nota del alumno " + (i + 1) + ": ");
            notasArray[i] = sc.nextDouble();
        }
        
        double suma = 0;
        for (double nota : notasArray) {
            suma += nota;
        }
        System.out.println("La nota media es " + suma / notasArray.length);
    }
}