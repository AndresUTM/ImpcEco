import java.util.ArrayList;

public class Calculo {
    public static void main(String[] args) {
        Edificio edificio = new Edificio(500, "Solar", 0.8, 100, 50, 300);
        Vehiculo vehiculo = new Vehiculo(1000, "Gasolina", 0.05, 15000, 200, 10);
        Bicicleta bicicleta = new Bicicleta(50, "Li-ion", 0.01, 20, 5);

        ArrayList<ImpactoEcologico> objetos = new ArrayList<>();
        objetos.add(edificio);
        objetos.add(vehiculo);
        objetos.add(bicicleta);

        for (ImpactoEcologico objeto : objetos) {
            System.out.println(objeto.getIdentificacion() + " - Impacto Ecológico: " + objeto.calcularImpactoEcologico());
        }
    }
}

