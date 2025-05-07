
package examples;

import java.util.Scanner;

public class Bucles {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        // EJEMPLO 1
        /*
        int numAlumno = 1;
        int sumaNotas = 0;
        
        System.out.println("Introduce la nota del alumno " + numAlumno);
        int nota = sc.nextInt();
        sumaNotas = sumaNotas + nota;
        numAlumno = numAlumno + 1;
        
        System.out.println("Introduce la nota del alumno " + numAlumno);
        nota = sc.nextInt();
        sumaNotas = sumaNotas + nota;
        numAlumno = numAlumno + 1;
        
        System.out.println("Introduce la nota del alumno " + numAlumno);
        nota = sc.nextInt();
        sumaNotas = sumaNotas + nota;
        numAlumno = numAlumno + 1;
        
        System.out.println("Introduce la nota del alumno " + numAlumno);
        nota = sc.nextInt();
        sumaNotas = sumaNotas + nota;
        numAlumno = numAlumno + 1;
        
        System.out.println("Introduce la nota del alumno " + numAlumno);
        nota = sc.nextInt();
        sumaNotas = sumaNotas + nota;
        numAlumno = numAlumno + 1;
        
        double media = sumaNotas / (numAlumno - 1);
        System.out.println("La nota media de los alumnos es " + media);
        */
        
        // EJEMPLO 2 - WHILE
        /*
        int numAlumno = 1;
        int sumaNotas = 0;
        int maximo = 10;
        
        while(numAlumno <= maximo) {
            System.out.println("Introduce la nota del alumno " + numAlumno);
            int nota = sc.nextInt();
            sumaNotas = sumaNotas + nota;
            numAlumno = numAlumno + 1;
        }
        
        double media = sumaNotas / (numAlumno - 1);
        System.out.println("La nota media de los alumnos es " + media);
        */
        
        // EJEMPLO 3 - DO WHILE
        /*
        int numAlumno = 1;
        int sumaNotas = 0;
        int maximo = 10;
        
        do {
            System.out.println("Introduce la nota del alumno " + numAlumno);
            int nota = sc.nextInt();
            sumaNotas = sumaNotas + nota;
            numAlumno = numAlumno + 1;
        } while (numAlumno <= maximo);
        
        double media = sumaNotas / (numAlumno - 1);
        System.out.println("La nota media de los alumnos es " + media);
        */
        
        // EJEMPLO 4 - FOR
        /*
        int numAlumno = 1;
        int sumaNotas = 0;
        
        for (int i=0; i<5; i++) {
            System.out.println("Introduce la nota del alumno " + numAlumno);
            int nota = sc.nextInt();
            sumaNotas = sumaNotas + nota;
            numAlumno = numAlumno + 1;
        }
        
        double media = sumaNotas / (numAlumno - 1);
        System.out.println("La nota media de los alumnos es " + media);
        */
    }
}