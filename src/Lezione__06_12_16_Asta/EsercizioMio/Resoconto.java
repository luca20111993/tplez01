/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione__06_12_16_Asta.EsercizioMio;

/**
 *
 * @author tss
 */
public class Resoconto {
    private String nome , cognome;
    private int offerta;
    private String oggetto_puntato;

    public Resoconto(String nome, String cognome, int offerta, String oggetto_puntato) {
        this.nome = nome;
        this.cognome = cognome;
        this.offerta = offerta;
        this.oggetto_puntato = oggetto_puntato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getOfferta() {
        return offerta;
    }

    public void setOfferta(int offerta) {
        this.offerta = offerta;
    }

    public String getOggetto_puntato() {
        return oggetto_puntato;
    }

    public void setOggetto_puntato(String oggetto_puntato) {
        this.oggetto_puntato = oggetto_puntato;
    }
    
    
    
    
    
}
