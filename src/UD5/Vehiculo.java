package UD5;

import java.io.Serializable;

public class Vehiculo implements Serializable {
    private String matricula;
    private String marca;
    private transient double tamanoDeposito;
    private String modelo;

    public Vehiculo(String matricula, String marca, double tamanoDeposito, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.tamanoDeposito = tamanoDeposito;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanoDeposito() {
        return tamanoDeposito;
    }

    public void setTamanoDeposito(double tamanoDeposito) {
        this.tamanoDeposito = tamanoDeposito;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
