package UD3;

public class Coche{
    static int numCoches = 0;
    private String marca,modelo,aire_acondicionado,cierre_central,pintura_metalizada, tipo_motor;
    private float precio_base;

    public Coche(String marca, String modelo, String aire_acondicionado, String cierre_central, String pintura_metalizada, String tipo_motor, float precio_base) {
        this.marca = marca;
        this.modelo = modelo;
        this.aire_acondicionado = aire_acondicionado;
        this.cierre_central = cierre_central;
        this.pintura_metalizada = pintura_metalizada;
        this.tipo_motor = tipo_motor;
        this.precio_base = precio_base;
        numCoches++;
    }

    public String getMarca() {
        return marca;
    }

    public float getPrecio_base() {
        return precio_base;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", aire_acondicionado='" + aire_acondicionado + '\'' +
                ", cierre_central='" + cierre_central + '\'' +
                ", pintura_metalizada='" + pintura_metalizada + '\'' +
                ", tipo_motor='" + tipo_motor + '\'' +
                ", precio_base=" + precio_base +
                '}';
    }
}
