package UD4.Entregable;

import java.util.Date;

public class Canario extends Aves {
    private String color;
    private boolean canta;


    public void habla(){

    }
    public void volar(){

    }

    public Canario(String nombre, String estado, int edad, String fechaNacimiento, String pico, boolean vuela, String color, boolean canta) {
        super(nombre, estado, edad, fechaNacimiento, pico, vuela);
        this.color = color;
        this.canta = canta;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCanta() {
        return canta;
    }

    public void setCanta(boolean canta) {
        this.canta = canta;
    }
    @Override
    public String toString() {
        return (super.toString()+ ", Color:"+ this.getColor() + ", Canta: " + this.isCanta());
    }
}
