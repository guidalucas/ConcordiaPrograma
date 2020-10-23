package empresa;

/**
 *
 * @author Lucas
 */
public abstract class Empleado {

    private int cantHoras;
    private boolean esCasado;
    private int cantHijos;

    public Empleado(int cantHoras, boolean esCasado, int cantHijos) {
        this.cantHoras = cantHoras;
        this.esCasado = esCasado;
        this.cantHijos = cantHijos;

    }

    public double getSalarioFamiliar() {
        double salFam = 200 * this.cantHijos;
        if (esCasado) {
            salFam += 100;
        }
        return salFam;
    }

    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }

    public int getCantHoras() {
        return cantHoras;
    }

    public abstract double getSalario();

}
