package UD2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reloj {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca la altura del reloj de arena");
        int altura = Integer.parseInt(br.readLine());
        int blancos;

        if (altura % 2 != 0 && altura >= 3){
            for (int i = altura ; i > altura/2 ; i--){
                for (int j = 0 ; j < i ; j++){
                    if(j<i){
                        System.out.print("");
                    }

                }
            }
        }
    }

}
