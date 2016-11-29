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
public class BancomatWhile2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean ancora = true;
        String input;
        String codice_uscita = "0000";
        String codice_accesso = "007";
        int conto_bancomat = 0;
        int n = 5; //n numero massimo di tentativi

        // ciclo per chiedere codice e servire i clienti o uscire da programma
        do {// tutto quello che accade per un utente del servizio
            input = JOptionPane.showInputDialog("Dammi il codice oppure 0000 per uscire");
            //verifico il codice di uscita o vado a lavorare
            if (input.equals(codice_uscita)) // mi preparo per uscire , blocco il ciclo
            {
                ancora = false;
            } else {
                //verifica codice
                if (input.equals(codice_accesso)) {
                    //ok fai le operazioni
                    JOptionPane.showMessageDialog(null, "entrata ok codice bancomat");
                    //ciclo operatività bancomat (v)versamento (p)prelievo o x(fine)

                    boolean altre_operazioni = true;
                    while (altre_operazioni == true) {
                        
                        //prima chiedo cosa vuole fare se v o p
                        //output obbligatorio per ogni operazione
                        String risultato = "cosa mi hai chiesto? riprova";
                        
                        input = JOptionPane.showInputDialog("dimmi v o p o x per le operazioni");
                        //controllo cosa vuole fare
                        if (input.equalsIgnoreCase("x")) {
                            altre_operazioni = false;
                            risultato = "arrivederci";
                        
                        }

                        if (input.equalsIgnoreCase("v")) {
                            input = JOptionPane.showInputDialog("verso : (conto=" + conto_bancomat + ")");
                            //in input testo e lo trasformo in numero
                            int versamento = Integer.parseInt(input);
                            conto_bancomat = conto_bancomat + versamento;
                            risultato = "Versamento effettuato: " + versamento + "\nattuale conto: " + conto_bancomat;
                        }

                        if (input.equalsIgnoreCase("p")) {
                            //prelevo dal conto
                            
                            input = JOptionPane.showInputDialog("hai sul conto " + conto_bancomat + "\nquanto prelevi?");
                            int prelievo = Integer.parseInt(input);
                            //verifico cosa fare per il prelievo
                            if (prelievo <= conto_bancomat) { //abbastanza soldi
                                //tolgo dal conto
                                conto_bancomat = conto_bancomat - prelievo;
                                //messagio per utente
                                risultato = "Prelievo accettato:" + prelievo + "\nattuale conto: " + conto_bancomat;
                            } else {
                                //non modifico il conto e messaggio utente
                                risultato = "Prelievo impossibile:" + prelievo + "\nattuale conto: " + conto_bancomat;
                            }

                        }
                        //ogni volta che faccio una operazione faccio vedere il risultato
                        JOptionPane.showMessageDialog(null, risultato );
                        
                        

                    }//fine del ciclo while operazioni p v x
                    
                    

                } else {
                    if (n == 1){
                        JOptionPane.showMessageDialog(null, "Hai finito il numero di tentativi");
                        break;
                    }else{
                        n = n-1;
                        JOptionPane.showMessageDialog(null, "ti restano soltanto " + n + "tentativi");
                               
                        
                    }
                    //digli che è un truffatore 
                    JOptionPane.showMessageDialog(null, "codice errato ritenta (fra un po' dopo 5 tentativi si spegnerà tutto");
                }
            }

        } while (ancora == true );

    }
}
