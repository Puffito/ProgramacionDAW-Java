package UD3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Palindromo {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce una cadena de texto para ver si es palíndromo");
        String frase = br.readLine();

        if (checkPalindromo(frase)) System.out.println("Es palíndromo");
        else System.out.println("No es palíndromo");
    }

    static boolean checkPalindromo(String frase) {

        frase = frase.replaceAll("\\s+", "").toLowerCase();
        char[] derecho = new char[frase.length()];
        char[] inverso = new char[frase.length()];

        for (int i = 0; i < frase.length(); i++) {
            inverso[frase.length() - i - 1] = derecho[i] = frase.charAt(i);
        }

        return Arrays.equals(derecho, inverso);
    }
}
