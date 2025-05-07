
package practica05;

import java.util.Scanner;

public class Practica05 {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        sc.useDelimiter("\n");
        
        System.out.print("Please select an exercise (1-5): ");
        
        String opcion = sc.next();
        
        switch (opcion) {
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
            default:
                System.out.println("Incorrect option");
                //exercise06();
        }
    }

    static void exercise01() {
        System.out.print("Enter a day of the week: ");
        String day = sc.next();
        String subject = null;
        switch (day) {
            case "Monday", "MONDAY":
                subject = "PROG";
                break;
            case "Tuesday":
                subject = "BBDD";
                break;
            case "Wednesday":
                subject = "ENT";
                break;
            case "Thursday":
                subject = "SIST";
                break;
            case "Friday":
                subject = "HTML";
                break;
            default:
                System.out.println("Incorrect option");
        }
        System.out.println("The first subject of the day is " + subject + ".");
    }

    static void exercise02() {
        System.out.print("Enter the hour: ");
        String hour = sc.next();
        int hourNum = Integer.parseInt(hour);
        String message;
        
        if (hourNum >= 6 && hourNum <= 12) {
            message = "Good morning";
        } else if (hourNum >= 13 && hourNum <= 20) {
            message = "Good afternoon";
        } else if ((hourNum >= 21 && hourNum <= 24) || (hourNum >= 0 && hourNum <= 5)) {
            message = "Good evening";
        } else if (hourNum >= 0 && hourNum <= 5) {
            message = "Good evening";
        } else {
            message = "Incorrect option";
        }
        System.out.println(message);
    }
    
    static void exercise03() {
        System.out.print("Enter a number (1-7): ");
        String day = sc.next();
        String dayName = null;
        switch (day) {
            case "1":
                dayName = "Monday";
                break;
            case "2":
                dayName = "Tuesday";
                break;
            case "3":
                dayName = "Wednesday";
                break;
            case "4":
                dayName = "Thursday";
                break;
            case "5":
                dayName = "Friday";
                break;
            case "6":
                dayName = "Saturday";
                break;
            case "7":
                dayName = "Sunday";
                break;
            default:
                System.out.println("Incorrect option");
        }
        System.out.println("The corresponding day is " + dayName + ".");
    }
    
    static void exercise04() {
        System.out.print("Enter the number of hours worked: ");
        String hours = sc.next();
        int wage = 0;
        int hoursNum = Integer.parseInt(hours);
        if (hoursNum <= 40) {
            wage = hoursNum * 10;
        } else if (hoursNum > 40) {
            wage = 400 + ((hoursNum - 40) * 12); 
        } else {
            System.out.println("Incorrect number");
        }
        System.out.println("The total weekly wage is $" + wage + ".");
    }
    
    static void exercise05() {
        System.out.print("Enter the day of birth: ");
        String day = sc.next();
        int dayNum = Integer.parseInt(day);
        System.out.print("Enter the month of birth: ");
        String month = sc.next();
        String sign = null;
        
        switch (month) {
            case "January":
                if (dayNum <= 19){ sign = "Capricorn"; } else { sign = "Aquarius"; }
                break;
            case "February":
                if (dayNum <= 18){ sign = "Aquarius"; } else { sign = "Pisces"; }
                break;
            case "March":
                if (dayNum <= 20){ sign = "Pisces"; } else { sign = "Aries"; }
                break;
            case "April":
                if (dayNum <= 19){ sign = "Aries"; } else { sign = "Taurus"; }
                break;
            case "May":
                if (dayNum <= 20){ sign = "Taurus"; } else { sign = "Gemini"; }
                break;
            case "June":
                if (dayNum <= 20){ sign = "Gemini"; } else { sign = "Cancer"; }
                break;
            case "July":
                if (dayNum <= 22){ sign = "Cancer"; } else { sign = "Leo"; }
                break;
            case "August":
                if (dayNum <= 22){ sign = "Leo"; } else { sign = "Virgo"; }
                break;
            case "September":
                if (dayNum <= 22){ sign = "Virgo"; } else { sign = "Libra"; }
                break;
            case "October":
                if (dayNum <= 22){ sign = "Libra"; } else { sign = "Scorpio"; }
                break;
            case "November":
                if (dayNum <= 21){ sign = "Scorpio"; } else { sign = "Sagittarius"; }
                break;
            case "December":
                if (dayNum <= 21){ sign = "Sagittarius"; } else { sign = "Capricorn"; }
                break;
            default:
                System.out.println("Incorrect option");
        }
        
        System.out.println("Your horoscope is " + sign + ".");
    }

    /*
    static void exercise06() {
        System.out.print("Enter the number: ");
        int day = sc.nextInt();
        switch (day) {
            case 1-5:
                System.out.println("Weekdays");
                break;
            case 6 - 7:
                System.out.println("Weekends");
                break;
            default:
                System.out.println("Error");
                throw new AssertionError();
        }
    }
    */
} 