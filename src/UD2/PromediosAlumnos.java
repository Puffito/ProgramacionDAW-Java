package UD2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PromediosAlumnos {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean salida =true;

        while (salida) {
            System.out.println("""
                    Elige la tarea a realizar:
                    1.Calcular el promedio de un Alumno
                    2.Salir del programa""");

            int choice = Integer.parseInt(br.readLine());

            if (choice == 1) {
                crearAlumno();
            } else {
                System.out.println("Muchas gracias por usar este programa. ¡Que tenga un buen día!");
                salida = false;
            }
        }


    }

    static void crearAlumno() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca el nombre del Alumno");
        Alumno alumnoNuevo = new Alumno(br.readLine());
        alumnoNuevo.hacerPromedio();

    }
}
