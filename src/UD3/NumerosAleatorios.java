package UD3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumerosAleatorios {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean salida = true;

        //Menú para elegir la tarea a revisar
        while (salida) {
            System.out.println("""
                    Elige la tarea a realizar:
                    1.Tirar 3 Dados
                    2.Mostrar 20 números aleatorios entre 0 y 10
                    3.Mostrar 50 números aleatorios entre 100 y 199
                    4.Día de la semana aleatorio
                    5.Lotería primitiva
                    6.Tragaperras
                    7.Carta de baraja francesa
                    8.Carta de baraja española
                    9.Salir del programa""");

            int choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1 -> MetodosAleatorios.tirarDados();
                case 2 -> MetodosAleatorios.veinteNumeros();
                case 3 -> MetodosAleatorios.cincuentaNumeros();
                case 4 -> MetodosAleatorios.diaDeSemana();
                case 5 -> MetodosAleatorios.loteriaPrimitiva();
                case 6 -> MetodosAleatorios.tragaperras();
                case 7 -> MetodosAleatorios.cartaFrancesa();
                case 8 -> MetodosAleatorios.cartaEspanola();
                case 9 -> {
                    System.out.println("Muchas gracias por usar este programa. ¡Que tenga un buen día!");
                    salida = false;
                }
            }
            br.readLine();
        }
    }
}
