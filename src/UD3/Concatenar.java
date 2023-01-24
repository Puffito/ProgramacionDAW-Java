package UD3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Concatenar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce un Nombre y dos Apellidos y te haré algo guay");
        String[] nombre = br.readLine().split(" ");
        for(int i = 0; i<3;i++){
            System.out.print(nombre[i].substring(0,3).toUpperCase());
        }
    }
}
