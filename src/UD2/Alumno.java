package UD2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alumno {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String nombre;
    int promedio;

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {this.promedio = promedio;}

    public void hacerPromedio() throws IOException {
        boolean salir = false;
        int notaActual, sumaNotas = 0, i=0;

        do {
            System.out.println("Introduzca la siguiente nota del alumno (0-10), otro para salir");
            notaActual = Integer.parseInt(br.readLine());
            if (notaActual >= 0 && notaActual <= 10) {
                sumaNotas += notaActual;
                i += 1;
            }else{
                salir = true;
            }

        }while(!salir);

        setPromedio(sumaNotas /  i);

        System.out.printf("La nota promedio de %s es %d : ", this.nombre, this.promedio);
        switch (promedio){
            case 7,8,9,10->  System.out.println("'Bien'");
            case 4,5,6->  System.out.println("'Regular'");
            case 0,1,2,3->  System.out.println("'Suspenso'");
            default -> System.out.println("'ERROR'");
        }

    }
}
