package UD4.Enums;
import java.util.Arrays;
import java.util.Random;

public class Mazo {
    public static void main(String[] args) {
        Carta[] mazo = new Carta[8];
        Random ran = new Random();
        for(int i = 0 ; i < mazo.length; i++){
            mazo[i] = new Carta(ran.nextInt(1,14), randomPalo());
        }
        System.out.println(Arrays.toString(mazo));
        System.out.println("Puntos:");
        int total = 0;
        for(Carta carta : mazo){
            total += carta.getNum() * carta.getPalo().getValor();
            System.out.println(carta.getNum() * carta.getPalo().getValor());
        }
        System.out.println("TOTAL :" + total );
    }

    public static Carta.Palo randomPalo(){
        Random pal = new Random();
        switch (pal.nextInt(1,5)){
            case 1 -> {
                return Carta.Palo.PICA;
            }
            case 2 -> {
                return Carta.Palo.CORAZON;
            }
            case 3 -> {
                return Carta.Palo.TREBOL;
            }
            case 4 -> {
                return Carta.Palo.DIAMANTE;
            }
        }
        return null;
    }
}
