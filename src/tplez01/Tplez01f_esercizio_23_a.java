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
public class Tplez01f_esercizio_23_a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Enuncio variabili
        String n1 , risultato;
        double  n , n3;
        
        // Inizializzo variabili
        n1 = JOptionPane.showInputDialog("numero da controllare");
        System.out.println("Numero inserito" + n1);
        n3 = Double.parseDouble(n1);
        
        n = Math.abs(n3);
        System.out.println("Numero in valore assoluto" + n);
        
        if (n3 < 0){
            risultato = "Il numero è negativo";
            System.out.println(risultato);
        } else {
            if (n3 == 0){
                risultato = "Il numero è neutro";
            }else {
                risultato = "Il numero è positivo";
        }
        }
        // output
        JOptionPane.showMessageDialog(null, "il numero inserito è: " + n1 + "\nil numero in valore assoluto è: " + n + "\ned " + risultato);
        
        
        
        
        
    }
    
}
