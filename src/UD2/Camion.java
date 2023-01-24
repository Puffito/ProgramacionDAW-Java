package UD2;

public class Camion {
    String propietario, matricula, compania;
    int litrosInic, litrosFinal, KmInic, KmFinal;

    public Camion(String propietario, String matricula, String compania, int litrosInic, int litrosFinal, int KmInic,
                int KmFinal){
      this.propietario = propietario;
      this.matricula = matricula;
      this.compania = compania;
      this.litrosFinal = litrosFinal;
      this.litrosInic = litrosInic;
      this.KmFinal = KmFinal;
      this.KmInic = KmInic;
  }

    public void consumo() {
        System.out.printf("""
                        Cuando el camión con matrícula: %s de la compañía '%s' a nombre de %s
                        sale, su cuentakilómetros marca %dKm y sale con %d litros; al llegar el cuentakilómetros marca %dKm y llega con %d litros,
                        por los que el consumo total a los 100Km es de %.2f litros""",
                matricula, compania, propietario, KmInic, litrosInic, KmFinal, litrosFinal,
                (((float)litrosInic-litrosFinal)/(KmFinal-KmInic)));
      return;
    }
}
