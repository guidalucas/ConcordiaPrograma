/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author Lucas
 */
public class Gerente extends PlantaPermanente {

     private static final double VALORANTIGUEDAD = 150;
    
    private static final double VALORHORA = 400;
    

    public double getSalario() {

        double sueldoGerente = super.getSalarioFamiliar();

        sueldoGerente += super.getCantHoras() * Gerente.VALORHORA;
        sueldoGerente += super.getAntiguedad() * Gerente.VALORANTIGUEDAD;

        return sueldoGerente;
    }

    public Gerente(int antiguedad, int cantHoras, boolean estCivil, int cantHijos) {
        super(antiguedad, cantHoras, estCivil, cantHijos);
    }

}
