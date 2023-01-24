package UD2;

public class Ordenador {
    private String nombre;
    private double precioInicial, precioFinal, mensualidad;
    public Ordenador(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioInicial(double precioInicial) {
        this.precioInicial = precioInicial;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public void setMensualidad(double mensualidad) {
        this.mensualidad = mensualidad;
    }

    public void contado() {
        this.precioFinal = this.precioInicial;
        System.out.printf("""
                Marca del ordenador: %s
                Precio Inicial: %.2f €
                Precio Final: %.2f €
                """,nombre, precioInicial, precioFinal);
    }

    public void mensualidad(byte selector) {
        if (selector == 2) {
            this.precioFinal = precioInicial * 1.08;
            this.mensualidad = precioFinal /6;
        }
        else{
                this.precioFinal = precioInicial * 1.15;
                this.mensualidad = precioFinal / 12;
        }
        System.out.printf("""
                Marca del ordenador: %s
                Precio Inicial: %.2f €
                Precio Final: %.2f €
                Mensualidad: %.2f €
                """, nombre, precioInicial, precioFinal, mensualidad);
    }

    public void calculo(byte selector) {
        switch (selector) {
            case (1) -> contado();
            case (2), (3) -> mensualidad(selector);
            default -> System.out.println("Trollo");
        }
    }
}
