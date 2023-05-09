package UD5;

import javax.swing.*;
import java.io.*;

public class Serializacion {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static FileOutputStream file;

    static {
        try {
            file = new FileOutputStream("vehiculos.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static ObjectOutputStream out;

    static {
        try {
            out = new ObjectOutputStream(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Serializacion() throws IOException {
    }

    public static void main(String[] args) throws Exception {

        String entrada;
        do {
            System.out.println("""
                    ¡Bienvenido al programa!
                    ¿Qué desea hacer?
                    1.Meter un coche nuevo
                    2.Ver los coches
                    0.Salir
                    """);
            entrada = br.readLine();
            switch (entrada) {
                case "1" -> meterCoche();
                case "2" -> deserialize();
                case "0" -> System.out.println("Adios");
                default -> System.out.println("Opción Incorrecta");
            }
        } while (!entrada.equals("0"));

        out.close();
        file.close();
    }

    public static void meterCoche() throws IOException {
        System.out.println("Introduce la matricula del coche");
        String matricula = br.readLine();
        System.out.println("Introduce la marca del coche");
        String marca = br.readLine();
        System.out.println("Introduce el tamaño del depósito del coche");
        double deposito = Double.parseDouble(br.readLine());
        System.out.println("Introduce la modelo del coche");
        String modelo = br.readLine();
        serializar(new Vehiculo(matricula, marca, deposito, modelo));
    }


    public static void serializar(Vehiculo vehiculo) throws IOException {


        if(!new File("vehiculos.txt").exists()) {
            out.writeObject(vehiculo);
        }else{
            ObjectOutputStream out1 = new MiObjectOutputStream(new FileOutputStream("vehiculos.txt",new File("vehiculos.txt").exists()));
            out1.writeObject(vehiculo);
        }
    }

    public static void deserialize() throws Exception {
        FileInputStream file = new FileInputStream("vehiculos.txt");
        ObjectInputStream in = new ObjectInputStream(file);

        try {
            while (true) {
                Vehiculo vehiculo = (Vehiculo)in.readObject();
                JOptionPane.showMessageDialog(null,"El vehiculo tiene una matrícula "
                        + vehiculo.getMatricula() + ", su marca es " + vehiculo.getMarca() +
                        ", el tamaño depósito es de "+ vehiculo.getTamanoDeposito()+" litros y su modelo es "+
                        vehiculo.getModelo() +".");
            }
        }catch (EOFException e){
            System.out.println("Fin Fichero");
        }

        in.close();
        file.close();
    }
}
