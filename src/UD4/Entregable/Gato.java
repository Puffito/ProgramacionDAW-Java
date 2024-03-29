package UD4.Entregable;

public class Gato extends Animal {
    private String color;
    private boolean peloLargo;


    public String habla(){return "Miau";}

    public Gato(String nombre, String estado, int edad, String fechaNacimiento, String color, boolean peloLargo) {
        super(nombre, estado, edad, fechaNacimiento);
        this.color = color;
        this.peloLargo = peloLargo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPeloLargo() {
        return peloLargo;
    }

    public void setPeloLargo(boolean peloLargo) {
        this.peloLargo = peloLargo;
    }
    @Override
    public String toString() {
        return (super.toString()+ ", Color: "+ this.getColor() + ", Pelo Largo: " + this.isPeloLargo());
    }
}
