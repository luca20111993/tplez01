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
public class elencoOggettiAsta {
    String nomeAsta;
    ArrayList<oggettoAsta> elencoOggetti= new ArrayList<oggettoAsta>();
    
    public void addOggettoAsta(oggettoAsta o){
    elencoOggetti.add(o);
    }
    
    
    
}
