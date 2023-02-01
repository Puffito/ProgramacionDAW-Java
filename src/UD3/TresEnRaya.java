package UD3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

import static Extras.salidaMejorada.SalidaColores.Colores.*;


public class TresEnRaya {
    static String[][] tablero = new String[3][3];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean fin = false;
        for (String[] strings : tablero) {
            Arrays.fill(strings, " ");
        }
        System.out.println("Bienvenido al tres en raya");

        while (!fin) {
            System.out.println("Elige una casilla");
            mostrarTablero();
            System.out.println("Fila: ");
            int fila = Integer.parseInt(br.readLine());
            System.out.println("Columna: ");
            int columna = Integer.parseInt(br.readLine());
            fin = checkTablero(fila, columna);
            if (!fin) {
                fin = jugadaPC();
            }
        }
        mostrarTablero();
        System.out.println("Gracias por jugar");
    }

    public static void mostrarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                System.out.printf(" %s ", tablero[i][j]);
                if (j < tablero[0].length - 1) {
                    System.out.print("|");
                } else System.out.println();
            }
            if (i < tablero.length - 1) {
                System.out.println("---+---+---");
            } else System.out.println();
        }
    }

    public static boolean checkTablero(int fila, int columna) {
        if (tablero[fila][columna].equals(ANSI_RED + "X" + ANSI_RESET) || tablero[fila][columna].equals(ANSI_BLUE + "O" + ANSI_RESET)) {
            System.out.println("La casilla ya está ocupada");
            return false;
        } else tablero[fila][columna] = ANSI_RED + "X" + ANSI_RESET;

        if (checkVictoria()) {
            System.out.println("¡¡¡Has Ganado!!!");
            return true;
        }
        return checkLleno();
    }

    public static boolean jugadaPC() {
        Random random = new Random();
        boolean correcto = false;

        while (!correcto) {
            int fila = random.nextInt(3);
            int columna = random.nextInt(3);
            if (!tablero[fila][columna].equals(ANSI_RED + "X" + ANSI_RESET) && !tablero[fila][columna].equals(ANSI_BLUE + "O" + ANSI_RESET)) {
                tablero[fila][columna] = ANSI_BLUE + "O" + ANSI_RESET;
                correcto = true;
            }
        }

        if (checkVictoria()) {
            System.out.println("¡¡¡Gana la máquina!!!");
            return true;
        }
        return checkLleno();
    }

    public static boolean checkVictoria() {
        for (int i = 0; i < tablero.length; i++) {
            if (!tablero[i][0].equals(" ") && tablero[i][0].equals(tablero[i][1]) && tablero[i][0].equals(tablero[i][2])
                    || !tablero[0][i].equals(" ") && tablero[0][i].equals(tablero[1][i]) && tablero[0][i].equals(tablero[2][i])) {
                return true;
            }
        }
        return !tablero[1][1].equals(" ") && ((tablero[0][0].equals(tablero[1][1]) && tablero[0][0].equals(tablero[2][2]))
                || (tablero[2][0].equals(tablero[0][2])) && (tablero[2][0].equals(tablero[1][1])));
    }

    public static boolean checkLleno() {
        for (String[] strings : tablero) {
            for (int j = 0; j < tablero[0].length; j++) {
                if (strings[j].equals(" ")) return false;
            }
        }
        System.out.println("Empate.\nFin de la partida");
        return true;
    }
}
