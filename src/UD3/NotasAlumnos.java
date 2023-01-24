package UD3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NotasAlumnos {
    static final int maxNotas = 100;
    static Alumno[] database = new Alumno[maxNotas];
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        menuNotas();
        System.out.println("Gracias por usar la base de datos");

    }

    private static void menuNotas() throws IOException {

        boolean salir = false;
        while (!salir) {

            System.out.println("""
                    Bienvenido a la base de datos de las Notas del colegio
                    ¿Qué desea hacer?
                    1. Ver notas
                    2. Añadir nota
                    3. Borrar nota
                    4. Estadísticas
                    5. Ver suspendidos
                    6. Salir
                    """);

            switch (br.readLine()) {
                case ("1") -> verNotas();
                case ("2") -> anadirNota();
                case ("3") -> borrarNota();
                case ("4") -> estadistica();
                case ("5") -> verSuspensos();
                case ("6") -> salir = true;
                default -> System.out.println("Opción Incorrecta");
            }
        }
    }

    private static void verSuspensos() throws IOException {

        System.out.println("Los alumnos suspensos son:");

        for (int i = 0; i < Alumno.getAlumnosTotales(); i++) {
            if (database[i].getNota() < 5) System.out.println(database[i].getName() + " " + database[i].getNota());
        }

        br.readLine();
    }

    private static void estadistica() throws IOException {

        int notaMax = 0;
        int notaMin = 11;
        float suma = 0;

        for (int i = 0; i < Alumno.getAlumnosTotales(); i++) {
            suma += database[i].getNota();
            if (database[i].getNota() > notaMax) notaMax = database[i].getNota();
            if (database[i].getNota() < notaMin) notaMin = database[i].getNota();
        }

        System.out.printf("""
                La media de las notas de los alumnos es: %.2f
                La nota más alta es: %d
                La nota más baja es: %d
                """, suma / Alumno.getAlumnosTotales(), notaMax, notaMin);

        br.readLine();
    }

    private static void borrarNota() throws IOException {

        System.out.println("Introduce la posición de la nota que deseas borrar");
        int posicion = Integer.parseInt(br.readLine());

        if (posicion < Alumno.getAlumnosTotales() && posicion > 0) {

            for (int i = posicion; i < Alumno.getAlumnosTotales(); i++) {
                database[i] = database[i + 1];
            }

            database[Alumno.getAlumnosTotales()] = null;
            Alumno.reducirAlumnosTotales();
            System.out.println("Alumno borrado");

        } else {

            System.out.println("Posición incorrecta");

        }
        br.readLine();
    }

    private static void anadirNota() throws IOException {

        System.out.println("Introduzca el nombre del Alumno");
        String nombre = br.readLine();

        System.out.println("Introduzca la nota del Alumno");
        int nota = Integer.parseInt(br.readLine());

        database[Alumno.getAlumnosTotales()] = new Alumno(nombre, nota);
    }

    private static void verNotas() throws IOException {
        int contador = 0;

        if (Alumno.getAlumnosTotales() > 0) {

            for (int i = 0; i < Alumno.getAlumnosTotales(); i++) {

                System.out.printf("Nota %d: %s %d\n", contador, database[i].getName(), database[i].getNota());
                contador++;

            }

        } else {
            System.out.println("No hay alumnos suficientes");
        }

        br.readLine();
    }
}
