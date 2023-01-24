package UD2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CajaFuerte {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int combinacion = 6456, numeroIntroducido, intentos;
        boolean correcto = false;

        for(intentos= 0 ; intentos<4 ; intentos++){
            System.out.printf("""
            Introduzca la combinación de la caja.
            Intentos restantes: %d
            """, 4 - intentos);
            numeroIntroducido = Integer.parseInt(br.readLine());
            if(numeroIntroducido== combinacion){
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                correcto = true;
                intentos = 5;
            }
            else{
                System.out.println("Lo siento, esa no es la combinación");
            }
        }
        if (!correcto){
            System.out.println("""
                    Número máximo de intentos alcanzados.
                    La caja se cerrará para siempre.
                    """);
        }
    }
}
