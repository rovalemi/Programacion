
package examples;

import java.util.Random;
import java.util.Scanner;

public class Battleship {
    
    static Scanner sc = new Scanner(System.in);
    static Random rad = new Random();
    
    public static void main(String[] args) {
        
        sc.useDelimiter("\n");
        
        String[][] tableroJugador = new String[5][5];
        String[][] tableroEnemigo = new String[5][5];
        String[][] tableroDisparos = new String[5][5];
        
        boolean turnoJugador = true;
        inicializarTablero(tableroJugador);
        inicializarTablero(tableroEnemigo);
        inicializarTablero(tableroDisparos);
        
        System.out.println("Welcome to Battleship");
        System.out.print("\nPlease introduce your name: ");
        String name = sc.next();
        System.out.println("\nHello captain " + name + "!");
        
        System.out.println("\nThis is your board:");
        imprimirTablero(tableroJugador);
        
        System.out.println("\nPlease place your ship and separate the different positions by commas (e.g., A1,A2): ");
        String ship = sc.next().toUpperCase().replaceAll(" ", " ");
        String[] barco1 = ship.split(",");
        
        for (String coordenada : barco1) {
            int fila = coordenada.charAt(1) - '1';
            int col = coordenada.charAt(0) - 'A';
            tableroJugador[fila][col] = "*";
        }
        
        System.out.println("\nYour updated board with your ship:");
        imprimirTablero(tableroJugador);
        
        colocarBarcoEnemigo(tableroEnemigo);
        
        System.out.println("\nThis is your enemy's board (you can only see your attempts): ");

        imprimirTablero(tableroDisparos);
        
        System.out.println("");

        while (true) {
            turnoJugador = manejarTurno(turnoJugador, tableroJugador, tableroEnemigo, tableroDisparos);
            
            if (todosBarcosHundidos(tableroEnemigo)) {
                System.out.println("Congratulations, you have sunk all enemy ships!");
                break;
            } else if (todosBarcosHundidos(tableroJugador)) {
                System.out.println("The enemy has sunk all your ships. You lost!");
                break;
            }
        }
    }
    
    static boolean manejarTurno(boolean turnoJugador, String[][] tableroJugador, String[][] tableroEnemigo, String[][] tableroDisparos) {
        if (turnoJugador) {
            System.out.println("It's your turn:");
            disparoJugador(tableroEnemigo, tableroDisparos);
        } else {
            System.out.println("It's the enemy's turn...");
            disparoMaquina(tableroJugador);
        }
        return !turnoJugador;
    }
    
    static void disparoMaquina(String[][] tableroJugador) {
        System.out.println("The enemy is firing...");
        boolean disparoRealizado = false;
        
        while (!disparoRealizado) {
            int filaDisp = rad.nextInt(5);
            int colDisp = rad.nextInt(5);
            
            if (!tableroJugador[filaDisp][colDisp].equals("O") && !tableroJugador[filaDisp][colDisp].equals("X")) {
                if (tableroJugador[filaDisp][colDisp].equals("*")) {
                    System.out.println("The enemy hit your ship at " + (char)(colDisp + 'A') + (filaDisp + 1) + "!");
                    tableroJugador[filaDisp][colDisp] = "-";
                } else {
                    System.out.println("The enemy missed at " + (char)(colDisp + 'A') + (filaDisp + 1) + ".");
                    tableroJugador[filaDisp][colDisp] = "O";
                }
                disparoRealizado = true;
            }
        }
        System.out.println("Your board after the machine's shot:");
        imprimirTablero(tableroJugador);
    }

    static void colocarBarcoEnemigo(String[][] tableroEnemigo) {
        boolean colocado = false;
        
        while (!colocado) {
            int filaInicio = rad.nextInt(5);
            int colInicio = rad.nextInt(5);
            boolean esHorizontal = rad.nextBoolean();
            
            int fila2 = filaInicio;
            int col2 = colInicio;
            
            if (esHorizontal) {
                col2 = colInicio + 1;
                if (col2 >= 5) col2 = colInicio - 1;
            } else {
                fila2 = filaInicio + 1;
                if (fila2 >= 5) fila2 = filaInicio - 1;
            }
            
            if (tableroEnemigo[filaInicio][colInicio].equals("-") && tableroEnemigo[fila2][col2].equals("-")) {
                tableroEnemigo[filaInicio][colInicio] = "*";
                tableroEnemigo[fila2][col2] = "*";
                colocado = true;
            }
        }
    }

    static void disparoJugador(String[][] tableroEnemigo, String[][] tableroDisparos) {
        System.out.println("Enter your shot (example: A1): ");
        String disparo = sc.next().toUpperCase().replaceAll(" ", " ");
        
        if (disparo.length() == 2) {
            int filaDisp = disparo.charAt(1) - '1';
            char colDispChar = disparo.charAt(0);
            int colDisp = colDispChar - 'A';

            if (colDisp >= 0 && colDisp < 5 && filaDisp >= 0 && filaDisp < 5) {
                if (tableroEnemigo[filaDisp][colDisp].equals("*")) {
                    System.out.println("You hit the enemy's ship!");
                    tableroDisparos[filaDisp][colDisp] = "X";
                    tableroEnemigo[filaDisp][colDisp] = "-";
                } else {
                    System.out.println("Miss. Try again on your next turn.");
                    tableroDisparos[filaDisp][colDisp] = "O";
                }
            } else {
                System.out.println("Coordinates out of range (A1-E5).");
            }
        } else {
            System.out.println("Invalid format. Enter something like A1.");
        }
        
        System.out.println("Your shooting board: ");
        imprimirTablero(tableroDisparos);
    }

    static boolean todosBarcosHundidos(String[][] tableroEnemigo) {
        for (int i = 0; i < tableroEnemigo.length; i++) {
            for (int j = 0; j < tableroEnemigo[i].length; j++) {
                if (tableroEnemigo[i][j].equals("*")) {
                    return false;
                }
            }
        }
        return true;
    }
    
    static void inicializarTablero(String[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = "-";
            }
        }
    }
    
    static void imprimirTablero(String[][] tablero) {
        System.out.print(" ");
        
        for (char c = 'A'; c < 'F'; c++) {
            System.out.print("  ");
            System.out.printf("%3s", "  " + c + "");
        }
        System.out.println("");
        
        for (int i = 0; i < tablero.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.printf("%5s", tablero[i][j] + " ");
            }
            System.out.println("");
        }
    }
}