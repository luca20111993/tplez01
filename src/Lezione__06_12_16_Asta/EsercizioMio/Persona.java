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
public class Persona {
    //enuncio le mie variabili e le metto private
    private String nome , cognome;
    private int conto;
    private int offerta;
    
   
    
    //Creo metodo costruttore
    public Persona(String nome, String cognome, int conto) {
        this.nome = nome;
        this.cognome = cognome;
        this.conto = conto;
    }
    
    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getConto() {
        return conto;
    }
    
    
}
