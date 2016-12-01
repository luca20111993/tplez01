/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione_29_11_16Gioco_Carte.GiocoCarte_Mio;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class Player {
    private String nome = "pippo";
    private ArrayList <Carta> carte;
    int punti =0;
    
    public Player (String nome ){
        this.nome = nome;
        //Carte è un'array list vuoto di carte da usare per aggiungere o togliere le carte al player
        carte = new ArrayList<Carta>();
    }
    //metodo per aggiungere all'arraylist una carta che mi viene passata
    public void prendeCarta (Carta c){
        //metodo ad aggiunge in fondo a quelle che ci sono già
        carte.add(c);
    }
    //metodo per il settemmezzo per avere il conto dei punti con le carte che ho in arraylist
   public double dammiPunteggio (){
       double ris =0;
       //Ciclo tutti gli elementi dell'array fino a size ()
       for (int i = 0; i < carte.size(); i++) {
       //prendo una carta per volta la i-esima
       Carta c = carte.get(i);
       if (c.getValore() < 8){
           ris = ris + c.getValore();
       }else {
       ris = (float) ris + 0.5;
       }
       }
       
       return ris;
   }
}
   

    
   