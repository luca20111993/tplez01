/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione_15_11_16;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Esercizio16_11_16_secondomodo {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        int tot = 0;

        String input;

        int max = 0;
        int min = 11;
        int sommavoti = 0;
        String alunno_maggiore = "";
        String alunno_minore = "";
        float media;

        input = JOptionPane.showInputDialog("quanti persone hanno fatto il test");

        tot = Integer.parseInt(input);
        // so in tot quanto siono

        //creo due array separati per caricarci i dati nomi e voti corrispondenti
        String nomi[] = new String[tot]; //gli array vengono dichiarati dopo l'assegnazione delle altre variabili

        int voti[] = new int[tot];
        //passo al caricamento degli array 
        for (int i = 0; i < nomi.length; i++) {

            input = JOptionPane.showInputDialog("inserisci il nome dell'alunno");
            nomi[i] = input;

            input = JOptionPane.showInputDialog("qual'è il voto del test");
            voti[i] = Integer.parseInt(input);

        } // fine caricamento dati

//inizio elaborazione dasrti
//unico ciclo che fa tante cose diverse
        for (int i = 0; i < nomi.length; i++) {

            sommavoti = sommavoti + voti[i];

            if (voti[i] > max) {

                max = voti[i];
                alunno_maggiore = nomi[i];

            }
            if (voti[i] < min) {

                min = voti[i];
                alunno_minore = nomi[i];

            }

        } //fine ciclo elabnorazione dati
        
        
        
        
        //altra versione che elabora i dati finali usando metodi specifici
        
        //utilizzo metodo per ottenere il massimo da un array di numeri
        
        
        //a max assegno il numero che mi ritorna il metodo getMax che vuole come parametro l'array 
        //in cui cercare
        max = getMax (voti);
        min = getMin (voti);
        media = getMedia (voti);
        String nomeMax;
        int posMax = getindexMax (voti);
        nomeMax = nomi [posMax];
        
        
        
        
        
        
        //calcolo media in sommavoti !!! risparmio una variabile ma si capisce poco
        media= sommavoti / tot;
        //posso passare a pensare all'output
        
        System.out.println("il studente col voto maggiore è: " + alunno_maggiore + "  voto: " + max);
        System.out.println("il studente col voto minore è: " + alunno_minore + "  voto: " + min);
        System.out.println("la media dei voti è: " + media);
    }
    
    
    
    
    
    /*Creo metodo  obbligatorio static caso particolare
    poi che tipo di dati deve ritornare ad esempio un numero intero ... int - frase ... String
    poi nome dell'azione da fare su che cosa ; minuscolo verbo , maiuscolo oggetto. dammi il massimo = getMax
    obbligatorio le parentesi con gli n anche 0 parametri da passare
    ad esempio un array da verificare , dichiaro parametro di tipo corretto    (int [] valori)
    oppure una frase       (String frase)
    oppure più parametri   (int x , int y , int z)
    poi le graffe da racchiudere il codice da eseguire SUBITO tutte e due
    scrivere subito il comando di return del tipo dichiarato all'inizio del metodo
    ad esempio se ritorna un int       return risultato
    dichiarare e inizializzare all'inizio del codice la variabile usata come return
    */
    static int getMax (int [] valori){
        
        int risultato = 0;
        
        //inizio elaborazione dasrti
         for (int i = 0; i < valori.length; i++) {

           if (valori [i] > risultato){
               risultato = valori[i];

            } 
            } //fine ciclo elabnorazione dati
         
            return risultato;
        } 
        static int getMin (int [] valori){ // valori = una copia del array voti
        
        //int risultato = 999999999;
        /*Altro sistema più elegante , assumo che il primo sia il minore
        e parto inizializato sul primo
        */
        int risultato  = valori [0];
        
        //Allora se voglio salto il primo giro , inizializzo i a 1 invece che il solito 0
        //inizio elaborazione dasrti
         for (int i = 1; i < valori.length; i++) {

           if (valori [i] < risultato){
               risultato = valori[i];

            } 
            } //fine ciclo elabnorazione dati
         
            return risultato;
        
        }
        
        static int getMedia (int [] valori){
        
            int risultato;
            int somma =0;
            //li ciclo tutti e li sommo in somma
        
          //inizio elaborazione dasrti
         for (int i = 0; i < valori.length; i++) {

           somma = somma + valori [i];
         } // fine ciclo elaborazione dati
         //Faccio la media
         risultato = somma/valori.length;
         return risultato;  
        
        }
        
        static int getindexMax (int [] valori){
        
            int risultato=0;
            int indexMax =0;
            
         for (int i = 0; i < valori.length; i++) {
             if (valori [i] > risultato){
                 
                 //caso migliore max 
                 risultato = valori [i];
                 //salvo dove sta il migliore
                 indexMax = i;
                 
             }
         }//fine ciclo
         return indexMax;

        }
        }
        

    
