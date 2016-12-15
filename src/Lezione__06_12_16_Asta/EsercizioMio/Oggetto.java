/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione__06_12_16_Asta.EsercizioMio;

import java.util.ArrayList;


/**
 *
 * @author tss
 */
public class Oggetto {
    private String name;
    private int Min_Prezzo;
    private ArrayList<Offerte> Elenco_Offerte_oggetto = new ArrayList<Offerte>();

    public Oggetto(String name, int Min_Prezzo) {
        this.name = name;
        this.Min_Prezzo = Min_Prezzo;
    }

    public int getMin_Prezzo() {
        return Min_Prezzo;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    

    
    
}
