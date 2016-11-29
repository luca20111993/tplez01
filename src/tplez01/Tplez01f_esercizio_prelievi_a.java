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
public class Tplez01f_esercizio_prelievi_a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Enuncio le variabili
       String a1 , b1 , c1 , d1 , risultato ;
       String e1;
       double a , b , c , d;
       double e;
       //Chiedo all'utente le variabili
       a1 = JOptionPane.showInputDialog("Ciao è il primo deposito di oggi! quanto vuoi depositare?");
       b1 = JOptionPane.showInputDialog("Ciao è il secondo deposito di oggi! quanto vuoi depositare?");
       c1 = JOptionPane.showInputDialog("Ciao è il terzo deposito di oggi! quanto vuoi depositare?");
       d1 = JOptionPane.showInputDialog("Ciao è il quarto deposito di oggi! quanto vuoi depositare?");
       e1 = JOptionPane.showInputDialog("Ciao stai prelevando! quanto vuoi prelevare?"); 
       
       // trasformo tutto in double
       
       a=Double.parseDouble(a1);
       b=Double.parseDouble(b1);
       c=Double.parseDouble(c1);
       d=Double.parseDouble(d1);
       e=Double.parseDouble(e1);
       
       // (a + b + c + d) - e = quanto resta sul conto?
       
       double restante = (a + b + c + d) - e ;
       
       if (restante >= 0) {
           risultato = "Il contante sul tuo conto è di valore: " + restante + "ed hai ritirato : " + e + "euro";
       } else {
           risultato = "Il contante richiesto supera il totale del conto, non è possibile ritirare la cifra richiesta";
       }
       
       JOptionPane.showMessageDialog(null, risultato);
       
              
       
        
    }
            
                    
            
        }
        
        
        
        
        
        

    

