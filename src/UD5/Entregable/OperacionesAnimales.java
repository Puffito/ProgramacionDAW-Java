package UD5.Entregable;

import java.io.*;

public class OperacionesAnimales {
    private static Perro[] arrayPerro = new Perro[5];
    private static int contadorPerros = 0;
    private static  Gato[] arrayGato = new Gato[5];
    private static int contadorGatos = 0;

    public static boolean addPerro(Perro nuevoPerro){
        if(contadorPerros < 5){
            arrayPerro[contadorPerros]= nuevoPerro;
            contadorPerros++;
            return true;
        }
        return false;
    }
    public static boolean addGato(Gato nuevoGato){
        if(contadorGatos < 5){
            arrayGato[contadorGatos]= nuevoGato;
            contadorGatos++;
            return true;
        }
        return false;
    }
    public static void guardarAnimalesADisco(String fichero){
        try (FileOutputStream fos = new FileOutputStream(fichero);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.write(contadorGatos+contadorPerros);
            for (int i = 0; i < contadorPerros-1; i++) {
                oos.writeObject(arrayPerro[contadorPerros-1]);
            }
            for (int i = 0; i < contadorGatos-1; i++) {
                oos.writeObject(arrayGato[contadorGatos-1]);
            }
            fos.close();
            oos.flush();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void leerAnimalesDisco(String fichero){
        try (FileInputStream fis = new FileInputStream(fichero);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            int animalesTotal = ois.readInt();
            System.out.println("Se leerán "+ animalesTotal +" animales.");
            int contEscribePerro = 0;
            int contEscribeGato = 0;
            for (int i = 0; i < animalesTotal; i++) {
                Animal in = (Animal) ois.readObject();
                if (in instanceof Perro){
                    arrayPerro[contEscribePerro]= (Perro) in;
                    System.out.println("Perro " + in.toString());
                    contEscribePerro++;
                }
                if (in instanceof Gato){
                    arrayGato[contEscribeGato]= (Gato) in;
                    System.out.println("Gato " + in.toString());
                    contEscribeGato++;
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
