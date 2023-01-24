package UD2;

public class Seguro implements Ver {
    private final String NombreAsegurado;
    private int Edad, AnosCarnet, PrecioCoche;

    public Seguro(String nombreAsegurado) {
        this.NombreAsegurado = nombreAsegurado;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }
    public void setAnosCarnet(int anosCarnet) {
        AnosCarnet = anosCarnet;
    }
    public void setPrecioCoche(int precioCoche) {
        PrecioCoche = precioCoche;
    }

    void calcularSeguro(){
        Ver.ver(Edad,AnosCarnet,PrecioCoche,NombreAsegurado);
    }
}
