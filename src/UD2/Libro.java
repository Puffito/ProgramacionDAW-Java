package UD2;

public class Libro {
    private String nombre;
    private byte consultas;
    private int prestamos;

    Libro(){}

    Libro(String nombre, byte consultas, int prestamos){
        this.nombre = nombre;
        this.consultas = consultas;
        this.prestamos = prestamos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getConsultas() {
        return consultas;
    }

    public void setConsultas(byte consultas) {
        this.consultas = consultas;
    }

    public int getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(int prestamos) {
        this.prestamos = prestamos;
    }

    public void tasaDeConsulta(String mes, int librosPrestados) {

        System.out.printf("El libro %s se consultó %d veces.%n" +
                        "La tasa de consulta en el mes de %s es %d%% ",
                nombre, consultas, mes, ((consultas*100)/prestamos));
    }
}
