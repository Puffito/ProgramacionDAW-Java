package UD4.Entregable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Inventario {
    static private ArrayList<Mascotas> inventario = new ArrayList<>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        menuInventario(inventario);
        System.out.println("Gracias por usar el programa!");
    }

    public static void menuInventario(ArrayList<Mascotas> inventario) throws IOException {

        boolean salir = false;
        while(!salir) {
            System.out.println("""
                    Bienvenido a la tienda de animales!
                    ¿Qué desea hacer?
                    1.Mostrar lista de animales
                    2.Mostrar un animal en concreto
                    3.Mostrar todos los datos
                    4.Insertar un animal en el inventario
                    5.Eliminar un animal del inventario
                    6.Vaciar el inventario
                    0.Salir de la aplicación
                    """);
            switch (Integer.parseInt(br.readLine())) {
                case 1 -> mostarLista();
                case 2 -> mostarAnimal();
                case 3 -> mostrarTodo();
                case 4 -> insertarAnimal();
                case 5 -> eliminarAnimal();
                case 6 -> vaciarInventario();
                case 0 -> salir = true;
                default -> System.out.println("Opción Incorrecta");
            }
        }
    }

    public static void mostarLista(){
        for (Mascotas help : inventario) {
            System.out.println(help.muestra());
        }
    }
    public static void mostarAnimal() throws IOException {
        System.out.println("Introduce el nombre del animal");
        String nombre  = br.readLine();
        for (Mascotas help : inventario) {
            if (help.getNombre().equalsIgnoreCase(nombre)){
                System.out.println(help);
                return;
            }
        }
        System.out.println("No se encuentra ese animal");
    }

    public static void mostrarTodo(){
        for (Mascotas help : inventario) {
            System.out.println(help);
        }
    }
    public static void insertarAnimal() throws IOException {
        System.out.println("""
                            Qué animal quieres insertar?
                            1.Perro
                            2.Gato
                            3.Loro
                            4.Canario
                            """);
        switch (Integer.parseInt(br.readLine())){
            case 1-> insertarPerro();
            case 2 -> insertarGato();
            case 3 -> insertarLoro();
            case 4 -> insertarCanario();
            default -> System.out.println("Opción Incorrecta");
        }
    }

    public static void insertarPerro() throws IOException {
        boolean pulgas = false;
        System.out.println("Inserta el nombre del perro");
        String name = br.readLine();
        System.out.println("Inserta la edad del perro");
        int edad = Integer.parseInt(br.readLine());
        System.out.println("Inserta el estado del perro");
        String estado = br.readLine();
        System.out.println("Inserta la fecha de nacimiento del perro");
        String fechaNac = br.readLine();
        System.out.println("Inserta la raza del perro");
        String raza = br.readLine();
        System.out.println("Tiene pulgas el perro?");
        if (br.readLine().equalsIgnoreCase("si")){pulgas = true;}
        inventario.add(new Perro(name,estado,edad,fechaNac,raza,pulgas));
    }

    public static void insertarGato() throws IOException {
        boolean peloLargo = false;
        System.out.println("Inserta el nombre del gato");
        String name = br.readLine();
        System.out.println("Inserta la edad del gato");
        int edad = Integer.parseInt(br.readLine());
        System.out.println("Inserta el estado del gato");
        String estado = br.readLine();
        System.out.println("Inserta la fecha de nacimiento del gato");
        String fechaNac = br.readLine();
        System.out.println("Inserta el color del gato");
        String color = br.readLine();
        System.out.println("Tiene pelo largo el gato?");
        if (br.readLine().equalsIgnoreCase("si")){peloLargo = true;}
        inventario.add(new Gato(name,estado,edad,fechaNac,color,peloLargo));
    }
    public static void insertarLoro() throws IOException {
        boolean habla = false;
        boolean vuela = false;
        System.out.println("Inserta el nombre del loro");
        String name = br.readLine();
        System.out.println("Inserta la edad del loro");
        int edad = Integer.parseInt(br.readLine());
        System.out.println("Inserta el estado del loro");
        String estado = br.readLine();
        System.out.println("Inserta la fecha de nacimiento del loro");
        String fechaNac = br.readLine();
        System.out.println("Inserta el origen del loro");
        String origen = br.readLine();
        System.out.println("Inserta el tipo de pico del loro");
        String pico = br.readLine();
        System.out.println("Vuela el loro?");
        if (br.readLine().equalsIgnoreCase("si")){vuela = true;}
        System.out.println("Habla el loro?");
        if (br.readLine().equalsIgnoreCase("si")){habla = true;}
        inventario.add(new Loro(name,estado,edad,fechaNac,pico,vuela,origen,habla));
    }
    public static void insertarCanario() throws IOException {
        boolean canta = false;
        boolean vuela = false;
        System.out.println("Inserta el nombre del canario");
        String name = br.readLine();
        System.out.println("Inserta la edad del canario");
        int edad = Integer.parseInt(br.readLine());
        System.out.println("Inserta el estado del canario");
        String estado = br.readLine();
        System.out.println("Inserta la fecha de nacimiento del canario");
        String fechaNac = br.readLine();
        System.out.println("Inserta el color del canario");
        String color = br.readLine();
        System.out.println("Inserta el tipo de pico del canario");
        String pico = br.readLine();
        System.out.println("Vuela el canario?");
        if (br.readLine().equalsIgnoreCase("si")){vuela = true;}
        System.out.println("Canta el canario?");
        if (br.readLine().equalsIgnoreCase("si")){canta = true;}
        inventario.add(new Canario(name,estado,edad,fechaNac,pico,vuela,color,canta));
    }
    public static void eliminarAnimal() throws IOException {
        System.out.println("Introduce el nombre del animal");
        String nombre  = br.readLine();
        for (Mascotas help : inventario) {
            if (help.getNombre().equalsIgnoreCase(nombre)){
                inventario.remove(help);
                return;
            }
        }
        System.out.println("No se encuentra ese animal");
    }
    public static void vaciarInventario(){
        System.out.println("Inventario borrado");
        inventario.clear();
    }

}
