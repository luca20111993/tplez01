/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione_22_11_16.Esercizio2;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class GestCorrentisti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numcc;
        numcc = Integer.parseInt(JOptionPane.showInputDialog("Quanti correntisti? "));
        CorrentistaClass arcc [] = new CorrentistaClass [numcc];
        
        //Ciclo per caricare correntisti
        for (int i =0 ; i<arcc.length;i++){
            String cognomeU = JOptionPane.showInputDialog("# " + (i+1) + "cognome?");
            String nomeU = JOptionPane.showInputDialog("# " + (i+1) + "nome?");
            int anno_nascitaU = Integer.parseInt(JOptionPane.showInputDialog("anno di nascita? "));
            
            CorrentistaClass cc = new CorrentistaClass(cognomeU , nomeU , anno_nascitaU);
            
            double conto1 = Double.parseDouble(JOptionPane.showInputDialog("quanto versi?" , 0));
            cc.addConto (conto1);
            
            
            
            
            
            
            //DA FINIRE
            
        }
        
        
        
    }
    
}
