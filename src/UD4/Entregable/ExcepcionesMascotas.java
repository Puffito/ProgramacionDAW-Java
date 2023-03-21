package UD4.Entregable;

public class ExcepcionesMascotas extends Exception {
    public static final int ERROR_DESCONOCIDO = 3;
    public static final int RESPUESTA_INCORRECTA = 1;
    public static final int FECHA_INCORRECTA = 2;


        private String fallo;



        public ExcepcionesMascotas(){}


        public ExcepcionesMascotas(String s) {
            super(s);
        }

        public ExcepcionesMascotas(int f) {

            switch (f) {
                case 1 -> fallo = "La respuesta tiene que ser si o no";
                case 2 -> fallo = "Fecha Incorrecta";
                default -> fallo = "Error desconocido";
            }
        }


        public String dameError(){
            return fallo;
        }
}
