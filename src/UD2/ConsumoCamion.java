package UD2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsumoCamion {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Leemos los datos
        System.out.println("Escribe el nombre del propietario del camión");
        String propietario = br.readLine();

        System.out.println("Escribe la matrícula del camión");
        String matricula = br.readLine();

        System.out.println("Escribe los litros iniciales del camión");
        int litrosInic = Integer.parseInt(br.readLine());

        System.out.println("Escribe los litros finales del camión");
        int litrosFinal = Integer.parseInt(br.readLine());

        System.out.println("Estado anterior del cuentakilómetros del camión");
        int pastKm = Integer.parseInt(br.readLine());

        System.out.println("Estado final del cuentakilómetros del camión");
        int actualKm = Integer.parseInt(br.readLine());

        System.out.println("Escribe el nombre de la compañía");
        String compania = br.readLine();

        //Pasamos la info a la clase UD1.Camion y usamos el método consumo()
        Camion camion = new Camion(propietario,matricula,compania,litrosInic,litrosFinal,pastKm,actualKm);

        camion.consumo();

    }
}