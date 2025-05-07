
package examples;

import java.util.Scanner;

public class testFunciones {
    
    static String texto3 = "40";
    
    public static void main(String[] args) {
        
        String a = "Hola";
        String b = a;
        String c = new String("Hola");
        if (a.equals(b)) {
            System.out.println("1. Si pasa");
        }
        if (a.equals(c)) {
            System.out.println("2. Si pasa");
        }
        if (a == b) {
            System.out.println("3. Si pasa");
        }
        if (a == c) {
            System.out.println("4. No pasa dentro del if");
        }
        
        saluda();
    }

    private static void saluda() {
        System.out.println(texto3);
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        
        //int jmh = suma10(4);
        //System.out.println(jmh);
    }

    /*
    private static int suma10(int numero1) {
        String texto3 = "42";
        System.out.println("");
        
    }*/
    
    
}