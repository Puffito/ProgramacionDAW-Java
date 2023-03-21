package UD4.EmpleadoFijoTemporal;
import java.io.IOException;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.time.LocalDate;

public class EmpTemporal extends Empleado implements InterfazTeclado {

    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Double precioDia;
    private ArrayList<Ventas> ventas;

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
            ventas.add(new Ventas());
            System.out.println("¿Desea añadir más ventas?");
            if(br.readLine().equalsIgnoreCase("no")) {return;}
        }
    }

    @Override
    public Double sueldo() {
        return (ChronoUnit.DAYS.between(fechaFin, fechaInicio) * getPrecioDia());
    }
}
