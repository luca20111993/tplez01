/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione_17_11_16;

/**
 *
 * @author tss
 */
public class Esercizio_17_11_16 {

    /**
     * Dichiarare 3 variabili 
     * fare un metodo per la somma
     * fare un metodo pèer la moltiplicazione
     * far vedere i risultati
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Enuncio le variabili
        int a = 8;
        int b = 10;
        int c = 14;
        int somma;
        int prodotto;
        String reportt;
        
        
        somma = getsomma(a,b,c);
        prodotto = getprodotto (a,b,c);
        
        reportt = "La somma dei miei numeri è pari a: " + somma + "\nIl valore della moltiplicazione di essi è pari a : " + prodotto;
        System.out.println(reportt);
    }
    
     static int getsomma (int a , int b  , int c){
        
            int somma = a + b + c;
             
         
            return somma;
    }
     static int getprodotto (int a , int b  , int c){
        
            int prodotto = a * b * c;
        
            return prodotto;

}
}
