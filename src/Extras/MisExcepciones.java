
package POO_Avanzada.otrosPOO.Ejercicio3Mascotas.Excepciones;

/**
 *
 * @author mrnovoa
 */
public class MisExcepciones extends Exception {
    
    private String error;

    public MisExcepciones() {
    }

    public MisExcepciones(String message) {
        super(message);
        this.error = message;
    }

    public String getError() {
        return error;
    } 
    
}
