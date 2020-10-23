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
public class PlantaPermanente extends Empleado {

    private int antiguedad;
    private static final double VALORHORA = 300;

    public PlantaPermanente(int antiguedad, int cantHoras, boolean estCivil, int cantHijos) {
        super(cantHoras, estCivil, cantHijos);
        this.antiguedad = antiguedad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    @Override
     public double getSalario() {
        double sueldo = super.getSalarioFamiliar();
        sueldo += super.getCantHoras() * PlantaPermanente.VALORHORA;
        return sueldo;
    }

}
