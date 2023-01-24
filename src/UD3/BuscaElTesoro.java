package UD3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class BuscaElTesoro {

    public static void main(String[] args) throws IOException {

        char[][] tableroReal = crearTablero(4, 5);
        char[][] tableroJugador = new char[4][5];
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        boolean finPartida = false;

        while (!finPartida) {
            for (char[] linea : tableroJugador) {
                System.out.println(Arrays.toString(linea));
            }
            System.out.println("Adivina en que coordenada está el tesoro, cuidado con la mina");
            System.out.println("Introduce la fila (máx.4)");
            int fila = Integer.parseInt(br.readLine());
            System.out.println("Introduce la columna (máx.5)");
            int columna = Integer.parseInt(br.readLine());

            switch (tableroReal[fila - 1][columna - 1]) {
                case 'G' -> {
                    System.out.println("¡¡¡Has encontrado el oro!!!");
                    tableroJugador[fila - 1][columna - 1] = 'G';
                    finPartida = true;
                }
                case '*' -> {
                    System.out.println("BOOM!!! \nMoriches...");
                    tableroJugador[fila - 1][columna - 1] = '*';
                    finPartida = true;
                }
                default -> {
                    System.out.println("Solo hay agua...");
                    tableroJugador[fila - 1][columna - 1] = 'X';
                    detectarMina(tableroReal, fila - 1, columna - 1);
                }

            }
        }
        for (char[] linea : tableroJugador) {
            System.out.println(Arrays.toString(linea));
        }
    }

    private static void detectarMina(char[][] tableroReal, int fila, int columna) {
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if(((fila+i >=0)&&(fila+i<tableroReal.length))&&((columna+j >=0)&&(columna+j<tableroReal[0].length))) {
                    if (tableroReal[fila + i][columna + j] == '*') {
                        System.out.println("¡Cuidado con la mina!");
                    }
                }
            }
        }
    }

    public static char[][] crearTablero(int fila, int columna) {
        Random r = new Random();
        char[][] tablero = new char[fila][columna];
        tablero[r.nextInt(fila)][r.nextInt(columna)] = 'G';
        boolean correcto = false;
        while (!correcto) {
            int filaMina = r.nextInt(fila);
            int columnaMina = r.nextInt(columna);
            if (tablero[filaMina][columnaMina] == 0) {
                tablero[filaMina][columnaMina] = '*';
                correcto = true;
            }
        }
        return tablero;
    }
}

