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
public class Correntista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input;
        String nome;
        String cognome;
        int conto=0;
        int anno_nascita;
        String cognomeU , nomeU; 
        int anno_nascitaU;
        
        
        
        //elaborazione
        /*input = JOptionPane.showInputDialog("Inserire il nome: ");
        nome = input;
        
        input = JOptionPane.showInputDialog("Inserire il cognome: ");
        cognome = input;
        
        input = JOptionPane.showInputDialog("Inserire anno di nascita: ");
        anno_nascita = Integer.parseInt(input);*/
        
        
        cognomeU = JOptionPane.showInputDialog("Inserire il cognome: ");
        nomeU = JOptionPane.showInputDialog("Inserire il nome: ");
        anno_nascitaU = Integer.parseInt (JOptionPane.showInputDialog("inserire anno nascita: "));
        
        
        CorrentistaClass utente1 = new CorrentistaClass (cognomeU , nomeU , anno_nascitaU);
        
        System.out.println("Cognome dell'utente: " + cognomeU + "\nNome dell'utente: " + nomeU + "\nAnno di nascita dell'utente: " + anno_nascitaU);
        
        
        double versamento = Double.parseDouble(JOptionPane.showInputDialog("Inserire la quantità di denaro da versare: "));
        
        utente1.addConto(versamento);
        
        
        System.out.println("Il suo conto è di: " + utente1.getConto());
        
        System.out.println("Le ricordiamo che le sue credenziali sono: " + utente1.getInfo());
        
        
        
       
    }
    
}
