/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inversionesMensuales;

/**
 *
 * @author Lucas
 */
public class AlmacenPago {

    public void getInversion(int monto, double interes, int añosMax) {

        double interesMes = interes/12;
        double inv = monto;
        int cont = 0;

        for (cont = 0; cont < añosMax; cont++) {

            for (int i = 0; i < 12; i++) {

                inv += (inv*interesMes);

            }

            System.out.printf("%.4f\n", inv);

        }
    }

    public void getsaldoInversion(int monto, double interes, double mínSal) {

        double interesMes = interes/12;
        double inv = monto;
        int cont = 0;
        int i;

        while (inv <= mínSal) {

            for (i = 0; i < 12; i++) {

                inv += (inv*interesMes);

            }
            cont++;
            i++;
                    
        }
        System.out.println(cont*12);
    }

}
