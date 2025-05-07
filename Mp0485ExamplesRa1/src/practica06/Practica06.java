
package practica06;

import java.util.Scanner;

public class Practica06 {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        sc.useDelimiter("\n");
        
        System.out.println("");
        System.out.println("Menu:");
        System.out.println("1 - Exercise 1");
        System.out.println("2 - Exercise 2");
        System.out.println("3 - Exercise 3");
        System.out.println("4 - Exercise 4");
        System.out.println("5 - Exercise 5");
        System.out.println("6 - Exercise 6");
        System.out.println("Enter option:");
        String option = sc.next();
        
        switch (option) {
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
            default:
                System.out.println("Incorrect option");
        }
        
    }

    static void exercise01() {
        System.out.println("");
        System.out.println("Question 1: What is the output of 'System.out.println(5 + 3);'?");
        System.out.println("a) 53");
        System.out.println("b) 8");
        System.out.println("c) 5+3");
        System.out.println("d) Error");
        System.out.println("Answer:");
        String rpta1 = sc.next();
        
        System.out.println("");
        System.out.println("Question 2: Which keyword is used to create a class in Java?");
        System.out.println("a) class");
        System.out.println("b) create");
        System.out.println("c) new");
        System.out.println("d) method");
        System.out.println("Answer:");
        String rpta2 = sc.next();
        
        System.out.println("");
        System.out.println("Question 3: What data type is used to create a variable that should store text?");
        System.out.println("a) myString");
        System.out.println("b) String");
        System.out.println("c) Txt");
        System.out.println("d) Text");
        System.out.println("Answer:");
        String rpta3 = sc.next();
        
        System.out.println("");
        System.out.println("Question 4: How do you start the main method in Java?");
        System.out.println("a) public void main()");
        System.out.println("b) public static void main()");
        System.out.println("c) main()");
        System.out.println("d) static void main()");
        System.out.println("Answer:");
        String rpta4 = sc.next();
        
        System.out.println("");
        System.out.println("Question 5: What is the correct way to create a variable of type int?");
        System.out.println("a) int num = 5");
        System.out.println("b) integer num = 5");
        System.out.println("c) num int = 5");
        System.out.println("d) num = int 5");
        System.out.println("Answer:");
        String rpta5 = sc.next();
        
        int grade = 0;
        
        if (rpta1.equalsIgnoreCase("b")) {
            grade++;
        }
        if (rpta2.equalsIgnoreCase("a")) {
            grade++;
        }
        if (rpta3.equalsIgnoreCase("b")) {
            grade++;
        }
        if (rpta4.equalsIgnoreCase("b")) {
            grade++;
        }
        if (rpta5.equalsIgnoreCase("a")) {
            grade++;
        }
        
        System.out.println("");
        System.out.println("Final Grade: " + grade + "/5");
    }

    static void exercise02() {
        System.out.println("Enter a 3-digit number:");
        String digit = sc.next();
        int digitNum = Integer.parseInt(digit);
        if (digitNum > 0) {
            if (digit.length() == 3) {
                if (digit.charAt(0) == digit.charAt(2)) {
                    System.out.println("The number is capicua");
                } else {
                    System.out.println("The number is not capicua");
                }
            } else {
                System.out.println("This is not a 3-digit number");
            }
        } else if (digitNum < 0) {
            if (digit.length() == 4) {
                if (digit.charAt(1) == digit.charAt(3)) {
                    System.out.println("The number is capicua");
                } else {
                    System.out.println("The number is not capicua");
                }
            } else {
                System.out.println("This is not a 3-digit number");
            }
        } else {
            System.out.println("Error option");
        }
    }
    
    static void exercise03() {
        System.out.println("Enter a number:");
        String digit = sc.next();
        int digitNum = Integer.parseInt(digit);
        if (digitNum > 0) {
            if (digit.length() <= 5) {
                System.out.println("The number has " + digit.length() + " digits");
            } else {
                System.out.println("This number has more than 5 digits");
            }
        } else if (digitNum < 0) {
            if (digit.length() <= 6) {
                System.out.println("The number has " + (digit.length()-1) + " digits");
            } else {
                System.out.println("This number has more than 5 digits");
            }
        } else {
            System.out.println("Incorrect");
        }
    }
    
    static void exercise04() {
        System.out.println("Enter day of the week:");
        String day = sc.next();
        System.out.println("Enter time (HH MM):");
        String time = sc.next();
        
        if (time.length() != 5 || time.charAt(2) != ' ') {
            System.out.println("Incorrect time format. Please enter time as HH MM.");
            return;
        }
        
        String hours = ""+time.charAt(0)+time.charAt(1);
        String minutes = ""+time.charAt(3)+time.charAt(4);
        int hoursNum = Integer.parseInt(hours);
        int minutesNum = Integer.parseInt(minutes);
        
        if (hoursNum > 24 || minutesNum > 59) {
            System.out.println("Incorrect time");
        } else {
            int dayMin = (hoursNum * 60) + minutesNum;
            int minWeekend;
            switch(day) {
                case "Monday":
                    minWeekend = (4 * 24 * 60) + (15 * 60) - dayMin;
                    System.out.println("Minutes until weekend: " + minWeekend);
                    break;
                case "Tuesday":
                    minWeekend = (3 * 24 * 60) + (15 * 60) - dayMin;
                    System.out.println("Minutes until weekend: " + minWeekend);
                    break;
                case "Wednesday":
                    minWeekend = (2 * 24 * 60) + (15 * 60) - dayMin;
                    System.out.println("Minutes until weekend: " + minWeekend);
                    break;
                case "Thursday":
                    minWeekend = (24 * 60) + (15 * 60) - dayMin;
                    System.out.println("Minutes until weekend: " + minWeekend);
                    break;
                case "Friday":
                    if (hoursNum>=15) {
                        System.out.println("It's already weekend");
                    } else {
                        minWeekend = (15 * 60) - dayMin;
                        System.out.println("Minutes until weekend: " + minWeekend);
                    }
                    break;
                default:
                    System.out.println("Incorrect day");
            }
        }
    }
    
    static void exercise05() {
        System.out.println("Enter the taxable base:");
        double tb = sc.nextDouble();
        System.out.println("Enter the TAX type (general, reduced, super-reduced");
        String tt = sc.next();
        System.out.println("Enter the promo code (noPromo, half, fixDiscount, percentage):");
        String pc = sc.next();
        double tax = 0;
        switch(tt) {
            case "general":
                tax = 21;
                break;
            case "reduced":
                tax = 10;
                break;
            case "super-reduced":
                tax = 4;
                break;
            default:
                System.out.println("Error option");
        }
        double taxAmount = tb * tax / 100;
        double priceTax = tb + taxAmount;
        double discount = 0;
        switch(pc) {
            case "noPromo":
                discount = 0;
                break;
            case "half":
                discount = priceTax * 0.50;
                break;
            case "fixDiscount":
                discount = 5;
                break;
            case "percentage":
                discount = priceTax * 0.05;
                break;
            default:
                System.out.println("Invalid promo code");
        }
        double priceTotal = priceTax - discount;
        
        System.out.println("");
        System.out.printf("%-30s %10.2f\n", "Taxable base:", tb);
        System.out.printf("%-30s %10.2f\n", "TAX("+ (int) tax +"%):", taxAmount);
        System.out.printf("%-30s %10.2f\n", "Price with taxes:", priceTax);
        System.out.printf("%-30s %10.2f\n", "Promo code("+pc+"):", -discount);
        System.out.printf("%-30s %10.2f\n", "TOTAL", priceTotal);
        
    }
    
    static void exercise06() {
        System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
        String opcionJugador1 = sc.next();
        opcionJugador1 = opcionJugador1.toLowerCase();
        boolean jugada10k;
        switch(opcionJugador1) {
            case "papel":
                jugada10k = true;
                break;
            case "piedra":
                jugada10k = true;
                break;
            case "tijera":
                jugada10k = true;
                break;
            default:
                jugada10k = false;
                System.out.println("Jugada no valida");
        }
        System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
        String opcionJugador2 = sc.next();
        opcionJugador2 = opcionJugador2.toLowerCase();
        boolean jugada20k;
        switch(opcionJugador2) {
            case "papel":
                jugada20k = true;
                break;
            case "piedra":
                jugada20k = true;
                break;
            case "tijera":
                jugada20k = true;
                break;
            default:
                jugada20k = false;
                System.out.println("Jugada no valida");
        }
        if (jugada10k && jugada20k) {
            if (opcionJugador1.equals(opcionJugador2)) {
                System.out.println("Empate");
            } else {
                int numJugador = 1;
                switch(opcionJugador1) {
                    case "papel":
                        if (!opcionJugador2.equals("piedra")) { numJugador = 2; }
                        break;
                    case "piedra":
                        if (!opcionJugador2.equals("tijera")) { numJugador = 2; }
                        break;
                    case "tijera":
                        if (!opcionJugador2.equals("papel")) { numJugador = 2; }
                        break;
                    default:
                        System.out.println("Error");
                }
                System.out.println("Ha ganado el jugador " + numJugador);
            }
        } else {
            System.out.println("Hay jugadas invalidas");
        }
    }
}