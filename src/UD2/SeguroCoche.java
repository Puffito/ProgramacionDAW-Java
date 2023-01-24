package UD2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeguroCoche {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Nombre del asegurado");
        Seguro seguro = new Seguro(br.readLine());

        System.out.println("Edad del asegurado");
        seguro.setEdad(Integer.parseInt(br.readLine()));

        System.out.println("Años del carnet");
        seguro.setAnosCarnet(Integer.parseInt(br.readLine()));

        System.out.println("Precio del coche");
        seguro.setPrecioCoche(Integer.parseInt(br.readLine()));

        seguro.calcularSeguro();
    }
}
