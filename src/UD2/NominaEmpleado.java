package UD2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class NominaEmpleado {

    public static void main(String[] args) throws IOException {

        float precioHora;
        String mesActual;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Nombre del empleado");
        Empleado empleado = new Empleado(br.readLine());

        System.out.println("Su sueldo base");
        empleado.setSueldoBase(Float.parseFloat(br.readLine()));

        System.out.println("Número de horas extras trabajada");
        empleado.setHorasExtra(Byte.parseByte(br.readLine()));

        System.out.println("Su porcentaje de descuento");
        empleado.setPorcDescuento(Float.parseFloat(br.readLine()));

        System.out.println("El precio hora");
        precioHora=Float.parseFloat(br.readLine());

        System.out.println("Mes Actual");
        mesActual = br.readLine();

        empleado.informeNomina(precioHora, mesActual);



    }

}
