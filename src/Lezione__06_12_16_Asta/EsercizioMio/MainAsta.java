/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione__06_12_16_Asta.EsercizioMio;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class MainAsta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creo la mia casa d'asta
        Casa_Asta Asta = new Casa_Asta();
        
        //Creo dei partecipanti alla mia asta , ogni persona avrà un n , c e conto
        Persona A = new Persona("Mario", "Rossi", 100);
        Asta.addPersona(A);
        
        Persona B = new Persona("Luana", "De Santis", 80);
        Asta.addPersona(B);
        
        Persona C = new Persona("Giovanna", "D'arco", 50);
        Asta.addPersona(C);
        
        
        //Creo banditore
        Banditore X = new Banditore("M", "Z");
        
        
        
        //Creo i miei oggetti e li spedisco nel mio array list
        //ogg1
        Oggetto Articolo1 = new Oggetto("Bicicletta Corsa", 40);
        Asta.addOggetto(Articolo1);
        //ogg2
        Oggetto Articolo2 = new Oggetto("Sci", 20);
        Asta.addOggetto(Articolo2);
        //ogg3
        Oggetto Articolo3= new Oggetto("piatto", 15);
        Asta.addOggetto(Articolo3);
        //ogg4
        Oggetto Articolo4 = new Oggetto("forchetta", 5);
        Asta.addOggetto(Articolo4);
        
        
        String output= Asta.quantiArticoli();
        System.out.println("Gli articoli all'asta sono: \n" + output);
        
        
        //Ho creato il metodo get oggetti su casa_asta e questo metodo per funzionare devo fare l'oggetto creato
        //col nome di asta e poi il metodo che ho creato che contenga la risposta in size
        
        for (int i = 0; i <Asta.getOggetti_v(); i++) {
           int max=0; 
           
            for (int j = 0; j < Asta.getTOT_Persone(); j++) {
                String input = JOptionPane.showInputDialog("Quanto punti? Ricordati che il tuo credito disponibile è di: " + Asta.getSaldo(j));
                int puntata = Integer.parseInt(input);
                if (puntata > max){
                    max = puntata ;
                } 
            }
            
            
            
            
        }
        
    }
    
}




