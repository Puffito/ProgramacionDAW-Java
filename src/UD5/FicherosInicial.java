package UD5;

import java.io.*;

public class FicherosInicial {
    public static void main(String[] args) throws IOException {
        if(!(new File("fichero.txt")).exists()){
            System.out.println("Fichero Inexistante");
        }else {
            File salida = new File("salida.txt");
            salida.createNewFile();
            FileReader in = new FileReader("fichero.txt");
            FileWriter out = new FileWriter(salida);
            int oneChar;
            while ((oneChar = in.read()) != -1) {
                out.write(oneChar);
            }
            in.close();
            out.close();
        }
    }
}
