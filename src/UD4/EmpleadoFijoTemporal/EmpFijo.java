package UD4.EmpleadoFijoTemporal;

import java.io.IOException;

public class EmpFijo extends Empleado implements InterfazTeclado {

    private int salario;
    private float irpf;
    private int trienios;
    private int retenci�n;

    public EmpFijo(String nss, String nombre, String fechaNacimiento, char sexo, int salario, float irpf, int trienios, int retencion) {
        super(nss, nombre, fechaNacimiento, sexo);
        this.salario = salario;
        this.irpf = irpf;
        this.trienios = trienios;
        this.retenci�n = retencion;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public float getIrpf() {
        return irpf;
    }

    public void setIrpf(float irpf) {
        this.irpf = irpf;
    }

    public int getTrienios() {
        return trienios;
    }

    public void setTrienios(int trienios) {
        this.trienios = trienios;
    }

    public int getRetenci�n() {
        return retenci�n;
    }

    public void setRetenci�n(int retenci�n) {
        this.retenci�n = retenci�n;
    }

    @Override
    public Double sueldo() {
        return ((trienios * 30.00) + salario) - getRetenci�n();
    }

    @Override
    public void modificarEmpleado() throws IOException {
        System.out.println("�Cu�l es el nuevo salario base?");
        int salarioNuevo = Integer.parseInt(br.readLine());
        setSalario(salarioNuevo);
        System.out.println("�Cu�les son los trienios del empleado?");
        int trieniosNuevos = Integer.parseInt(br.readLine());
        setTrienios(trieniosNuevos);
    }

    @Override
    public String toString() {
        return (getNombre() + "           " + getTrienios() + "            " + sueldo()+"�");
    }
}
