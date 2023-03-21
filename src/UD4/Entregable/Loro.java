package UD4.Entregable;

public class Loro extends Aves {
    private String origen;
    private boolean habla;

    public String habla() {
        return saluda();
    }


    private String saluda(){
        return "Muy buenas señores";
    }
    public void volar(){this.setEstado("Volando");}

    public Loro(String nombre, String estado, int edad, String fechaNacimiento, String pico, boolean vuela, String origen, boolean habla) {
        super(nombre, estado, edad, fechaNacimiento, pico, vuela);
        this.origen = origen;
        this.habla = habla;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public boolean isHabla() {
        return habla;
    }

    public void setHabla(boolean habla) {
        this.habla = habla;
    }
    @Override
    public String toString() {
        return (super.toString()+ ", Origen:"+ this.getOrigen() + ", Habla: " + this.isHabla());
    }
}
