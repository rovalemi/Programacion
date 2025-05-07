
package examples;

import java.util.Scanner;

public class Calculadora {
    
    static Scanner scan =  new Scanner(System.in);
    
    public static void main(String[] args) {
        
        //double x = 0, y = 0;
        double rpta = 0;
        
        System.out.println("CALCULADORA");
        
        System.out.print("Introduce la operacion a realizar (\"+\", \"-\", \"*\", \"/\"): ");
        
        char op = scan.next().charAt(0);
        
        System.out.println("Valor de x: ");
        double x = scan.nextDouble();
        
        System.out.println("Valor de y: ");
        double y = scan.nextDouble();
        
        switch (op) {
            case '+':
                rpta = x + y;
                break;
            case '-':
                rpta = x - y;
                break;
            case '*':
                rpta = x * y;
                break;
            case '/':
                rpta = x / y;
                break;
            default:
                System.out.println("Seleccione uno de los operadores indicados");
                break;
        }
        
        System.out.println("La respuesta es: " + rpta);
    }
    
}