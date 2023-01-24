package UD2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxMinPrimos {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean primo = false;
        int numeroIntroducido, cantidadNumeros = 0, totalNumeros = 0, numMax= 0, numMin = 0;

        System.out.println("""
                    ¡Bienvenido!
                    Introduce números positivos enteros para calcular el mínimo, máximo y la media.
                    Introducir un número primo ejecuta el resto del programa.
                    ¡Un saludo!
                    """);

        while(!primo){

            System.out.printf("Introduce el número #%d\n", cantidadNumeros+1);
            numeroIntroducido = Integer.parseInt(br.readLine());

            if (numeroIntroducido > 0){

                for (int i = 2; i <= numeroIntroducido ; i++){
                    if (numeroIntroducido % i == 0 && i != numeroIntroducido){
                        i = numeroIntroducido +1;
                    }
                    else if( i == numeroIntroducido){
                        primo = true;
                    }
                }

                if (!primo){
                    totalNumeros += numeroIntroducido;
                    cantidadNumeros += 1;
                    if (numeroIntroducido > numMax){
                        numMax = numeroIntroducido;
                    }
                    if (numeroIntroducido < numMin || numMin == 0){
                        numMin = numeroIntroducido;
                    }
                }

            }else{
                System.out.println("El número introducido no es correcto");
            }
        }

        if(cantidadNumeros > 0) {
            System.out.printf("""
                    Se han introducido %d números no primos.
                    El número máximo es %d.
                    El número mínimo es %d.
                    La suma de los números es %d.
                    La media es %d.
                    """, cantidadNumeros, numMax, numMin, totalNumeros, totalNumeros / cantidadNumeros);
        }else{
            System.out.println("No hay suficientes números.");
        }

    }
}
