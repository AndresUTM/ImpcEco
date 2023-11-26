/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Vehiculo implements ImpactoEcologico {
    private double emisionesProduccion;
    private String tipoCombustible;
    private double eficienciaCombustible;
    private double kilometrajeAnual;
    private double mantenimiento;
    private int duracion;

    public Vehiculo(double emisionesProduccion, String tipoCombustible, 
            double eficienciaCombustible, double kilometrajeAnual, 
            double mantenimiento, int duracion) {
        this.emisionesProduccion = emisionesProduccion;
        this.tipoCombustible = tipoCombustible;
        this.eficienciaCombustible = eficienciaCombustible;
        this.kilometrajeAnual = kilometrajeAnual;
        this.mantenimiento = mantenimiento;
        this.duracion = duracion;
    }

    @Override
    public double calcularImpactoEcologico() {
        return emisionesProduccion + (eficienciaCombustible * kilometrajeAnual) - mantenimiento + (duracion / eficienciaCombustible);
    }

    @Override
    public String getIdentificacion() {
        return "Vehiculo";
    }
}
