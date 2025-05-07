
package practica04;

import java.util.Scanner;

public class Exercise08 {
    
    static Scanner sc = new Scanner(System.in);
    static final double rate = 12;
    
    public static void main(String[] args) {
        
        System.out.print("Introduce las horas trabajadas: ");
        double hours = sc.nextDouble();
        double weeklySalary;
        
        weeklySalary = hours * rate;
        
        System.out.println("El salario semanal es: " + weeklySalary);
        
    }
    
}
