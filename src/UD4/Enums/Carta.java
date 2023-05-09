package UD4.Enums;

public class Carta {

    enum Palo {
        CORAZON("de Corazón",1),
        DIAMANTE("de Diamante",2),
        TREBOL("de Trebol",3),
        PICA("de Pica",4);

        private final String nombre;
        private final int valor;
        Palo(String nombre,int valor) {
            this.nombre =  nombre;
            this.valor = valor;
        }

        public String getNombre() {
            return nombre;
        }

        public int getValor() {
            return valor;
        }
    }
    private int num;
    private Palo palo;

    public Carta(int num, Palo palo) {
        this.num = num;
        this.palo = palo;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return num + " " + palo.getNombre() ;
    }
}
