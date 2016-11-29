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
public class Tplez01f_esercizio21_c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Enuncio le variabili
        String num1;
        String risultato;
        int resto;
        // Inizializzo variabili
        num1 = JOptionPane.showInputDialog("Inserire numero da controllare");
        
        resto = Integer.parseInt(num1) % 3;
        
        // Elaboro
        // N / 3 = 0 ergo multiplo di 3 altrimenti no
        if (resto == 0){
            risultato = " multiplo di 3";
        } else {
            risultato = " non multiplo di 3";
        }
         // Output
        JOptionPane.showMessageDialog(null , " Il numero " + num1 + " è risultato " + risultato);
        System.out.println("risultato: " + num1 + " è " + risultato);
        
        }
        
        
        
               
        
    }
    

