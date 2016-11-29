/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez01;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Tplez01d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double  a , r;
        final double PIGRECO = 3.14;
         
       
        //Chiedo all'utente di inserire area
        String a1 = JOptionPane.showInputDialog("Inserire valore dell'area: ");
        a = Double.parseDouble(a1);
        System.out.println("Valore dell'area: " + a);
        
        //Eseguo primo calcolo di r3 dove r3 = a / PIGRECO
        double r3 = a / PIGRECO;
        
        //Eseguo secondo calcolo per trovare r
         r = Math.sqrt(r3);
         System.out.println("Valore del raggio:  " + r);
        
        
        
        
        
    }
    
}
