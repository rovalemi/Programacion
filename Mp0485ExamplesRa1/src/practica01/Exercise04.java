
package practica01;

public class Exercise04 {
    
    public static final String SEPARADOR = "+----------------+----------------------+-----------------+-----------------+-----------------+-----------------+";
    public static final String TABLE = "|%15s | %-20s | %-15s | %-15s | %-15s | %-15s |\n";
    
    public static void main (String args[]) {
    
        System.out.println(SEPARADOR);
        System.out.printf(TABLE, "", "DILLUNS", "DIMARTS", "DIMECRES", "DIJOUS", "DIVENDRES");
        System.out.println(SEPARADOR);
        System.out.printf(TABLE, "8:00 - 9:00", "0485", "0487", "0373/1708", "0483", "0484");
        System.out.println(SEPARADOR);
        System.out.printf(TABLE, "9:00 - 10:00", "0485", "0483", "0484", "OPT1", "0179");
        System.out.println(SEPARADOR);
        System.out.printf(TABLE, "10:00 - 11:00", "TUTO", "OPT1", "0484", "0373/1708", "0179");
        System.out.println(SEPARADOR);
        System.out.printf(TABLE, "11:00 - 11:30", "DESCANS", "DESCANS", "DESCANS", "DESCANS", "DESCANS");
        System.out.println(SEPARADOR);
        System.out.printf(TABLE, "11:30 - 12:30", "0373", "0485", "0373/1708", "0484", "0487");
        System.out.println(SEPARADOR);
        System.out.printf(TABLE, "12:30 - 13:30", "0373/1708/OPT2/1665", "0485", "0485", "0485", "0373/1708");
        System.out.println(SEPARADOR);
        System.out.printf(TABLE, "13:30 - 14:30", "1709", "1709", "", "1709", "");
        System.out.println(SEPARADOR);

    }
    
}