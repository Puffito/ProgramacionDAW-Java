package UD4.Entregable;

import java.util.Iterator;

public class Cita{
    private String fecha;
    private boolean revision;
    private String vacuna;

    public Cita(String fecha, boolean revision, String vacuna) {
        this.fecha = fecha;
        this.revision = revision;
        this.vacuna = vacuna;
    }

    public String getFecha() {
        return fecha;
    }

    public boolean isRevision() {
        return revision;
    }

    public String getVacuna() {
        return vacuna;
    }

    @Override
    public String toString() {
        return getFecha() + " Revisión = " + isRevision()+ " Vacuna usada: " +getVacuna()+";";
    }
}
