/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione_29_11_16Gioco_Carte.GiocoCarte_Prof;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class Player {

    public String getNome() {
        return nome;
    }

    private String nome = "Erik";
    private ArrayList<Carta> carte;
    int punti = 0;

    public Player(String nome) {
        this.nome = nome;
        //carte array list vuoto di carte da usare per aggiungere o togliere le carte al player
        carte = new ArrayList<Carta>();
    }

    //metodo per aggiungere asll'array listi una carta che mi viene passata
    public void prendeCarta(Carta c) {
        //metodo add aggiunge in fondo a quelle che ci sono gia'
        carte.add(c);

    }

    public void seiFuori(){
    
    carte.clear();
    
    }
    
    
    
    //metodo per il settemezzo per avere il conto dei punti con le carte che ho in arraylist
    public double dammiPunteggio() {
        double ris = 0;
        //ciclpo tutti glie lementi dell'array fino a size()
        for (int i = 0; i < carte.size(); i++) {
            //prendo una carta per volta la i-esima
            Carta c = carte.get(i);
            if (c.getValore() < 8) {
                ris = ris + c.getValore();
            }
            else
                ris = ris + 0.5;
        }
        return ris;
    }
   
    //Metodo per chiedere che carte ha il giocatore. il giocatore risponde a parole quindi in STRING
    //e non in carte.
    public String dimmiLeCarte (){
        //Diamo questa risposta in modo che "non ci sono carte in mano "ed " sono uscito" siano la risposta base
        //in modo da toglierci qualche maldipancia in futuro
        String msg ="Non ho carte in mano oppure sono uscito";
        String elenco ="";
        //per leggere l'array lsit delle carte lo ciclo!
        for (int i=0 ; i< carte.size() ; i++){
            
            elenco += carte.get (i).getNome() + "\n";       
        }
        
        //adesso mi trovo con elenco vuoto o con le carte.
        
        //se elenco è ancora vuoto ritorno msg così com'è
        //altrimenti assegno a msg l'elenco
        
      
//        PRIMO METODO
//        if (elenco.equals("")){
//            msg = msg;
//        }else{
//            msg = elenco;
//        
//        }
//        return msg;

    if (elenco.equals("")){
            return msg;
        }else{
            return elenco;
        
        }

        
    }
}
