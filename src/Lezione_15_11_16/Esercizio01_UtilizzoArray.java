/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione_15_11_16;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Esercizio01_UtilizzoArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String report ="";
        String report2 = "";
        int totale;
        
        
        String input = JOptionPane.showInputDialog("Quanti numeri vuoi inserire?  ");
        int max_numeri = Integer.parseInt(input);
        
        int numeri [] = new int [max_numeri];
        
        int min = 0;
        int max = 0;
        
        // Al posto di max_numeri qua sotto posso mettere il nome dell'array (numeri) .lenght
        // Poichè si ha sempre la grandezza dell'array in tempo reale
        for (int i = 0; i < max_numeri; i++) {
            input = JOptionPane.showInputDialog("Inserire il numero: ");
            numeri[i] = Integer.parseInt(input);
            report += " # "+ (i+1) + " numero inserito: " + numeri[i] + "\n";
            
            if (i == 0){
                min = numeri[i];
                max = numeri[i];
            }else{ 
                
            if (numeri[i] < min)
                    min = numeri[i];
                    
            if (numeri[i] > max)
                    max = numeri[i];
                    
            }
            
            report2= "il valore minimo è: " + min +"\n" + "il valore massimo è :" + max;
            
        }
        System.out.println(report + "\n" + report2);
        
        
    }
    
}
