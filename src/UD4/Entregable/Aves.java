package UD4.Entregable;

import java.util.Date;

public abstract class Aves extends Mascotas {
    private String pico;
    private boolean vuela;

    public Aves(String nombre, String estado, int edad, String fechaNacimiento, String pico, boolean vuela) {
        super(nombre, estado, edad, fechaNacimiento);
        this.pico = pico;
        this.vuela = vuela;
    }

    abstract void volar();

    public String getPico() {
        return pico;
    }

    public void setPico(String pico) {
        this.pico = pico;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }
    @Override
    public String toString() {
        return (super.toString()+ ", Pico:"+ this.getPico() + ", Vuela: " + this.isVuela());
    }
}
