/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez01;

import java.util.Random;

/**
 *
 * @author tss
 */
public class Estrazione_del_lotto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i;
        int numero = 90; 
        String numero1 ="";
        int cicli = 6;
        
        for (i =0 ; i < cicli ; i ++){
            
           //Devo trovare un modo per tirare fuori un numero a caso
           
            numero1 +=  (int) (Math.random()*numero) + "\n";
            
            
             }
        
        System.out.println(numero1);
        
        
        
        
        
        
        
    }
    
}
