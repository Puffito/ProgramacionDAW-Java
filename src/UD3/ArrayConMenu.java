package UD3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class ArrayConMenu {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        int[] array = nuevoArrayRandom(10);

        boolean salir = false;
        while(!salir) {
            System.out.println("""
                    Bienvenido al programa del array aleatorio.
                    ¿Qué desea hacer?
                    a.Mostrar valores
                    b.Introducir valor
                    c.Salir""");

            switch (br.readLine()){
                case "a" -> mostrarValores(array);
                case "b" -> introducirValor(array);
                case "c" -> salir = true;
                default -> System.out.println("Opción Incorrecta");
            }
        }
    }

    public static int[] nuevoArrayRandom(int size){
        Random rand = new Random();
        int[] array = new int[size];
        for (int i =0; i < size; i++){
            array[i]= rand.nextInt(100);
        }
        return array;
    }
    public static void  mostrarValores(int[] array){
        for (int i:array) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    public static void introducirValor(int[] array) throws IOException {
        System.out.println("Escribe el número que quieres introducir en el array");
        int numero = Integer.parseInt(br.readLine());
        System.out.println("Escribe la posición del array donde quieres introducir el número");
        int posicion = Integer.parseInt(br.readLine());
        array[posicion] = numero;
    }
}

