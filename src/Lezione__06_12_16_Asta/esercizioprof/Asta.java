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
public class Asta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        elencoOggettiAsta listaOgg=new elencoOggettiAsta();
        
        oggettoAsta ogg1=new oggettoAsta();
        ogg1.prezzoBase=25000;
        ogg1.nomeOggetto="asd";
        listaOgg.addOggettoAsta(ogg1);
        ogg1=new oggettoAsta();
        ogg1.prezzoBase=15000;
        ogg1.nomeOggetto="sdf";
        listaOgg.addOggettoAsta(ogg1);
        ogg1=new oggettoAsta();
        ogg1.prezzoBase=5000;
        ogg1.nomeOggetto="dfg";
        listaOgg.addOggettoAsta(ogg1);
        //3 elementi all'asta
        
        //2 persone
        
        
        
        //imbecille prima do farli parlare pèreparalo schedario imbbeeee
        ElencoOfferte listOff=new ElencoOfferte();
        
        Persona p1 =new Persona();
        p1.cognome="marcegaglia";
        p1.soldi=235000;
        Persona p2 =new Persona();
        p2.cognome="briatore";
        p2.soldi=1235000;
        
        
                
            
        //Offerta nuovaoff;
        
        //nuovaoff=p2.nuovaOfferta();
        //listOff.addOfferta(off);
        
        listOff.addOfferta(p1.nuovaOfferta());
        listOff.addOfferta(p2.nuovaOfferta());
        listOff.addOfferta(p1.nuovaOfferta());
        listOff.addOfferta(p2.nuovaOfferta());
        listOff.addOfferta(p1.nuovaOfferta());
        //stampo le offerte finora
        System.out.println(listOff.reportOfferte());
        // ad sempio de abbiamo un oggetto "piuma dorata" e un giocatore luca che ha puntato 1250
        System.out.println(listOff.aggiudicaOggetto("piuma dorata"));
        //risultato di esempio stampa "luca si aggiudica piuma dorata per 1250 euro"
        
    }
    
}
