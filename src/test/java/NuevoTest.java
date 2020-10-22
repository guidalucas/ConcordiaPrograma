/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.finnegans.concordiaprograma.Monedero;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author Lucas
 */
public class NuevoTest {
    
    @Test
    public void ContructorTest() {
        
       Monedero mon = new Monedero(50);
        
         double actual=mon.obtenerSaldo();
        assertEquals(actual,50, 0.00); 
        
    }
    
}
