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
public class Tplez01e_esercizio21_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        // Dichiaro le variabili
        String numero ;
        int resto;
        String risultato;
        
        // Inizializzo variabili e chiedo input
        numero =JOptionPane.showInputDialog("inserire numero da controllare");
        System.out.println("Numero inserito: " + numero);

        // Elaboro
        resto = Integer.parseInt(numero)%2;
        
        if(resto == 0){
        risultato = "Pari";
        } else {
        risultato = "dispari";   
        }
        
        // Output utente
        JOptionPane.showMessageDialog(null , " Il numero " + numero + " è risultato " + risultato);
        System.out.println("risultato: " + numero + " è " + risultato);
  
        
    }
    
}
