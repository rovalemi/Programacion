
package view.console;

import java.util.Scanner;
import model.validations.UserDataValidations;

public class Main {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        sc.useDelimiter("\n");
        
        String option;
        
        do {
            System.out.println("1.- Tester checkId");
            System.out.println("2.- Tester checkFormatDate");
            System.out.println("3.- Tester calculateAge");
            System.out.println("4.- Tester checkPostalCode");
            System.out.println("5.- Tester isNumeric");
            System.out.println("6.- Tester isAlphabetic");
            System.out.println("7.- Tester checkEmail");
            System.out.println("8.- Tester checkName");
            System.out.println("Z.- Salir");
            
            System.out.print("Option: ");
            option = sc.next();
            
            switch (option) {
                case "1":
                    testCheckId();
                    break;
                case "2":
                    testCheckFormatDate();
                    break;
                case "3":
                    testCalculateAge();
                    break;
                case "4":
                    testCheckPostalCode();
                    break;
                case "5":
                    testIsNumeric();
                    break;
                case "6":
                    testIsAlphabetic();
                    break;
                case "7":
                    testCheckEmail();
                    break;
                case "8":
                    testCheckName();
                    break;
                case "Z", "z":
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Incorrect option.");
            }
        } while (!option.equalsIgnoreCase("Z"));
    }

    static void testCheckId() {
        System.out.println("Tipos de documento:");
        System.out.println("1. NIF \n2. NIE \n3. Pasaporte");
        System.out.print("Ingresa tipo de documento: ");
        int typeDoc = sc.nextInt();
        System.out.print("Ingrese numero de documento: ");
        String id = sc.next().toUpperCase();
        boolean isNIF = UserDataValidations.checkId(typeDoc, id);
        if (isNIF == true) {
            System.out.println("Good");
        } else {
            System.out.println("Bad");
        }
    }

    static void testCheckFormatDate() {
        System.out.print("Ingresa una fecha (dd/mm/aaaa): ");
        String date = sc.next();
        boolean isDate = UserDataValidations.checkFormatDate(date);
        if (isDate == true) {
            System.out.println("Good");
        } else {
            System.out.println("Bad");
        }
    }

    static void testCalculateAge() {
        System.out.print("Ingresa tu fecha de nacimiento (dd/mm/aaaa): ");
        String date = sc.next();
        System.out.print("Ingresa la fecha actual (dd/mm/aaaa): ");
        String actualDate = sc.next();
        int age = UserDataValidations.calculateAge(date, actualDate);
        System.out.println(age);
    }

    static void testCheckPostalCode() {
        System.out.print("Ingresa un codigo postal: ");
        String zip = sc.next();
        boolean isZip = UserDataValidations.checkPostalCode(zip);
        if (isZip == true) {
            System.out.println("Good");
        } else {
            System.out.println("Bad");
        }
    }

    static void testIsNumeric() {
        System.out.print("Ingresa un numero: ");
        String str = sc.next();
        boolean isNum = UserDataValidations.isNumeric(str);
        if (isNum == true) {
            System.out.println("Good");
        } else {
            System.out.println("Bad");
        }
    }

    static void testIsAlphabetic() {
        System.out.print("Ingresa una palabra: ");
        String str = sc.next();
        boolean isLet = UserDataValidations.isAlphabetic(str);
        if (isLet == true) {
            System.out.println("Good");
        } else {
            System.out.println("Bad");
        }
    }

    static void testCheckEmail() {
        System.out.print("Ingresa un email: ");
        String str = sc.next();
        boolean isEmail = UserDataValidations.checkEmail(str);
        if (isEmail == true) {
            System.out.println("Good");
        } else {
            System.out.println("Bad");
        }
    }

    static void testCheckName() {
        System.out.print("Ingresa un nombre: ");
        String str = sc.next();
        boolean isName = UserDataValidations.checkName(str);
        if (isName == true) {
            System.out.println("Good");
        } else {
            System.out.println("Bad");
        }
    }
}