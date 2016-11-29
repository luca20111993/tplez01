/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione_15_11_16;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class ArrayBase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //String tipo di dato , nomi il nome dello scatolone
        //Le parentesi quadre è il sistema per entrare nel concetto di array
        //Ad array assegno un nuovo oggetto (new) una scatola di 10 elementi
        
        
        int max_nomi;
        
        String input=JOptionPane.showInputDialog("Quanti ne fai oggi? ");
        //Nome della variabile tra parentesi quadre ( parte da 0)
        max_nomi = Integer.parseInt(input);
        
        String nomi  [] = new String[max_nomi];
        int anni [] = new int [max_nomi];
        //Devo chiedere il nome e caricarlo nella corretta scatola
        //singolo elemento dell'array
        int mancano =nomi.length -1;
        //ciclo for per richiamare l'array del nome dell'array. il parametro che mi serve
       
        for (int i=0 ; i<nomi.length;i++ ){
        //Devo chiedere il nome e caricarlo nella corretta scatola
        //Singolo elemento dell'array
        mancano=nomi.length-i;
        input=JOptionPane.showInputDialog("come ti chiami? [-" + mancano + "]");
        nomi[i]=input;
        
        
        
        
        }
        
        String reportHTML = "";
        reportHTML = "<table>";
        for (int i = 0 ; i<nomi.length ; i++){
            //li leggo uno per uno e lis tampo
            reportHTML += "<tr><td>" + nomi[i] + "</td></tr>";
        }
        reportHTML += "</table>";
        System.out.println(reportHTML);
        
        //riga vuota
        System.out.println();
        
        //output java
        String report = "\n";
        for (int i=0 ; i<nomi.length;i++ ){
            //Li leggo uno per uno e li stampo
            report+= (i+1) + "#  " + nomi[i] + "\n";            
            
            
            
        }
           System.out.println(report); 
        
        
        
        }
           
        
    }
  
