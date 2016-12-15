/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione__06_12_16_Asta.esercizioprof;

/**
 *
 * @author tss
 */
public class Offerta {

private int valore;
private String cognome;
private String nomeOggetto;

    public Offerta(int valore, String cognome, String nomeOggetto) {
        this.valore = valore;
        this.cognome = cognome;
        this.nomeOggetto = nomeOggetto;
    }

    public int getValore() {
        return valore;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNomeOggetto() {
        return nomeOggetto;
    }


    
}
