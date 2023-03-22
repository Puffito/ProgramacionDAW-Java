package UD4.EmpleadoFijoTemporal;
import java.io.IOException;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.time.LocalDate;

import static UD4.EmpleadoFijoTemporal.InterfazFecha.format;
import static UD4.EmpleadoFijoTemporal.Main.validarFecha;

public class EmpTemporal extends Empleado implements InterfazTeclado {

    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Double precioDia;
    private ArrayList<Ventas> ventas = new ArrayList<>();

    public EmpTemporal(String nss, String nombre, String fechaNacimiento, char sexo, LocalDate fechaInicio, LocalDate fechaFin, Double precioDia){
        super(nss, nombre, fechaNacimiento, sexo);
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precioDia = precioDia;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Double getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(Double precioDia) {
        this.precioDia = precioDia;
    }

    public void añadirVentas() throws IOException {
        while(true){
            System.out.println("¿Qué fecha tiene la venta? dd/MM/yyyy");
            LocalDate fechaVenta = LocalDate.parse(validarFecha(), format);
            if(fechaVenta.isAfter(fechaFin)||fechaVenta.isBefore(fechaInicio)){
                System.out.println("Fecha fuera de rango del empleado");
            }else {
                System.out.println("¿Cuál es el importe de la venta?");
                int importeVenta = Integer.parseInt(br.readLine());
                ventas.add(new Ventas(importeVenta, fechaVenta));
            }
            System.out.println("¿Desea añadir más ventas?");
            if(br.readLine().equalsIgnoreCase("no")) {return;}
        }
    }

    @Override
    public Double sueldo() {
        return (ChronoUnit.DAYS.between(fechaInicio, fechaFin) * getPrecioDia());
    }

    @Override
    public void modificarEmpleado() throws IOException {
        System.out.println("¿Cuál es el nuevo precio por día?");
        Double precioDiaNuevo = Double.parseDouble(br.readLine());
        setPrecioDia(precioDiaNuevo);
    }

    @Override
    public String toString() {
        return (getNombre()+"        "+getFechaInicio()+"        "+getFechaFin()+"       "+sueldo())+"€";
    }
    public int getVentasTotales(){
        int total = 0;
        for(Ventas venta : ventas){
            total += venta.getImporteVenta();
        }
        return total;
    }
}
