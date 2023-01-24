package UD3;

import java.util.ArrayList;
import java.util.Random;

public class MetodosAleatorios {
    static void tirarDados(){
        int dado, suma = 0;

        System.out.println("Las tiradas de los 3 dados son:");

        for (int i = 0; i < 3 ; i++){
            dado = (int)(Math.random()*6);
            suma += dado;
            System.out.printf("%d ", dado);
        }
        System.out.println("\nLa suma de los 3 es: " +suma);
    }

    static void veinteNumeros(){
        System.out.println("Los 20 números elegidos son:");

        for (int i = 0; i < 20 ; i++){
           int num = (int)(Math.random()*11);
            System.out.printf("%d ", num);
        }
        System.out.println(" ");
    }

    static void cincuentaNumeros(){
        int max = 100, min = 199, suma = 0;
        System.out.println("Los 50 números elegidos son:");

        for (int i = 0; i < 50 ; i++){
            int num = (int)(Math.random()*100+100);
            suma += num;
            System.out.printf("%d ", num);
            if(num > max) max = num;
            if(num < min) min = num;
        }
        System.out.printf("""
                \nEl máximo es: %d
                El mínimo es: %d
                La media es: %d
                """, max, min, suma/50);
    }
    static void diaDeSemana(){
        System.out.println("El día de la semana mágicos es:");
        int num = (int)(Math.random()*6);
        switch (num) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sábado");
            case 0 -> System.out.println("Domingo");
        }
    }
    static void loteriaPrimitiva(){
        ArrayList<String> resultados = new ArrayList<>();
        int num, reint;
        System.out.println("Los números de la lotería son:");
        for (int i = 0; i < 6 ; i++) {
            do {
                num = (int) (Math.random() * 48 + 1);
                System.out.printf("%d ", num);
            }while(resultados.contains(num));
            resultados.add(String.valueOf(num));
        }
        do{
        reint = (int) (Math.random() * 9);}while(resultados.contains(reint));
        System.out.println("\nReintegro: " + reint);
    }
    static void tragaperras(){
        String[] resultados = {"","",""};
        System.out.println("Tirada de Tragaperras:");
        for (int i = 0; i < 3 ; i++) {
            int num = (int)(Math.random()*5);
            switch (num) {
                case 1 -> resultados[i] = "Corazón";
                case 2 -> resultados[i] = "Diamante";
                case 3 -> resultados[i] = "Herradura";
                case 4 -> resultados[i] ="Campana";
                case 0 -> resultados[i] = "Limón";
            }
            System.out.println(resultados[i] + " ");
        }
        if (resultados[0].equals(resultados[1]) || resultados[1].equals(resultados[2]) || resultados[0].equals(resultados[2])) {
            if (resultados[0].equals(resultados[1]) && resultados[1].equals(resultados[2]))
                System.out.println("Enhorabuena, ha ganado 10 monedas");
            else System.out.println("Bien, ha recuperado su moneda");
        }
        else System.out.println("Lo siento ha perdido");
    }
    static void cartaFrancesa(){
        String[][] mazo = new String[4][13];
        String palo = null;

        for (int i = 0; i < 4; i++) {
            switch (i) {
                case (0) -> palo = "Corazón";
                case (1) -> palo = "Pica";
                case (2) -> palo = "Diamante";
                case (3) -> palo = "Trébol";
            }
            for (int j = 0; j < 13; j++) {
                switch (j) {
                    case (0) -> mazo[i][j] = ("A " + palo);
                    case (12) -> mazo[i][j] = ("K " + palo);
                    case (11) -> mazo[i][j] = ("Q " + palo);
                    case (10) -> mazo[i][j] = ("J " + palo);
                    default -> mazo[i][j] = ((j + 1) + " " + palo);
                }
            }
        }
        Random azar = new Random();
        System.out.println(mazo[azar.nextInt(4)][azar.nextInt(13)]);

    }
    static void cartaEspanola(){
        String[][] mazo = new String[4][12];
        String palo = null;

        for (int i = 0; i < 4; i++) {
            switch (i) {
                case (0) -> palo = "de Oros";
                case (1) -> palo = "de Bastos";
                case (2) -> palo = "de Copas";
                case (3) -> palo = "de Espadas";
            }
            for (int j = 0; j < 12; j++) {
                switch (j) {
                    case (0) -> mazo[i][j] = ("A " + palo);
                    case (11) -> mazo[i][j] = ("Rey " + palo);
                    case (10) -> mazo[i][j] = ("Sota " + palo);
                    case (9) -> mazo[i][j] = ("Caballo " + palo);
                    default -> mazo[i][j] = ((j + 1) + " " + palo);
                }
            }
        }
        Random azar = new Random();
        System.out.println(mazo[azar.nextInt(4)][azar.nextInt(12)]);

    }
}
