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
public class Monedero {

    private double monto;
    
    public Monedero(double monto) {
        
        this.monto=monto;
        
    }
    
    
    public double obtenerSaldo(){
        
        return this.monto;
        
        
    }
    
    
    
    
}
