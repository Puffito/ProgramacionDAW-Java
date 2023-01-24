package UD2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class DobleTriple {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escribe un número para ver su doble y triple");
        int num = Integer.parseInt(br.readLine());
        System.out.printf("El doble y el triple de %d son %d y %d", num, (num*2), (num*3));
    }
}

