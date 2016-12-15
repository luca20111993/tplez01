/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione__13_12_2016.Biblioteca1_0;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class Biblioteca {

    private String nomeBiblioteca;
    private String indirizzo;
    private ArrayList<Persona> elencoDipendenti = new ArrayList<Persona>();
    private ArrayList<Libro> elencoLibri = new ArrayList<Libro>();
    private ArrayList<Persona> elencoClienti = new ArrayList<Persona>();

    public Biblioteca(String nomeBiblioteca, String indirizzo) {
        this.nomeBiblioteca = nomeBiblioteca;
        this.indirizzo = indirizzo;
    }

    public String getNomeBiblioteca() {
        return nomeBiblioteca;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public ArrayList<Persona> getElencoDipendenti() {
        return elencoDipendenti;
    }

    public ArrayList<Libro> getElencoLibri() {
        return elencoLibri;
    }

    public ArrayList<Persona> getElencoClienti() {
        return elencoClienti;
    }

   
    
    
    
    
    public String GetSchedario() {
        String resoconto = "";
        int conta=0;
        for (int i = 0; i < elencoLibri.size(); i++) {
            conta= i+1;
            resoconto += "Nome libro numero " + conta  + " : " + elencoLibri.get(i).getTitolo() + " - Nome autore : " + elencoLibri.get(i).getAutore() +
                    " - Codice del libro : " + elencoLibri.get(i).getCodLibro() + "\n";

        }
        return resoconto;

    }
}