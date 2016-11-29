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
public class Tplez01c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereù
        // Enuncio le variabili
        // TODO code application logic hereù
        // Enuncio le variabili
       
        String a ;
        String b ;
        int d;
        
        // A - B = D
        //Chiedo all'utente di inserire un valore di A
        
        a =JOptionPane.showInputDialog("Inserire primo numero");

        
        // Chiedo all'utente di inserire un valore di b
        
        b =JOptionPane.showInputDialog("Inserire secondo numero");
        
        
        //Eseguo operazione:
        
        d = Integer.parseInt(a) - Integer.parseInt(b) ;
        
        
        JOptionPane.showMessageDialog(null , d);
        
        
        
        
        
                
        
        
        
        
        
    }
    
}
