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
public class Tplez01e_esercizio21_b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Dichiaro le variabili
         int numero; 
         int resto;
         String risultato;
        
        // Inizializzo variabili e chiedo input
        numero = 3;
        int valore = 5;
        
        // Elaboro
        resto= numero % 2;
        if (resto !=0){
            risultato = "dispari";
        } else {
            risultato = "pari";
        }
        //output utente
        System.out.println("risultato: " + numero + "è" + risultato);
        
        if (resto == 0 && numero < 6) {
            risultato = "vince pari";
        } else {
            if (resto != 0 && numero < 6){
                risultato = "vince dispari";
        } else {
            risultato = "ma che numero mi hai dato?";
        }
        }
    }
}
    

