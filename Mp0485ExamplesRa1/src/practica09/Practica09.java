
package practica09;

import java.util.Scanner;

public class Practica09 {
    
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
                case "8":
                    exercise08();
                    break;
                default:
                    System.out.println("Goodbye!");
            }
        }
    }

    static void exercise01() {
        int[] numerosArray;
        numerosArray = new int[10];
        
        for (int i = 0; i < numerosArray.length; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numerosArray[i] = sc.nextInt();
        }
        
        for (int i = numerosArray.length - 1; i >= 0 ; i--) {
            System.out.print(numerosArray[i] + " ");
        }
        
        System.out.println("");
    }

    static void exercise02() {
        int[] numerosArray, numerosSquareArray, numerosCubeArray;
        numerosArray = new int[20];
        numerosSquareArray = new int[20];
        numerosCubeArray = new int[20];
        
        System.out.printf("%-10s %-10s %-10s\n", "Number", "Square", "Cube");
        
        for (int i = 0; i < numerosArray.length; i++) {
            numerosArray[i] = (int) (Math.random() * 100);
            numerosSquareArray[i] = (int) Math.pow(numerosArray[i], 2);
            numerosCubeArray[i] = (int) Math.pow(numerosArray[i], 3);
            
            System.out.printf("%10d %10d %10d\n", numerosArray[i], numerosSquareArray[i], numerosCubeArray[i]);
        }
    }
    
    static void exercise03() {
        int[] numerosArray;
        numerosArray = new int[10];
        
        for (int i = 0; i < numerosArray.length; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numerosArray[i] = sc.nextInt();
        }
        
        int max = numerosArray[0];
        int min = numerosArray[0];
        
        for (int numero: numerosArray) {
            if (numero >= max) { max = numero; }
            if (numero <= min) { min = numero; }
        }
        
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
    
    static void exercise04() {
        String[] wordsArray;
        wordsArray = new String[15];
        String firstWord = null;
        
        for (int i = 0; i < wordsArray.length; i++) {
            System.out.print("Ingrese la palabra numero " + (i + 1) + ": ");

            wordsArray[i] = sc.next();
            firstWord = wordsArray[0];
        }
        
        for (int i = 0; i < wordsArray.length; i++) {
            if (i == wordsArray.length - 1) {
                wordsArray[i] = firstWord;
            } else {
                wordsArray[i] = wordsArray[i+1];
            }
            System.out.println(wordsArray[i] + " ");
        }
    }
    
    static void exercise05() {
        int[] numerosArray;
        numerosArray = new int[100];
        
        for (int i = 0; i < numerosArray.length; i++) {
            numerosArray[i] = (int) (Math.random() * 21);
            System.out.print(numerosArray[i] + " ");
        }

        System.out.print("\nEscoge un numero a cambiar: ");
        int num = sc.nextInt();
        
        System.out.print("Ingresa un nuevo numero: ");
        int numN = sc.nextInt();
        
        for (int numero : numerosArray) {
            if (numero == num) {
                numero = numN;
                System.out.print("'" + numero + "'" + " ");
            } else {
                System.out.print(numero + " ");
            }
        }
        System.out.println("");
    }
    
    static void exercise06() {
        int[] numerosArray;
        numerosArray = new int[8];
        
        System.out.println("Ingrese 8 numeros");
        
        for (int i = 0; i < numerosArray.length; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numerosArray[i] = sc.nextInt();
        }
        
        for (int numero : numerosArray) {
            if (numero % 2 == 0) {
                System.out.print(numero + " even");
            } else {
                System.out.print(numero + " odd");
            }
            System.out.println("");
        }
    }
    
    static void exercise07() {
        int[] numerosArray, numerosArrayR;
        numerosArray = new int[10];
        numerosArrayR = new int[10];
        int conArrayR = 0;
        
        System.out.println("Ingrese 10 numeros:");

        for (int i = 0; i < numerosArray.length; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numerosArray[i] = sc.nextInt();
        }
        
        for (int i = 0; i < numerosArray.length; i++) {
            if (esPrimo(numerosArray[i])) {
                numerosArrayR[conArrayR++] = numerosArray[i];
            }
        }
        
        for (int i = 0; i < numerosArray.length; i++) {
            if (!esPrimo(numerosArray[i])) {
                numerosArrayR[conArrayR++] = numerosArray[i];
            }
        }

        System.out.println("Array Original:");
        System.out.printf("%7s %7s\n", "Indice", "Valor");
        for (int i = 0; i < numerosArray.length; i++) {
            System.out.printf("%7d %7d\n", i, numerosArray[i]);
        }

        System.out.println("Array Reorganizado:");
        System.out.printf("%7s %7s\n", "Indice", "Valor");
        for (int i = 0; i < numerosArrayR.length; i++) {
            System.out.printf("%7d %7d\n", i, numerosArrayR[i]);
        }
    }
    
    static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    static void exercise08() {
        String[] wordsArray, wordsArrayR;
        wordsArray = new String[8];
        wordsArrayR = new String[8];
        int contArrayR = 0;
        String[] colorsArray = {"verde", "rojo", "azul", "amarillo", "anaranjado", "rosa", "negro", "blanco", "morado"};
        
        for (int i = 0; i < wordsArray.length; i++) {
            System.out.print("Ingrese la palabra numero " + (i + 1) + ": ");
            
            wordsArray[i] = sc.next();
        }
        
        for (String word : wordsArray) {
            for (String color : colorsArray) {
                if (word.equals(color)) {
                    wordsArrayR[contArrayR++] = word;
                }
            }
        }
        
        for (String word : wordsArray) {
            boolean isColor = false;
            for (String color : colorsArray) {
                if (word.equals(color)) {
                    isColor = true;
                }
            }
            if (!isColor) {
                wordsArrayR[contArrayR++] = word;
            }
        }
        
        System.out.println("Array Original:");
        System.out.printf("%10s %10s\n", "Indice", "Valor");
        for (int i = 0; i < wordsArray.length; i++) {
            System.out.printf("%10s %10s\n", i, wordsArray[i]);
        }
        
        System.out.println("Array Reorganizado:");
        System.out.printf("%10s %10s\n", "Indice", "Valor");
        for (int i = 0; i < wordsArrayR.length; i++) {
            System.out.printf("%10s %10s\n", i, wordsArrayR[i]);
        }
    }
}