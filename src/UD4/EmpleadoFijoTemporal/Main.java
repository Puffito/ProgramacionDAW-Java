package UD4.EmpleadoFijoTemporal;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main implements InterfazTeclado, InterfazFecha {

    static ArrayList<Empleado> empActivos = new ArrayList<>();
    static ArrayList<Empleado> empBaja = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        menu();
        System.out.println("Gracias por usar el programa!");
    }


    public static void menu() throws IOException {

        while (true) {
            System.out.println("""
                    ¡Bienvenido a la base de datos de empleados!
                    ¿Qué desea hacer?
                    1.Insertar un nuevo empleado
                    2.Alta de ventas de un empleado temporal
                    3.Dar de baja a un empleado
                    0.Salir de la aplicación
                    """);
            switch (Integer.parseInt(br.readLine())) {
                case 1 -> nuevoEmpleado();
                case 2 -> altaVentas();
                case 3 -> darDeBaja();
                case 0 -> {
                    return;
                }
                default -> System.out.println("Opción Incorrecta");
            }
        }
    }

    public static void nuevoEmpleado() throws IOException {
        while (true) {
            System.out.println("""
                    ¿Qué tipo de empleado desea insertar?
                    1.Fijo
                    2.Temporal
                    0.Salir
                    """);
            switch (Integer.parseInt(br.readLine())) {
                case 1 -> insertarFijo();
                case 2 -> insertarTemporal();
                case 0 -> {
                    return;
                }
                default -> System.out.println("Opción Incorrecta");
            }
        }
    }

    public static void insertarFijo() throws IOException {

        String nss = validarSS();
        System.out.println("Inserta el nombre del empleado");
        String nombre = br.readLine();
        System.out.println("Inserta la fecha de nacimiento");
        String fechaNac = validarFecha();
        System.out.println("Inserta el sexo del empleado");
        char sex = br.readLine().toCharArray()[0];
        System.out.println("Inserta el salario del empleado");
        int salario = Integer.parseInt(br.readLine());
        System.out.println("Inserta el IRPF");
        float irpf = Float.parseFloat(br.readLine());
        System.out.println("Inserta los trienios del empleado");
        int trienios = Integer.parseInt(br.readLine());
        System.out.println("Inserta la retención del empleado");
        int retencion = Integer.parseInt(br.readLine());
        empActivos.add(new EmpFijo(nss, nombre, fechaNac, sex, salario, irpf, trienios, retencion));
    }

    public static void insertarTemporal() throws IOException {

        String nss = validarSS();
        System.out.println("Inserta el nombre del empleado");
        String nombre = br.readLine();
        System.out.println("Inserta la fecha de nacimiento");
        String fechaNac = validarFecha();
        System.out.println("Inserta el sexo del empleado");
        char sex = br.readLine().toCharArray()[0];
        System.out.println("Inserta la fecha de inicio del contrato");
        LocalDate fechaIni = LocalDate.parse(validarFecha(), format);
        System.out.println("Inserta la fecha de fin del contrato");
        LocalDate fechaFin = LocalDate.parse(validarFecha(), format);
        System.out.println("Inserta el precio por día del empleado");
        Double precioDia = Double.parseDouble(br.readLine());

        empActivos.add(new EmpTemporal(nss, nombre, fechaNac, sex, fechaIni, fechaFin, precioDia));
    }

    public static String validarSS() {
        while (true) {
            try {
                System.out.println("Inserta el número de la Seguridad Social");
                String nss = br.readLine();
                if (!nss.matches("^[0-9]{9}[a-zA-Z]$")) {
                    throw new Exception("Número de la Seguridad Social incorrecto");
                }
                return nss;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String validarFecha() {
        while (true) {
            try {
                String fecha = br.readLine();
                if (!fecha.matches("^[0-3][0-9]/[0-1][0-9]/[1-2][0-9]{3}$")) {
                    throw new Exception("Fecha Incorrecta");
                }
                return fecha;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void altaVentas() throws IOException {
        String nss = validarSS();
        for (Empleado empl : empActivos) {
            if (empl instanceof EmpTemporal && empl.getNss().equalsIgnoreCase(nss)) {
                System.out.println("El empleado con número de SS:"+nss+" ha sido encontrado.");
                System.out.println("¿Desea añadir las ventas?");
                if(br.readLine().equalsIgnoreCase("si")) {
                    ((EmpTemporal) empl).añadirVentas();
                }else {
                    return;
                }
            }
        }
    }
    public static void darDeBaja() throws IOException {
        String nss = validarSS();
        for (Empleado empl : empActivos) {
            if(empl.getNss().equalsIgnoreCase(nss)){
                System.out.println("El empleado con número de SS:"+nss+" ha sido encontrado.");
                System.out.println("¿Desea borrar el empleado?");
                if(br.readLine().equalsIgnoreCase("si")) {
                    System.out.println("""
                            1.Borrar definitivamente
                            2.Guardarlo en empleados en baja
                            """);
                    switch (Integer.parseInt(br.readLine())) {
                        case 1 -> {
                            empActivos.remove(empl);
                            return;
                        }
                        case 2 -> {
                            empBaja.add(empl);
                            empActivos.remove(empl);
                            return;
                        }
                        default -> System.out.println("Opción Incorrecta");
                    }
                }else{return;}
            }
        }
    }
}
