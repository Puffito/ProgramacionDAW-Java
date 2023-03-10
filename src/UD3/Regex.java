package UD3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Regex {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce una cadena de texto para revisarla");
        String frase = br.readLine();
        checkEntero(frase);
        int decimales = 3;
        checkDecimales(frase,decimales);
        checkDNI(frase);
        checkTelefono(frase);
        checkISBN(frase);
        checkNombre(frase);
    }

    static void checkEntero(String frase) {
        if(frase.matches("^-?[0-9]+$")) {
            System.out.println("Es un entero");
        }
    }
    static void checkDecimales(String frase,int decimales) {
        String regex = "^-?[0-9]*[\\.,][0-9]{"+decimales+"}$";
        if(frase.matches(regex)) {
            System.out.println("Tiene 3 decimales");
        }
    }
    static void checkDNI(String frase) {
        if(frase.matches("^[0-9]{8}[A-Z]$")) {
            System.out.println("Es un DNI");
        }
    }
    static void checkISBN(String frase) {
        if(frase.matches("^97[8-9]-?[0-9]-?[0-9]{2}-?[0-9]{6}-?[0-9]$")) {
            System.out.println("Es un ISBN");
        }
    }
    static void checkTelefono(String frase) {
        if(frase.matches("^[0-9]{3}-?[0-9]{3}-?[0-9]{3}$")) {
            System.out.println("Es un teléfono");
        }
    }
    static void checkNombre(String frase) {
        if(frase.matches("^[A-Z][a-z]+$")) {
            System.out.println("Es un Nombre");
        }
    }
}
