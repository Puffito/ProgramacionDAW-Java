package UD4.Entregable;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Perro extends Animal implements InterfazTeclado{
    private String raza;
    private boolean pulgas;

    private ArrayList<Cita> historial = new ArrayList<>();

    public String habla(){
        return "Guau";
    }

    public Perro(String nombre, String estado, int edad, String fechaNacimiento, String raza, boolean pulgas) throws IOException {
        super(nombre, estado, edad, fechaNacimiento);
        this.raza = raza;
        this.pulgas = pulgas;
        System.out.println("¿"+this.getNombre()+ " tiene alguna cita?");
        while(true) {
            try {
                boolean tieneCita = comprobacionRespuesta(br.readLine());
                if (tieneCita) {anadirCita();}
                break;
                } catch (ExcepcionesMascotas e) {
                System.out.println(e.dameError());
            }
        }

    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isPulgas() {
        return pulgas;
    }

    public void setPulgas(boolean pulgas) {
        this.pulgas = pulgas;
    }

    public ArrayList<Cita> getHistorial() {
        return historial;
    }

    @Override
    public String toString() {
        StringBuilder completo = new StringBuilder(super.toString() + ", Raza: " + this.getRaza() + ", Pulgas: " + this.isPulgas());
        for (Cita cita : historial) {
            completo.append(", Cita de ").append(cita);
        }
        return completo.toString();
    }

    public void anadirCita() throws IOException {
        while(true) {
            try {
                System.out.println("¿Cuál es la fecha de la cita? dd/MM/AAAA");
                String fecha = br.readLine();
                if (!fecha.matches("^[0-3][0-9]/[0-1][0-9]/20[0-9]{2}$")) {
                    throw new ExcepcionesMascotas(ExcepcionesMascotas.FECHA_INCORRECTA);
                }
                System.out.println("¿Se hizo revisión?");
                boolean revision = comprobacionRespuesta(br.readLine());
                System.out.println("¿Qué vacuna se aplicó?");
                String vacuna = br.readLine();
                getHistorial().add(new Cita(fecha,revision,vacuna));
                System.out.println("Cita añadida. ¿Hay más citas?");
                if (!comprobacionRespuesta(br.readLine())){return;}

            }catch (ExcepcionesMascotas e){
                System.out.println(e.dameError());
            }

        }
    }

    public boolean comprobacionRespuesta(String respuesta) throws ExcepcionesMascotas {
        switch (respuesta.toLowerCase()) {
            case "si" -> {
                return true;
            }
            case "no" -> {
                return false;
            }
            default -> throw new ExcepcionesMascotas(ExcepcionesMascotas.RESPUESTA_INCORRECTA);
        }
    }
}
