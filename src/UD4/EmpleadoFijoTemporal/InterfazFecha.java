package UD4.EmpleadoFijoTemporal;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

public interface InterfazFecha {
    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
}
