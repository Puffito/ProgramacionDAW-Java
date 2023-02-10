package UD3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OperacionesConcesionario {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void OrdenarMayorMenorBurbuja(Coche[] coches) {
        boolean ordenado = false;
        int intercambios = 0;
        while (!ordenado) {
            for (int i = 0; i < Coche.numCoches -1; i++) {
                if (coches[i].getMarca().compareToIgnoreCase(coches[i + 1].getMarca()) > 0) {
                    Coche ayuda = coches[i + 1];
                    coches[i + 1] = coches[i];
                    coches[i] = ayuda;
                    intercambios++;
                }
            }
            if (intercambios == 0) ordenado = true;
            intercambios = 0;
        }
    }

    public static void mayorPrecio(Coche[] coches) {
        int mayor = 0;
        for (int i = 0; i < Coche.numCoches; i++) {
            if (coches[i].getPrecio_base() > mayor) mayor = i;
        }
        System.out.println(coches[mayor].toString());
    }
    public static void buscaDicotomicaPrecio(Coche[] coches) throws IOException {
        boolean ordenado = false;
        int intercambios = 0;
        while (!ordenado) {
            for (int i = 0; i < Coche.numCoches-1; i++) {
                if (coches[i].getPrecio_base() > coches[i+1].getPrecio_base()) {
                    Coche ayuda = coches[i + 1];
                    coches[i + 1] = coches[i];
                    coches[i] = ayuda;
                    intercambios++;
                }
            }
            if (intercambios == 0) ordenado = true;
            intercambios = 0;
        }
        System.out.println("Qué precio buscas?");
        int key = Integer.parseInt(br.readLine());
        int index = Integer.MAX_VALUE;
        int low = 0;
        int high = Coche.numCoches;
        while (low <= high) {

            int mid = (low + high) / 2;

            if (coches[mid].getPrecio_base() < key) {
                low = mid + 1;
            } else if (coches[mid].getPrecio_base() > key) {
                high = mid - 1;
            } else if (coches[mid].getPrecio_base() == key) {
                index = mid;
                break;
            }
        }
        if(index == Integer.MAX_VALUE) System.out.println("No se encontro el valor");
        else{
        System.out.println(coches[index].toString());}
    }

    public static void Ver(Coche[] coches) {
        for (int i= 0 ; i<Coche.numCoches;i++) {
            System.out.println(coches[i].toString());
        }
    }
}
