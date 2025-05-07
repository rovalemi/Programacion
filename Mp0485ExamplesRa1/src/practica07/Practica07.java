
package practica07;

import java.util.Scanner;

public class Practica07 {
    
    static Scanner sc = new Scanner(System.in);
    
    static int num = 0; 
    
    public static void main(String[] args) {
        
        sc.useDelimiter("\n");
        
        String opcion = "";
        
        while(!opcion.equalsIgnoreCase("z")) {
            System.out.println("Menu:");
            System.out.println("1 - Please select an exercise (1-7):");
            System.out.println("Z - Salir");
            System.out.print("Enter option: ");
            opcion = sc.next();
            
            switch(opcion) {
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
                case "6":
                    exercise06();
                    break;
                case "7":
                    exercise07();
                    break;
                default:
                    System.out.println("Adios");
            }
        }
    }

    static void exercise01() {
        System.out.print("Enter an integer number: ");
        int num = sc.nextInt();
        System.out.println("[1] Using for");
        System.out.println("[2] Using while");
        System.out.println("[3] Using do-while");
        System.out.print("Enter the option: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                for ( int i = 0; i <= 100; i++) {
                    if (i % num == 0) {
                        System.out.print(i + " ");
                    }
                }
                break;
            case 2:
                int i = 0;
                while (i <= 100) {
                    if (i % num == 0) {
                        System.out.print(i + " ");
                    }
                    i++;
                }
                break;
            case 3:
                int j = 0;
                do {
                    if (j % num == 0) {
                        System.out.print(j + " ");
                    }
                    j++;
                } while (j <= 100);
                break;
            default:
                System.out.println("Incorrect option.");
        }
        System.out.println("");
    }
    
    static void exercise02() {
        System.out.print("Enter an integer > 10: ");
        num = sc.nextInt();
        
        while (num <= 10) {
            System.out.print("Please enter a number greater than 10: ");
            num = sc.nextInt();
        }
        
        System.out.println("Let's count numbers 10 by 10 between " + num + "(the entered number) and 0");
        System.out.println("[1] Using for");
        System.out.println("[2] Using while");
        System.out.println("[3] Using do-while");
        System.out.print("Enter the option: ");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                for (int i = num; i >= 0; i -= 10) {
                    System.out.print(i + " ");  
                }
                break;
            case 2:
                int i = num;
                while (i >= 0) {
                    System.out.print(i + " ");
                    i -= 10;
                }
                break;
            case 3:
                int j = num;
                do {
                    System.out.print(j + " ");
                    j -= 10;
                } while (j >= 0);
                break;
            default:
                System.out.println("Incorrect option.");
        }
        System.out.println("");
    }
    
    static void exercise03() {
        System.out.print("Enter a number to display its multiplication table: ");
        int num = sc.nextInt();
        
        for (int i = 1; i <=10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
    
    static void exercise04() {
        System.out.print("Enter a base number: ");
        int num = sc.nextInt();
        
        System.out.printf("%-10s %-10s %-10s\n", "Number", "Square", "Cube");
        for (int i = num; i < num + 5; i++) {
            int square = (int) Math.pow(i, 2);
            int cube = (int) Math.pow(i, 3);
            
            System.out.printf("%-10d %-10d %-10d\n", i, square, cube);
        }
    }
    
    static void exercise05() {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        num = Math.abs(num);
        
        int count = 0;
        
        if (num == 0) {
            count = 1;
        } else {
            for (int i = num; i > 0; i /= 10) {
                count++;
            }
        }
        System.out.println("The number of digits is " + count);
    }
    
    static void exercise06() {
        int random = (int) (Math.random() * 11);
        
        int att = 0;
        int maxAtt = 3;
        
        int userNum;
        
        System.out.println("Choose a number between 0 and 10. Try to guess it!");
        
        while (true) {
            System.out.print("Enter your number: ");
            userNum = sc.nextInt();
            att++;
            
            if (userNum == random) {
                System.out.println("Congratulations!");
                break;
            } else {
                if (att >= maxAtt) {
                    System.out.println("Sorry! You have no more attempts.");
                    break;
                } else {
                    System.out.println("Wrong. Try again!");
                }
            }
        }
    }
    
    static void exercise07() {
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the exponent: ");
        int expo = sc.nextInt();
        
        double res = calculate(base, expo);
        System.out.println("Result: " + res);
    }  

    public static double calculate(int base, int expo) {
        if (expo == 0) {
            return 1;
        }
        
        if (expo > 0) {
            int res = 1;
            for (int i = 1; i <= expo; i++) {
                res *= base;
            }
            return res;
        }
        else {
            int res = 1;
            for (int i = 1; i <= -expo; i++) {
                res *= base;
            }
            return 1.0 / res;
        }
    }
}