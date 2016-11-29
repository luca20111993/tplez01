/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione_22_11_16.Esercizio1;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Esaminando {

    //Dichiariamo le proprietà del mio oggetto
    String cognome;
    String nome;
    private int voto;
    /*Se inizializzo il costruttore esaminando poi quando creo la variabile nel main 
    devo mettere le variabili esplicate dopo l'esaminando altrimenti il
    mio programma non va.
    
    */
    public Esaminando (String cognome , String nome){ 
        this.cognome = cognome;
        this.nome = nome;
        
    }

    //metodi o abilità dell'oggetto
    //imposto il voto dato che abbiamo messo voto in privato
    
    
    //Void perchè non deve tornare nulla poichè lavora coi valori che si 
    //trovano nella classe e non nel main
    void impostavoto(int voto) {
        //Do un range di numeri validi
        if (voto >= 0 && voto <= 100) {

            /*This si riferisce al voto del metodo di sopra */
            this.voto = voto;

        } else {
            JOptionPane.showMessageDialog(null, "valore inserito errato");

        }
    }

    String cometichiami() {
        //Mettere subito ris e return ris

        //Dichiaro la variabile di ritorno
        String ris = "";
        //elaboro con le mie proprietà la frase di presentazione
        ris = "ciao a tutti , mi chiamo " + nome + " " + cognome;
        //ritorno la frase       
        return ris;
    }
    
    
    boolean seipiùbravodi (Esaminando avversario){
    boolean ris = false;
    if (voto>avversario.leggovoto())
        ris = true;   
    
    return ris;
    }
    
    
    //Leggo il voto
    int leggovoto() {
        return voto;
    }

}
