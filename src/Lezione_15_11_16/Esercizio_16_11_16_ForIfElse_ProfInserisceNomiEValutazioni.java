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
public class Esercizio_16_11_16_ForIfElse_ProfInserisceNomiEValutazioni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Enuncio le variabili
        String report = "";
        String input;
        String report_finale;
        int min = 11;
        int max = 1;
        String report2 = "";
        int somma = 0;
        String report3 = "";
        int media;
        int conta;
        String nome_min ="";
        String nome_max="";
        String report_pb="";
        

        //Chiedo all'utente di inserire il numero di test da correggere e trasformo in intero
        input = JOptionPane.showInputDialog("Quanti test da segnare hai oggi?");
        int numero_test = Integer.parseInt(input);

        int n_test[] = new int[numero_test];
        String nome_ragazzo[] = new String[numero_test];
        int valutazione[] = new int[numero_test];

        //Avvio un ciclo for
        for (int i = 0; i < n_test.length; i++) {

            //Chiedo di inserire il nome del ragazzo
            input = JOptionPane.showInputDialog("Inserire il nome del ragazzo: ");
            nome_ragazzo[i] = input;
            //Chiedo di inserire il voto del ragazzo
            input = JOptionPane.showInputDialog("Inserire la valutazione del ragazzo:  ");
            valutazione[i] = Integer.parseInt(input);

            

            //Voglio trovare il massimo e il minimo delle valutazioni. Parto dal presupposto che i voti siano da 2 a 10 , come in una normale scuola.
            //Quindi enuncio il min e il max. Min = 11 così qualsiasi numero sarà minore di esso. Max = 1 così qualsiasi numero sarà maggiore di esso.
            if (i == 0) {
                min = valutazione[i];
                max = valutazione[i];
            } else {
                if (valutazione[i] < min) {
                    min = valutazione[i];
                    nome_min = nome_ragazzo[i];
                }

                if (valutazione[i] > max) {
                    max = valutazione[i];
                    nome_max = nome_ragazzo[i];
                }
                
                
                
                
                if (valutazione [i] > 5){
                    report_pb = "L'alunno è promosso";
                            }else{
                    if (valutazione [i]<6){
                        report_pb = "l'alunno è bocciato";
                    }
                }
                //Scrivo report per mandare i risultati dopo
            report += " # " + (i + 1) + " Nome del ragazzo :  " + nome_ragazzo[i] + "  Valutazione : " + valutazione[i] +  " -- " + report_pb + "\n";
                
                // Scrivo il mio report da mandare poi al report finale

                report2 = "il valore minimo è:  " + min + " " + nome_min + "\n" + "il valore massimo è : " + max + " " + nome_max + "\n";

                //Voglio fare la mia media delle valutazioni. Quindi faccio la somma delle medie totali e le divido per il numero di alunni.
                conta = i;
                somma = somma + valutazione[i];
                media = somma / conta;
                report3 = "La media dei voti inseriti è pari a : " + media + "\n";
            }
        }

        System.out.println(report + report2 + report3);

    }

}
