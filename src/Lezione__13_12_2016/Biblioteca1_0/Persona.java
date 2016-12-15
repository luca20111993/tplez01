/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione__13_12_2016.Biblioteca1_0;

/**
 *
 * @author tss
 */
public class Persona {
    
    private String cognome , nome;

    public Persona(String cognome, String nome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    
    
}
