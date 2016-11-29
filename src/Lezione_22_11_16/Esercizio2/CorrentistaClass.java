/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione_22_11_16.Esercizio2;

/**
 *
 * @author tss
 */
public class CorrentistaClass {
    
    //Dichiariamo le proprietà del mio oggetto
    private String cognome;

    private String nome;
    private double conto=0;
    private int anno_nascita;
    
        public CorrentistaClass (String cognomeU, String nomeU , int anno_nascitaU){ 
        this.cognome = cognomeU;
        this.nome = nomeU;
        this.anno_nascita = anno_nascitaU;
    
}
        
    public double getConto (){
        
        return conto;
    }
    //uso void altrimenti return conto sarebbe useless perchè avrei un return conto.
    //Se ho scritto utente1 per arrivare a fare queste cose devo fare utente1.addConto
    public void addConto (double versamento){
        
        conto = conto + versamento;
        
        
    }
    
    public String getInfo(){
        
        return nome + "  -  " + cognome;
    }
    
    
}