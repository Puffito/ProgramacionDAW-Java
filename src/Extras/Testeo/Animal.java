package Extras.Testeo;

public class Animal implements InterfazAnimal{
    String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String llorar() {
        return("Lloro mucho");
    }
}
