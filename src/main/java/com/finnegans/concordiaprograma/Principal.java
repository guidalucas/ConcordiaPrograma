/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.finnegans.concordiaprograma;

/**
 *
 * @author Lucas
 */
public class Principal {

    public static void main(String[] args) {

        Cuenta miCuenta = new Cuenta(1000);
        System.out.println(miCuenta.getSaldo());
        miCuenta.acreditacion(1000); 
        System.out.println(miCuenta.getSaldo()); // 1000
        miCuenta.retiro(3000); 
        System.out.println(miCuenta.getSaldo()); // 450
        
        
    }

}
