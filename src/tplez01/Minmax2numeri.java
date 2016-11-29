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
public class Minmax2numeri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //due numeri da confrontare a e b
        //li dichiaro
        int a;
        int b;
        //gli assegno per prova dei valori
        a = 5;
        b = 1;
        String input;
        //faccio dell'input da utente
        input = JOptionPane.showInputDialog("dimmi a");
        //in input trsto e lo trasformio in numero
        a = Integer.parseInt(input);
        b = Integer.parseInt(JOptionPane.showInputDialog("dimmi b"));
        String risultato;
        //verifico il piu' grande e preparo l'output in risultato
        if (a > b)
            {//caso a max
                risultato = "a maggiore di b [a-b]: [" + a + "-" + b + "]";
            } else { //guardo altri casi
                if (b > a) { //caso b max
                    risultato = "b maggiore di a [a-b]: [" + a + "-" + b + "]";
                } else { //allora sono per forza uguali
                    risultato = "a uguale a b [a-b]: [" + a + "-" + b + "]";
                }
            }
        //oppure piu' leggibile
        if (a == b) //caso uguali
        {
            risultato = "a uguale a b [a-b]: [" + a + "-" + b + "]";

        } else { //caso diversi
            if (a < b) { //caso b maggiore 
                risultato = "b maggiore di a [a-b]: [" + a + "-" + b + "]";
            } else { // allora per forza caso a minore
                risultato = "a uguale a b [a-b]: [" + a + "-" + b + "]";
            }
        }

        
        if (a == b) //caso uguali
            risultato = "a uguale a b [a-b]: [" + a + "-" + b + "]";
        if (a < b) //caso b maggiore 
            risultato = "b maggiore di a [a-b]: [" + a + "-" + b + "]";
        if (a > b) //caso a max
            risultato = "a maggiore di b [a-b]: [" + a + "-" + b + "]";
        

        //stampo il risultato
        System.out.println(risultato);
    }

}
