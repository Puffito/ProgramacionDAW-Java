package UD5.Entregable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        String entrada;
        do {
            System.out.println("""
                    ¡Bienvenido al programa!
                    ¿Qué desea hacer?
                    1.Añadir Perro
                    2.Añadir Gato
                    3.Guardar Animales
                    4.Leer Animales
                    0.Salir
                    """);
            entrada = br.readLine();
            switch (entrada) {
                case "1" -> añadirPerro();
                case "2" -> añadirGato();
                case "3" -> OperacionesAnimales.guardarAnimalesADisco("animales.txt");
                case "4" -> OperacionesAnimales.leerAnimalesDisco("animales.txt");
                case "0" -> System.out.println("Adios");
                default -> System.out.println("Opción Incorrecta");
            }
        } while (!entrada.equals("0"));
    }
    public static void añadirPerro() throws IOException {
        System.out.println("Nombre del Perro");
        String nombre = br.readLine();
        System.out.println("Edad del Perro");
        int edad = Integer.parseInt(br.readLine());
        System.out.println("¿Tiene rabo largo?");
        String rabo = br.readLine();
        boolean raboLargo = rabo.equalsIgnoreCase("si");
        System.out.println(OperacionesAnimales.addPerro(new Perro(nombre,edad,raboLargo)));
    }

    public static void añadirGato() throws IOException {
        System.out.println("Nombre del Gato");
        String nombre = br.readLine();
        System.out.println("Edad del Gato");
        int edad = Integer.parseInt(br.readLine());
        System.out.println("¿Tiene bigotes largos?");
        String bigotes = br.readLine();
        boolean bigoteLargo = bigotes.equalsIgnoreCase("si");
        System.out.println(OperacionesAnimales.addGato(new Gato(nombre,edad,bigoteLargo)));
    }
}
