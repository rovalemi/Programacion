
package practica10;

import java.util.Scanner;

public class Practica10 {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws InterruptedException {
        
        sc.useDelimiter("\n");
        
        String opcion = "";
        
        while(!opcion.equalsIgnoreCase("z")) {
            System.out.println("Menu:");
            System.out.println("1 - Plase select an exercise (1-6):");
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
                default:
                    System.out.println("Goodbye!");
            }
        }
    }
    
    static void exercise01() {
        int row = 3;
        int col = 6;
        int[][] num = new int[row][col];
        
        num[0][0] = 0;
        num[0][1] = 30;
        num[0][2] = 2;
        num[0][5] = 5;
        num[1][0] = 75;
        num[1][4] = 0;
        num[2][2] = -2;
        num[2][3] = 9;
        num[2][5] = 11;
        
        System.out.printf("%9s | %10s | %10s | %10s | %10s | %10s | %10s |\n", "Array num", "Columna 0", "Columna 1", "Columna 2", "Columna 3", "Columna 4", "Columna 5");
        
        for (int i = 0; i < row; i++) {
            System.out.printf("%11s", "Fila " + i + " |");
            for (int j = 0; j < col; j++) {
                System.out.printf("%11d %1s", num[i][j], "|");  
            }
            System.out.println("");
        }
    }
    
    static void exercise02() {
        int row = 4, col = 5;
        int[][] arrayNum = new int[row][col];
        int sumaFilas, sumaColumnas, sumaTotal = 0;
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Ingrese el numero: ");
                arrayNum[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < row; i++) {
            sumaFilas = 0;
            for (int j = 0; j < col; j++) {
                sumaFilas += arrayNum[i][j];
                System.out.printf("%5d", arrayNum[i][j]);
            }
            System.out.printf("%5d", sumaFilas);
            System.out.println("");
        }
        
        for (int j = 0; j < col; j++) {
            sumaColumnas = 0;
            for (int i = 0; i < row; i++) {
                sumaColumnas += arrayNum[i][j];
                sumaTotal += arrayNum[i][j];
            }
            System.out.printf("%5d", sumaColumnas);
        }
        
        System.out.printf("%5d", sumaTotal);
        System.out.println("");
    }
    
    static void exercise03() throws InterruptedException {
        System.out.print("Ingresa el numero de filas: ");
        int row = sc.nextInt();
        System.out.print("Ingresa el numero de columnas: ");
        int col = sc.nextInt();
        int[][] arrayNum = new int[row][col];
        int sumaFilas, sumaColumnas, sumaTotal = 0, sumaMayor = 0;
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arrayNum[i][j] = (int) (Math.random() * 10);
            }
        }
        
        System.out.println("ARRAY ORIGINAL");
        for (int i = 0; i < row; i++) {
            sumaFilas = 0;
            for (int j = 0; j < col; j++) {
                sumaFilas += arrayNum[i][j];
                System.out.printf("%5d", arrayNum[i][j]);
                if (sumaMayor < sumaFilas) {
                    sumaMayor = sumaFilas;
                }
            }
            Thread.sleep(1000);
            System.out.printf("%5d", sumaFilas);
            System.out.println("");
        }
        
        for (int j = 0; j < col; j++) {
            sumaColumnas = 0;
            for (int i = 0; i < row; i++) {
                sumaColumnas += arrayNum[i][j];
                sumaTotal += arrayNum[i][j];
            }
            Thread.sleep(1000);
            System.out.printf("%5d", sumaColumnas);
        }
        
        System.out.printf("%5d", sumaTotal);
        System.out.println("");
        
        System.out.println("ARRAY ORGANIZADO");
        
        for (int i = 0; i < row; i++) {
            sumaFilas = 0;
            for (int j = 0; j < col; j++) {
                sumaFilas += arrayNum[i][j];
                
                System.out.print(arrayNum[i][j] + " ");
                
            }
        }
        
        //System.out.println(sumaMayor);
    }
    
    static void exercise04() {
        System.out.print("Ingresa el numero de filas: ");
        int row = sc.nextInt();
        System.out.print("Ingresa el numero de columnas: ");
        int col = sc.nextInt();
        int[][] arrayNum = new int[row][col];
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arrayNum[i][j] = (int) (Math.random() * 10);
            }
        }
        
        System.out.println("ARRAY RESULTANTE");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arrayNum[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    static void exercise05() {
        String[][] arrayString = new String[2][2];
        
        for (int i=0; i<2; i++) {
            for (int j=0; j<2; j++) {
                System.out.print(arrayString[i][j]+" ");
            }
            System.out.println("");
        }
        
//        int[][] matriz = {
//            {3, 7, 2},
//            {9, 12, 5},
//            {6, 14, 8}
//        };
//
//        int var = matriz[0][0];
//        
//        for (int i = 0; i < matriz.length; i++) {
//            
//            for (int j = 1; j < matriz[i].length; j++) {
//
//                if (matriz[i][j] > var) {
//
//                    var = matriz[j][j];
//                }
//
//            }
//
//        }
//
//        System.out.println("El valor es: " + var);
    }

    static void exercise06() {
        char[][] tableroUsuario = new char[5][5];
        boolean[][] tableroBarcos = new boolean[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                tableroUsuario[i][j] = '-';
                tableroBarcos[i][j] = false;
            }
        }

        int row = (int) (Math.random() * 4);
        int col = (int) (Math.random() * 4);
        
        for (int i = row; i < row + 2; i++) {
            for (int j = col; j < col + 2; j++) {
                tableroBarcos[i][j] = true;
            }
            System.out.println("");
        }

        boolean juegoActivo = true;
        int aciertos = 0;

        while (juegoActivo) {
            System.out.println("    A   B   C   D   E");
            System.out.println("  +---+---+---+---+---+");
            for (int i = 0; i < 5; i++) {
                System.out.print((i + 1) + " | ");
                for (int j = 0; j < 5; j++) {
                    System.out.print(tableroUsuario[i][j] + " | ");
                }
                System.out.println();
            }
            System.out.println("  +---+---+---+---+---+");
            
            System.out.print("Introduce tu disparo (ejemplo: 4B): ");
            String disparo = sc.next().toUpperCase();

            if (disparo.length() == 2) {
                int fila = disparo.charAt(0) - '1';
                int columna = disparo.charAt(1) - 'A';

                if (fila >= 0 && fila < 5 && columna >= 0 && columna < 5) {
                    if (tableroBarcos[fila][columna]) {
                        tableroUsuario[fila][columna] = '*';
                        if (tableroUsuario[fila][columna] == '*') {
                            System.out.println("Jugada repetida.");
                        } else {
                            tableroUsuario[fila][columna] = '*';
                            System.out.println("Tocado.");
                            aciertos++;
                        }
                    } else {
                        tableroUsuario[fila][columna] = 'x';
                        System.out.println("Agua.");
                    }

                    if (aciertos == 4) {
                        System.out.println("Ganaste.");
                        juegoActivo = false;
                    }
                } else {
                    System.out.println("Disparo no permitido. Intenta de nuevo.");
                }
            } else {
                System.out.println("Formato invalido. Intenta de nuevo.");
            }
        }
    }
}