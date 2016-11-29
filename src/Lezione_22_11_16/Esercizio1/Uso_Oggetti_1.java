/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione_22_11_16.Esercizio1;

/**
 *
 * @author tss
 */
public class Uso_Oggetti_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Creo alunno uno con le condizioni di esaminando
        String output;
        String nome="";
        String cognome="";
        //Alunno1
        Esaminando alunno1 = new Esaminando(nome , cognome);
        alunno1.cognome = "guerrubi";
        alunno1.nome = "luca";
        alunno1.impostavoto(85);

        

        output = alunno1.cometichiami() + " voto: " + alunno1.leggovoto();
        System.out.println(output);

        
        //Alunno2
        Esaminando alunno2 = new Esaminando(nome , cognome );
        alunno2.cognome = "brazorv";
        alunno2.nome = "ajeje";
        alunno2.impostavoto(60);
        
        output = alunno2.cometichiami() + " voto: " + alunno2.leggovoto();
        System.out.println(output);
        
        if (alunno1.seipiùbravodi(alunno2)){
            output = "bravo " + alunno1.cognome;
        }else{
            output = "bravo " + alunno2.cognome;
            
        }
        System.out.println(output);
        }
    
    }


