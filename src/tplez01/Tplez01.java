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
public class Tplez01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Definisco le variabili in cui verrà inserito l'input
        
        String num1;
        String num2;
        int conto;
        
        // Caricare i dati per ottenere il conto
        
        num1 = JOptionPane.showInputDialog("Primo Numero intero");
        num2 = JOptionPane.showInputDialog("Secondo Numero intero");
        
        // Faccio il conto totale elaborazione sempre interi
        
        try {
        
        conto = Integer.parseInt(num1) +Integer.parseInt(num2);
                
        // Stampo il conto (output)
        
        JOptionPane.showMessageDialog( null , conto);
        } catch (Exception e) {
            JOptionPane.showMessageDialog( null , "scrivi meglio la prossima volta");
        }
        
    
   
    
    }
     
}
