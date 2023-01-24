package UD3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArraySumaPositivoNegativo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numeros = new int[20];
        int sumaPosit = 0;
        int sumaNega = 0;


        System.out.println("Introduce veinte números para sumar los positivos y negativos");

        for (int i = 0;i<5;i++){
            numeros[i] = Integer.parseInt(br.readLine());
        }

        for(int num : numeros){
            if (num > 0) sumaPosit += num;
            if (num < 0) sumaNega += num;
        }

        System.out.println(Arrays.toString(numeros) + "\nLa suma de los números positivos es " + sumaPosit
                + "\nLa suma de los números negativos es " + sumaNega);
    }
}
