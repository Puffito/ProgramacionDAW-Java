package UD3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import static UD3.OperacionesConcesionario.*;

public class Concesionario {
    static Coche[] listaCoches = new Coche[10];
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        menu();
        System.out.println("Gracias por usar la base de datos");
    }
    private static void menu() throws IOException {

        boolean salir = false;
        while (!salir) {

            System.out.println("""
                    Bienvenido a la base de datos del Concesionario
                    ¿Qué desea hacer?
                    1. Añadir Coche
                    2. Ordenar por Marca
                    3. Mayor Precio
                    4. Búsqueda
                    5. Ver
                    0. Salir
                    """);

            switch (br.readLine()) {
                case ("1") -> carga();
                case ("2") -> {
                    OperacionesConcesionario.OrdenarMayorMenorBurbuja(listaCoches);
                    Ver(listaCoches);
                }
                case ("3") -> mayorPrecio(listaCoches);
                case ("4") -> buscaDicotomicaPrecio(listaCoches);
                case ("5") -> Ver(listaCoches);
                case ("0") -> salir = true;
                default -> System.out.println("Opción no válida");
            }
        }
    }
    private static void carga() throws IOException {
        System.out.println("Introduce la marca del coche");
        String marca = br.readLine();
        System.out.println("Introduce el modelo del coche");
        String modelo = br.readLine();
        System.out.println("Introduce el precio base del coche");
        float precio_base = Float.parseFloat(br.readLine());
        System.out.println("Introduce el aire_acondicionado del coche");
        String aire_acondicionado = br.readLine();
        System.out.println("Introduce el cierre_central del coche");
        String cierre_central = br.readLine();
        System.out.println("Introduce la pintura_metalizada del coche");
        String pintura_metalizada = br.readLine();
        System.out.println("Introduce el tipo_motor del coche");
        String tipo_motor = br.readLine();
        listaCoches[Coche.numCoches] = new Coche(marca,modelo,aire_acondicionado,cierre_central,pintura_metalizada,tipo_motor,precio_base);
    }
}
