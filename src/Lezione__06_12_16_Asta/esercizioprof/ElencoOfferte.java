/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione__06_12_16_Asta.esercizioprof;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class ElencoOfferte {
    String nomeListaOfferte;
    ArrayList<Offerta> elencoOfferte;

    public ElencoOfferte() {
       elencoOfferte= new ArrayList<Offerta>();
    }

    public void addOfferta(Offerta o){
    elencoOfferte.add(o);
    }
    
    public String reportOfferte(){
        String msg="";
        //utilizzo di ciclo for che cicla collezioni di oggetti ad es arraylist
        for (Offerta o : elencoOfferte) {
            msg+=o.getCognome() + " offre " + o.getValore() + " per " +o.getNomeOggetto() +"\n";
        }
 
    return msg;
    }

    //ritorna il nome di chi si aggiudica l'oggetto xxx e a quanto tramite lo string nomeoggetto
    public String aggiudicaOggetto(String nomeOggetto){
    String msg="";
        //fare ciclo per trovare chi si aggiudice per quanto l'oggetto passato coe parametro
    return msg;
    }
}
