package UD3;

public class Alumno {
    static int alumnosTotales = 0;
    private String name;
    private int nota;
    public Alumno(String name, int nota) {
        this.name = name;
        this.nota = nota;
        alumnosTotales++;
    }
    public static int getAlumnosTotales() {
        return alumnosTotales;
    }

    public static void reducirAlumnosTotales() {
        Alumno.alumnosTotales--;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
