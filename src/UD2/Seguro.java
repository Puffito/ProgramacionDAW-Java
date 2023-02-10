package UD2;

public class Seguro {
    private final String nombreAsegurado;
    private int edad, anosCarnet, precioCoche;

    public Seguro(String nombreAsegurado) {
        this.nombreAsegurado = nombreAsegurado;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setAnosCarnet(int anosCarnet) {
        this.anosCarnet = anosCarnet;
    }
    public void setPrecioCoche(int precioCoche) {
        this.precioCoche = precioCoche;
    }

    void calcularSeguro(){
        ver();
    }


    public void ver() {

        double tarifaBase = 300;
        double suplemento = 0;

        if (precioCoche > 15000){
            suplemento = tarifaBase * 0.12;
        }
        if(edad < 28 || anosCarnet < 5){
            suplemento += 100;
        }

        System.out.printf("""
                El asegurado %s debe pagar %.2f€ por su póliza.
                """, nombreAsegurado, tarifaBase + suplemento);

    }
}
