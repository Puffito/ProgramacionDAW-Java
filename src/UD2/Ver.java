package UD2;

public interface Ver {
    static void ver(int edad, int anosCarnet, int precioCoche, String nombreAsegurado){

        double tarifaBase = 300;
        double suplemento = 0;

        if (precioCoche > 15000){
            suplemento = tarifaBase * 0.12;
        }
        if(edad < 28 || anosCarnet < 5){
            suplemento += 100;
        }

        System.out.printf("""
                El asegurado %s debe pagar %.2f€ por su póliza.
                """, nombreAsegurado, tarifaBase + suplemento);

    }
}
