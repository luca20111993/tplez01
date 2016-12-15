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
public class Casa_Asta {
    
    private ArrayList<Oggetto> oggetti_v = new ArrayList<Oggetto>();
    private ArrayList<Persona> TOT_Persone = new ArrayList<Persona>();
    private ArrayList<Offerte> TOT_Offerte = new ArrayList<Offerte>();
    private ArrayList<Resoconto> TOT_Resoconti = new ArrayList<Resoconto>();
    
    public void addResoconto (Resoconto resoconto) {
        TOT_Resoconti.add(resoconto);
    }
    
    public void addPersona (Persona persona) {
        TOT_Persone.add(persona);
    }

   public void addOggetto (Oggetto oggetto) {
        oggetti_v.add(oggetto);
    }
   
   public Casa_Asta() {
    }
    
    public String quantiArticoli (){
        String parziale ="";
        for (int i = 0; i < oggetti_v.size(); i++) {
            parziale += "Nome oggetto: " + oggetti_v.get(i).getName() + " " +  " ---- Prezzo minimo: " + oggetti_v.get(i).getMin_Prezzo() + " \n";
            
        }
        return parziale;
        
    }
    
    //PORTO FUORI IL SIZE DELL'ARRAY
    public int  getOggetti_v() {
        return oggetti_v.size();
    }
    //PORTO FUORI IL SIZE DELL'ARRAY
    public int getTOT_Persone() {
        return TOT_Persone.size();
    }
    
    //Creo un metodo per avere il saldo della mia persona.
    //index sta a indicare cio che nel main è espresso coem J 
    //Quidni stiamo specificando di chi è quel conto
    public int getSaldo(int index){
        return TOT_Persone.get(index).getConto();
    }
    public String getNome(int index){
        return TOT_Persone.get(index).getNome();
    }
    public String getCognome(int index){
        return TOT_Persone.get(index).getCognome();
    }
        
}

