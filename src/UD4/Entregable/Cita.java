package UD4.Entregable;

public class Cita {
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
}
