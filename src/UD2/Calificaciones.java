package UD2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calificaciones {
    public static void main(String[] args) throws IOException {

        int totalPositivos = 0, totalNegativos = 0, cantidadPositivos = 0, cantidadNegativos = 0, ceros = 0, numeroActual, i;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (i = 1; i <= 10 ; i++){
            System.out.println("Introduce el número #" + i);
            numeroActual = Integer.parseInt(br.readLine());

           if (numeroActual > 0) {
               totalPositivos += numeroActual;
               cantidadPositivos += 1;
           }
           else if (numeroActual < 0) {
               totalNegativos += numeroActual;
               cantidadNegativos += 1;
           }
           else{
               ceros +=1;
           }
        }
        System.out.println("La media de los números positivos es: " + totalPositivos/cantidadPositivos);
        System.out.println("La media de los números negativos es: " + totalNegativos/cantidadNegativos);
        System.out.println("La cantidad de ceros es: " + ceros);
    }
}
