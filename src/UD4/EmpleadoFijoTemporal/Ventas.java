package UD4.EmpleadoFijoTemporal;

import java.time.LocalDate;

public class Ventas {
    private int importeVenta;
    private LocalDate Fecha;

    public Ventas(int importeVenta, LocalDate fecha) {
        this.importeVenta = importeVenta;
        Fecha = fecha;
    }

    public int getImporteVenta() {
        return importeVenta;
    }

    public void setImporteVenta(int importeVenta) {
        this.importeVenta = importeVenta;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate fecha) {
        Fecha = fecha;
    }
}
