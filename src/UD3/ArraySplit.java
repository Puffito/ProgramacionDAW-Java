package UD3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraySplit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce una cadena de texto para separarla por palabras");
        String[] frase = br.readLine().split(" ");
        for (String palabra : frase) {
            System.out.println(palabra);
        }
    }
}
