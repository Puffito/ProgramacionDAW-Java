package UD5;

import java.io.*;

public class Tarea1 {
    public static void main(String[] args) {
        try {
            if (!(new File("fichero.txt")).exists()) {
                throw new IOException("Fichero Inexistante");
            }

            BufferedReader br = new BufferedReader(new FileReader("fichero.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line.replaceAll(" ", "").trim());
            }
            br.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
