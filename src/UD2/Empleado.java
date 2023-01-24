package UD2;

public class Empleado {
    String nombre;
    float porcDescuento, sueldoBase;
    byte horasExtra;


    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPorcDescuento() {
        return porcDescuento;
    }

    public void setPorcDescuento(float porcDescuento) {
        this.porcDescuento = porcDescuento;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public byte getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(byte horasExtra) {
        this.horasExtra = horasExtra;
    }

    public void informeNomina(float precioHora, String mesActual){

        float descuentos = (porcDescuento*(sueldoBase+horasExtra))/100;
        float horasExtraTotal = horasExtra * precioHora;

        System.out.printf("""
                -Mes: %s
                -Nómina del Empleado: %s
                -Sueldo Base: %.2f€
                -porcentajeDeDescuento: %.0f%%
                -HorasExtras: %.2f€
                -Descuentos: %.2f€
                -Diferencia: %.2f€
                -Sueldo neto: %.2f€
                    
                """,mesActual,nombre,sueldoBase,porcDescuento, horasExtraTotal, descuentos,
                (sueldoBase-descuentos),((sueldoBase-descuentos)+horasExtraTotal));

    }
}
