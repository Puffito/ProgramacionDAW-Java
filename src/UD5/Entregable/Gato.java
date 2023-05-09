package UD5.Entregable;

public class Gato extends Animal{

        private boolean bigotesLargos;

        public Gato(String nombre, int edad, boolean bigotesLargos) {
            super(nombre, edad);
            this.bigotesLargos = bigotesLargos;
        }
    @Override
    public void expresar(){
        System.out.println("MIAU");
    }
}
