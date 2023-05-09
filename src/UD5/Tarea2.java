package UD5;

import java.awt.datatransfer.FlavorEvent;
import java.io.*;

public class Tarea2 {
    public static void main(String[] args) {
        try {
            if (!(new File("fichero1.txt")).exists() || !(new File("fichero2.txt")).exists()) {
                throw new IOException("Fichero Inexistante");
            }

            String fic1 = "fichero1.txt";
            String fic2 = "fichero2.txt";
            String destino = "E:\\IntelliJ\\ProyectoInicialJava";
            fusionFicheros(fic1, fic2, destino);


        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void fusionFicheros(String entrada1, String entrada2, String ruta) throws IOException {
        FileReader fic1 = new FileReader(entrada1);
        FileReader fic2 = new FileReader(entrada2);
        String nombreConcat = entrada1.replace(".txt", "") + "_" + entrada2.replace(".txt", "") + ".txt";
        String rutaFinal = ruta + "\\" + nombreConcat;
        FileWriter destino = new FileWriter(new File(rutaFinal));
        int oneChar;
        while ((oneChar = fic1.read()) != -1) {
            destino.write(oneChar);
        }
        while ((oneChar = fic2.read()) != -1) {
            destino.write(oneChar);
        }
        destino.close();
        fic1.close();
        fic2.close();
    }
}
