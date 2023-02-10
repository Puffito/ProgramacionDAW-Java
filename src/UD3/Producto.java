package UD3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Producto {
    private String nombre;
    private float PrecioVigo,PrecioSantiago,PrecioMadrid;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public Producto() {
    }

    public Producto(String nombre, float precioVigo) {
        this.nombre = nombre;
        PrecioVigo = precioVigo;
    }

    public Producto(String nombre) throws IOException {
        this.nombre = nombre;

        System.out.println("¿Tiene precio en Vigo?");
        if(br.readLine().equalsIgnoreCase("Si")){
            System.out.println("¿Cuál es el precio en Vigo?");
            this.setPrecioVigo(Float.parseFloat(br.readLine()));
        }
        System.out.println("¿Tiene precio en Santiago?");
        if(br.readLine().equalsIgnoreCase("Si")){
            System.out.println("¿Cuál es el precio en Santiago?");
            this.setPrecioSantiago(Float.parseFloat(br.readLine()));
        }
        System.out.println("¿Tiene precio en Madrid?");
        if(br.readLine().equalsIgnoreCase("Si")){
            System.out.println("¿Cuál es el precio en Madrid?");
            this.setPrecioMadrid(Float.parseFloat(br.readLine()));
        }
    }

    public Producto(String nombre, float precioVigo, float precioSantiago, float precioMadrid) {
        this.nombre = nombre;
        PrecioVigo = precioVigo;
        PrecioSantiago = precioSantiago;
        PrecioMadrid = precioMadrid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecioVigo() {
        return PrecioVigo;
    }

    public void setPrecioVigo(float precioVigo) {
        PrecioVigo = precioVigo;
    }

    public float getPrecioSantiago() {
        return PrecioSantiago;
    }

    public void setPrecioSantiago(float precioSantiago) {
        PrecioSantiago = precioSantiago;
    }

    public float getPrecioMadrid() {
        return PrecioMadrid;
    }

    public void setPrecioMadrid(float precioMadrid) {
        PrecioMadrid = precioMadrid;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", PrecioVigo=" + PrecioVigo +
                ", PrecioSantiago=" + PrecioSantiago +
                ", PrecioMadrid=" + PrecioMadrid +
                '}';
    }
}
