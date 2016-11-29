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
public class Esercizio_in_lab_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //variabili
        String input;
        boolean ancora = true;
        String codice_uscita = "exit";
        String totale = "";
        
        
        //caso numero 1
        
        int quanti;
        //prima di tutto chiedo quanti ne devo fare
        //quanti = 20
        input = JOptionPane.showInputDialog("quanti ne fai passare oggi?");
        //converto in intera la frase di quanti
        quanti= Integer.parseInt(input);
        
        //ciclo la richiesta nomi per tot volte uguale a "quanti"
        //utilizzo un ciclo for perchè sono 'quanti' ne faccio
        for (int i=0;i < quanti; i=i+1){
            //chiedo chi è
            input = JOptionPane.showInputDialog("Inserire il nome della persona da aggiungere.\nPer uscire scrivere exit o premere direttamente il tasto OK. ");
            // lo aggiungo al foglio
            totale = totale + (i + 1) + " " + input + "\n";
                       
        }
        //faccio vedere il foglio
        JOptionPane.showMessageDialog(null, "gli iscritti al corso di oggi sono \n" + totale);
        
        
        
        
        
        /*
        
        //caso numero 2
        
        
        while (ancora == true) {
            input = JOptionPane.showInputDialog("Inserire il nome della persona da aggiungere.\nPer uscire scrivere exit o premere direttamente il tasto OK. ");

            if (input.equalsIgnoreCase(codice_uscita = "exit") || input.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "la ringraziamo per l'utilizzo del software");
                ancora = false;

            } else {

                totale = totale + input + "\n";

            }

        }
        if (totale == "") {
            JOptionPane.showMessageDialog(null, "Non ci sono persone iscritte al corso.");
        } else {
            JOptionPane.showMessageDialog(null, "Le persone iscritte sono: \n" + totale);
        }
        */
    }
}
