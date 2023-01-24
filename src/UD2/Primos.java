package UD2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Primos {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce un número para ver cuántos primos hay entre 1 y ese múmero.");
        int numIntroducido = Integer.parseInt(br.readLine());
        int i, j, contadorPrimos = 0;
        boolean noEsPrimo = false;
       /*ArrayList<Integer> numerosPrimos = new ArrayList<>();
       numerosPrimos.add(1);*/

        System.out.print("1 ");
        for (i = 2; i < numIntroducido; i++){
            j = 2;
            noEsPrimo = false;
            while (!noEsPrimo){
                if (i % j == 0 && i != j){
                    noEsPrimo = true;
                }
                else if(i == j){
                    System.out.print(j +" ");
                    contadorPrimos += 1;
//                  numerosPrimos.add(j);
                    noEsPrimo = true;
                }
                j++;
            }
        }
        System.out.println("\nHay " + contadorPrimos +" números primos.");
//        System.out.println(numerosPrimos);
    }

}
