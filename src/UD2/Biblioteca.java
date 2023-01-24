package UD2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Biblioteca {

    public static void main(String[] args) throws IOException {

        String mes;
        int librosPrestados;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduce el mes en el que estamos");
        mes = br.readLine();

        System.out.println("Cantidad de libros prestados");
        librosPrestados = Integer.parseInt(br.readLine());

        Libro libro = new Libro();

        System.out.println("Título del libro");
        libro.setNombre(br.readLine());

        System.out.println("Número de consultas en este mes");
        libro.setConsultas(Byte.parseByte(br.readLine()));

        System.out.println("Total de prestamos en este mes");
        libro.setPrestamos(Integer.parseInt(br.readLine()));

        libro.tasaDeConsulta(mes,librosPrestados);
    }
}
