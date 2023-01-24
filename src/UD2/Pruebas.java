package UD2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Pruebas {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean laVerdad = true;

        /*
        if(pregunta.contains("Luis")){
            System.out.println("No, es el mejor.");
        }else{
            System.out.println("Si");
        }*/

        while (laVerdad) {
            System.out.println("Pregunta qué quieres saber del futuro, 0 para salir");
            String pregunta = br.readLine();
            if (pregunta.equals("0")) {
                laVerdad = false;
                System.out.println("Gracias por usar este súper programa.");
            } else {
                respuesta();
            }
        }
    }

    private static void respuesta() {
        Random numero = new Random();
        int respuesta = numero.nextInt(6);
        String texto;

        switch(respuesta){
            case(1) -> texto="Definitivamente";
            case(2) -> texto="Ni de coña";
            case(3) -> texto="Puede ser";
            case(4) -> texto="Es poco probable";
            case(5) -> texto="A lo mejor sí";
            default -> texto="Cualquier cosa puede pasar";
        }
        System.out.println(texto);
    }
}