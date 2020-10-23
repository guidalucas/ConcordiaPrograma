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
public class PlantaTemporaria extends Empleado {

    private static final double VALORHORA = 200;

    public PlantaTemporaria(int cantHoras, boolean estCivil, int cantHijos) {
        super(cantHoras, estCivil, cantHijos);
    }

    @Override
   public double getSalario() {
        double sueldo = super.getSalarioFamiliar();
        sueldo += super.getCantHoras() * PlantaTemporaria.VALORHORA;
        return sueldo;
    }

}
