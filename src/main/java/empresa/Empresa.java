package empresa;

/**
 *
 * @author Lucas
 */
public class Empresa {

    private Empleado[] emp;
    private Integer cuit;
    private String razSoc;

    public Empresa(Empleado[] emp, Integer cuit, String razSoc) {
        this.emp = emp;
        this.cuit = cuit;
        this.razSoc = razSoc;
    }

    public double getMontoTotal() {
        double aux = 0;
        for (int i = 0; i < emp.length; i++) {

            aux += emp[i].getSalario();
            System.out.println(emp[i].getSalario());
        }
        return aux;

    }

    public static void main(String[] args) {

        Empleado luis = new PlantaTemporaria(80, true, 0);

        Empleado carlos = new PlantaPermanente(6, 80, true, 2);
        Empleado juan = new PlantaPermanente(4, 160, false, 0);
        Empleado pedro = new Gerente(10, 160, true, 1);

        Empleado emp[] = {luis, carlos, juan, pedro};

        Empresa acme = new Empresa(emp, 2344564, "Acme");

        System.out.println("Salarios: " + acme.getMontoTotal());
    }

}
