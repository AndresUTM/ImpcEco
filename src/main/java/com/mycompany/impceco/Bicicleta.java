/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Bicicleta implements ImpactoEcologico {
    private double emisionesProduccion;
    private String tipoBateria;
    private double eficienciaEnergetica;
    private double mantenimiento;
    private int vidaUtil;

    public Bicicleta(double emisionesProduccion, String tipoBateria, 
            double eficienciaEnergetica, double mantenimiento, int vidaUtil) {
        this.emisionesProduccion = emisionesProduccion;
        this.tipoBateria = tipoBateria;
        this.eficienciaEnergetica = eficienciaEnergetica;
        this.mantenimiento = mantenimiento;
        this.vidaUtil = vidaUtil;
    }

    @Override
    public double calcularImpactoEcologico() {
        return emisionesProduccion + eficienciaEnergetica - mantenimiento 
                + (vidaUtil / eficienciaEnergetica);
    }

    @Override
    public String getIdentificacion() {
        return "Bicicleta";
    }
}

