package UD3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CuentaVocales {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce la frase para contar vocales");
        String frase = br.readLine();
        cuentaVocales(frase);
    }

    static void cuentaVocales(String frase) {
        char[] vocales = {'A', 'E', 'I', 'O', 'U'};
        frase = frase.toUpperCase();
        for (int i = 0; i < 5; i++) {
            int contador = 0;
            for (int j = 0; j < frase.length(); j++) {
                if (frase.charAt(j) == vocales[i]) contador++;
            }
            System.out.println("Nº de " + vocales[i] + ": " + contador);
        }
    }
}
