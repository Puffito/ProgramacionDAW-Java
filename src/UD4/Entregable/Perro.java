package UD4.Entregable;

public class Perro extends Mascotas{
    private String raza;
    private boolean pulgas;

    public void habla(){}

    public Perro(String nombre, String estado, int edad, String fechaNacimiento, String raza, boolean pulgas) {
        super(nombre, estado, edad, fechaNacimiento);
        this.raza = raza;
        this.pulgas = pulgas;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isPulgas() {
        return pulgas;
    }

    public void setPulgas(boolean pulgas) {
        this.pulgas = pulgas;
    }

    @Override
    public String toString() {
        return (super.toString()+ ", Raza:"+ this.getRaza() + ", Pulgas: " + this.isPulgas());
    }
}
