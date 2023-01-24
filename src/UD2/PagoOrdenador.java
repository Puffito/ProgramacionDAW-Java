package UD2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PagoOrdenador {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Escriba la marca del ordenador");
        Ordenador ordenador = new Ordenador(br.readLine());

        System.out.println("¿Cuál es el precio inicial del ordenador?");
        ordenador.setPrecioInicial(Double.parseDouble(br.readLine()));

        System.out.println("""
                    ¿Cuál es la forma de pago?
                    1. Al contado
                    2. En 6 meses
                    3. En 12 meses
                    """);
        byte selector = Byte.parseByte(br.readLine());

        ordenador.calculo(selector);


    }
}
