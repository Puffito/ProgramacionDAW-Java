package UD2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxMinPositivos {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numeroIntroducido = 0, cantidadNumeros = 0, cantidadNumerosImpares = 0, totalNumerosImpares = 0, numMaxPar= 0;

        System.out.println("""
                    ¡Bienvenido!
                    Introduce números positivos enteros para calcular el mínimo, máximo y la media.
                    Introducir un número primo ejecuta el resto del programa.
                    ¡Un saludo!
                    """);

        while(numeroIntroducido >= 0){

            System.out.printf("Introduce el número #%d\n", cantidadNumeros+1);
            numeroIntroducido = Integer.parseInt(br.readLine());

            if (numeroIntroducido >= 0) {
                cantidadNumeros += 1;

                if (numeroIntroducido % 2 == 0) {
                    if (numeroIntroducido > numMaxPar) {
                        numMaxPar = numeroIntroducido;
                    }
                } else {
                    totalNumerosImpares += numeroIntroducido;
                    cantidadNumerosImpares += 1;
                }
            }
        }

        if(cantidadNumeros > 0) {
            System.out.printf("""
                    Se han introducido %d números positivos.
                    La media de los números impares es %f.
                    El mayor de los números pares es %d.
                    """, cantidadNumeros, (float)totalNumerosImpares/cantidadNumerosImpares,numMaxPar);
        }else{
            System.out.println("No hay suficientes números.");
        }
    }
}
