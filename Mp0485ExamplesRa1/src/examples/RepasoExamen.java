
package examples;

import java.util.Scanner;

public class RepasoExamen {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        sc.useDelimiter("\n");
        
        String opcion = "";
        
        while(!opcion.equalsIgnoreCase("z")) {
            System.out.println("Menu:");
            System.out.println("1 - Please select an exercise (1-8):");
            System.out.println("Z - Exit");
            System.out.print("Enter option: ");
            opcion = sc.next();
            
            switch(opcion) {
                case "1":
                    exercise01();
                    break;
                default:
                    System.out.println("Coodbye!");
            }
        }
    }

    static void exercise01() {
    }
}