
package practica08;

import java.util.Scanner;

public class Practica08 {
    
    static Scanner sc = new Scanner(System.in);
    
    static int num = 0;
    
    public static void main(String[] args) {
        
        sc.useDelimiter("\n");
        
        String opcion = "";
        
        while(!opcion.equalsIgnoreCase("z")) {
            System.out.println("Menu:");
            System.out.println("1 - Please select an exercise (1-7):");
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
                default:
                    System.out.println("Goodbye!");
            }
        }
        
    }

    static void exercise01() {
        System.out.print("Enter an integer number: ");
        int num = sc.nextInt();
        int suma = 0;
        
        num = Math.abs(num);
        
        String numS = String.valueOf(num);
        
        for (int i = 0; i < numS.length(); i++) {
            char ord = numS.charAt(i);
            int digit = Character.getNumericValue(ord);
            suma += digit;
        }
        
        System.out.println("The sum of its digits is " + suma);
    }

    static void exercise02() {
        System.out.print("Enter a word or phrase: ");
        String word = sc.next();
        System.out.print("Enter a certain character: ");
        char letter = sc.next().charAt(0);
        int cont = 0;
        
        for (int i = 0; i < word.length(); i++) {
            if (word.toLowerCase().charAt(i) == letter) {
                cont++;
            }
        }

        System.out.println("The times the character '" + letter + "' appears is " + cont);
    }

    static void exercise03() {
        System.out.print("Enter a word: ");
        String word = sc.next();
        
        for (int i = 0; i < word.length(); i++) {
            System.out.printf("%"+(i+1)+"s\n", word.charAt(i));
        }
    }

    static void exercise04() {
        for (int i=1; i<=10; i++) {
            for (int j=1; j<=10; j++) {
                System.out.printf("%4d", i*j);
            }
            System.out.println("");
        }
    }

    static void exercise05() {
        int heroHP = 100;
        int heroA = 15;
        
        int enemyHP = 80;
        int enemyA = 30;
        
        System.out.println("Let's start!");
        
        while (heroHP > 0 && enemyHP > 0) {
            enemyHP -= heroA;
            System.out.println("El heroe ataca y causa " + heroA + " de dano. Enemigo HP: " + Math.max(enemyHP, 0));
            if (enemyHP <= 0) break;
            
            heroHP -= enemyA;
            System.out.println("El enemigo ataca y causa " + enemyA + " de dano. Heroe HP: " + Math.max(heroHP, 0));
        }
        
        if (heroHP > 0) {
            System.out.println("El heroe ha ganado el combate!");
        } else {
            System.out.println("El enemigo ha ganado el combate!");
        }
    }

    static void exercise06() {
        int numAlumno = 1;
        int sumaNotas = 0;
        int maximo = 5;
        
        do {
            System.out.print("Introduce la nota del alumno " + numAlumno + ": ");
            int nota = sc.nextInt();
            sumaNotas = sumaNotas + nota;
            numAlumno = numAlumno + 1;
        } while (numAlumno <= maximo);
        
        double media = sumaNotas/(numAlumno-1);
        
        System.out.println("La nota media de los alumnos es " + media);
    }

    static void exercise07() {
        System.out.print("Ingrese un numero entero: ");
        int num = sc.nextInt();
        boolean es_primo = true;
        
        for (int i = 2; i < num-1; i++) {
            
            if (num % i == 0) {
                es_primo = false;
                System.out.println(i+ " es divisible entre " + num);
            }
        }
        
        if (es_primo) {
            System.out.println("El numero " + num + " es primo");
        } else {
            System.out.println("El numero " + num + " no es primo");
        }
    }
}