
package practica01;

public class Exercise05 {
    
    public static final String BLC = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GRN = "\u001B[32m";
    public static final String YEL = "\u001B[33m";
    public static final String BLU = "\u001B[34m";
    public static final String MGN = "\u001B[35m";
    public static final String CYA = "\u001B[36m";
    public static final String NEW = "\u001B[38m";
    public static final String RST = "\u001B[0m";
    
    public static final String SEPARADOR = "+-----------------+------------------------+--------------------+--------------------+--------------------+--------------------+";
    public static final String TABLE = "| %24s | %-31s | %-27s | %-27s | %-27s | %-27s |\n";
    
    public static void main (String args[]) {
    
        System.out.println(SEPARADOR);
        System.out.printf(TABLE, BLC+RST, BLC+"DILLUNS"+RST, BLC+"DIMARTS"+RST, BLC+"DIMECRES"+RST, BLC+"DIJOUS"+RST, BLC+"DIVENDRES"+RST);
        System.out.println(SEPARADOR);
        System.out.printf(TABLE, BLC+"8:00 - 9:00"+RST, RED+"0485"+RST, "0487"+RST, "0373/1708"+RST, "0483"+RST, "0484"+RST);
        System.out.printf(TABLE, BLC+"9:00 - 10:00"+RST, RED+"0485"+RST, "0483"+RST, "0484"+RST, "OPT1"+RST, "0179"+RST);
        System.out.printf(TABLE, BLC+"10:00 - 11:00"+RST, "TUTO"+RST, "OPT1"+RST, "0484"+RST, "0373/1708"+RST, "0179"+RST);
        System.out.printf(TABLE, BLC+"11:00 - 11:30"+RST, BLC+"DESCANS"+RST, BLC+"DESCANS"+RST, BLC+"DESCANS"+RST, BLC+"DESCANS"+RST, BLC+"DESCANS"+RST);
        System.out.printf(TABLE, BLC+"11:30 - 12:30"+RST, "0373"+RST, RED+"0485"+RST, "0373/1708"+RST, "0484"+RST, "0487"+RST);
        System.out.printf(TABLE, BLC+"12:30 - 13:30"+RST, "0373/1708/OPT2/1665"+RST, RED+"0485"+RST, RED+"0485"+RST, RED+"0485"+RST, "0373/1708"+RST);
        System.out.printf(TABLE, BLC+"13:30 - 14:30"+RST, "1709"+RST, "1709", BLC+RST, "1709"+RST, BLC+RST);
        System.out.println(SEPARADOR);
   
    }
    
}