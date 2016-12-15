/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione__01_12_16.gestioneWalletprof;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class Wallet1 {
//soffietto che puo' contenere delle monete

    private ArrayList<Moneta1> monete = new ArrayList<Moneta1>();

    public ArrayList<Moneta1> getMonete() {
        return monete;
    }

    public void addMoneta(Moneta1 moneta) {
        monete.add(moneta);
    }

    public void removeMoneta(double valoremoneta) {
        //se ho per caso una moneta del valore corretto la rimuovo dall'arraylist delle monete
        //magari dimmelo se l'hai fatto o meno
        for (int i = 0; i < monete.size(); i++) { //ciccla tutte le monete
            //se la moneta i-esima dell'arralistmonete = a valore richiesto
            //la rimuovo e segno ok fatto
            if (monete.get(i).getValore() == valoremoneta) {
                monete.remove(i);
                break;
            }

        }

    }

    public int quantiPezziDa(double valore) {
        int quanti = 0;
        for (int i = 0; i < monete.size(); i++) {
            if (monete.get(i).getValore() == valore) {
                quanti++;
            }

        }
        return quanti;

    }

    public double QuantiSoldi() {
        //scorro tutte le monete e guardo quanto valgono sommandole
        //
        // cicclo tutte le monete dell'arraylist
        //su ogni moneta vado a vedere quanrto vale 
        //      e lo aggiungo al mio parziale
        double parziale = 0;
        for (int i = 0; i < monete.size(); i++) {
            parziale = parziale + monete.get(i).getValore();

        }
        return parziale;
    }

}
