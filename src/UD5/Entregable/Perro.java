package UD5.Entregable;

public class Perro extends Animal{
    private boolean raboLargo;

    public Perro(String nombre, int edad, boolean raboLargo) {
        super(nombre, edad);
        this.raboLargo = raboLargo;
    }
    @Override
    public void expresar(){
        System.out.println("GUAU");
    }
}
