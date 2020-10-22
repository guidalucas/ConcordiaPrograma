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
public class Cuenta {
private int saldo;

    public Cuenta(int saldo) {
        
           this.saldo=saldo;
        
    }
    

    public int getSaldo() {
        return saldo;
    }

    public void acreditacion(int saldo) {
       
        this.saldo += saldo;
    }
   
    public void retiro(int saldo) {
     
        if(saldo<this.saldo){
        
        this.saldo -= saldo;}
    else{
            System.out.println("Saldo insuficiente, su saldo es "+ this.saldo+ " ingrese nuevamente el monto a extraer");
    
    
}
   
    }
    
    
    
}
