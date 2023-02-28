package UD4.Entregable;

import java.util.Date;

public abstract class Mascotas {
    private String nombre, estado;
    private int edad;
    private String fechaNacimiento;
    public void cumpleanos() {this.edad++;}
    public  void morir() {estado = "Muerto";}
    abstract void habla();

    public String muestra(){
        return(this.getClass()+ " " + this.getNombre());
    }
    public Mascotas(String nombre, String estado, int edad, String fechaNacimiento) {
        this.nombre = nombre;
        this.estado = estado;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return ("Nombre: "+this.nombre+", Edad: "+this.edad+", Estado: "+this.estado+", Fecha de Nacimiento: "+this.fechaNacimiento);
    }
}
