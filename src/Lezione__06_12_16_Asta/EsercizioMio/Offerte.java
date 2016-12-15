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
public class Offerte {
    private String Nome_Off , Cognome_Off;
    private int cifra_offerta;
    //private String Nome_Oggetto;  | Scontato perchè ho messo l'array in oggetto.

    public Offerte(String Nome_Off, String Cognome_Off, int cifra_offerta /*String Nome_Oggetto*/) {
        this.Nome_Off = Nome_Off;
        this.Cognome_Off = Cognome_Off;
        this.cifra_offerta = cifra_offerta;
        //this.Nome_Oggetto = Nome_Oggetto;
        
    }
    
    public void setNome_Off(String Nome_Off) {
        this.Nome_Off = Nome_Off;
    }

    public String getCognome_Off() {
        return Cognome_Off;
    }

    public void setCognome_Off(String Cognome_Off) {
        this.Cognome_Off = Cognome_Off;
    }

    public int getCifra_offerta() {
        return cifra_offerta;
    }

    public void setCifra_offerta(int cifra_offerta) {
        this.cifra_offerta = cifra_offerta;
    }

   
}
