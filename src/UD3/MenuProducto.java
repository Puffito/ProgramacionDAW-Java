package UD3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MenuProducto {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Producto> listaProductos = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        boolean salida = false;

        //Menú para elegir la tarea a revisar
        while (!salida) {
            System.out.println("""
                    Elige la tarea a realizar:
                     1.Añadir objetos a la colección usando un bucle adecuado.
                     2.Listar los productos almacenados.
                     3.Sumar filas (Media de cada precio producto en las tres ciudades).
                     4.Clasificar por productos/ordenación.
                     5.Buscar un producto(dicotómica).
                     6.Salir del programa""");

            int choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1 -> anadirProducto();
                case 2 -> mostrarProductos();
                case 3 -> sumarProducto();
                case 4 -> ordenarProducto();
                case 5 -> buscarProducto();
                case 6 -> {
                    System.out.println("Muchas gracias por usar este programa. ¡Que tenga un buen día!");
                    salida = true;
                }
                default -> System.out.println("Opción Incorrecta.");
            }
        }
    }

    static void anadirProducto() throws IOException {
        System.out.println("Introduce nombre del producto");
        String nombre = br.readLine();
        listaProductos.add(new Producto(nombre));
    }

    static void mostrarProductos() {
        if (listaProductos.size() > 0) {
            System.out.println(listaProductos);
        } else System.out.println("No hay elementos en la lista.");
    }

    static void sumarProducto() {
        int contadorVigo = 0;
        int contadorSantiago = 0;
        int contadorMadrid = 0;
        float sumaVigo = 0;
        float sumaSantiago = 0;
        float sumaMadrid = 0;

        for (Producto producto : listaProductos) {
            if (producto.getPrecioVigo() > 0) {
                sumaVigo += producto.getPrecioVigo();
                contadorVigo++;
            }
            if (producto.getPrecioSantiago() > 0) {
                sumaSantiago += producto.getPrecioSantiago();
                contadorSantiago++;
            }
            if (producto.getPrecioMadrid() > 0) {
                sumaMadrid += producto.getPrecioMadrid();
                contadorMadrid++;
            }
        }
        if (contadorVigo > 0) System.out.println("La media de precio en Vigo es: " + sumaVigo / contadorVigo);
        if (contadorSantiago > 0)
            System.out.println("La media de precio en Santiago es: " + sumaSantiago / contadorSantiago);
        if (contadorMadrid > 0) System.out.println("La media de precio en Madrid es: " + sumaMadrid / contadorMadrid);
    }

    static void ordenarProducto() {
        listaProductos.sort((o1, o2) -> o1.getNombre().compareToIgnoreCase(o2.getNombre()));
    }

    static void buscarProducto() throws IOException {
        System.out.println("¿Qué producto quieres buscar?");
        String nombreProducto = br.readLine();
        Comparator<Producto> c = (o1, o2) -> o1.getNombre().compareToIgnoreCase(o2.getNombre());
        System.out.println(listaProductos.get(Collections.binarySearch(listaProductos, new Producto(nombreProducto, 0), c)));
    }
}