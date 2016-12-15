/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione__06_12_16_Asta.esercizioprof;

import javax.swing.JOptionPane;

/**Nella mia asta avrò bisogno di partecipanti
 * Quindi creo classe Persona
 *
 * @author tss
 */
public class Persona {
    //La mia classe persona avrà i seguenti parametri
    String cognome;
    int soldi;

    //Creo il metodo che permette alla persona di fare una puntata
    public Offerta nuovaOfferta() {
        //Richiedo il nome dell'oggetto su cui si vuole puntare
        String nomeOggetto = JOptionPane.showInputDialog("nome oggetto ATTENZIONE precisione!!!");
        
        //Richiedo la cifra che vuole puntare e la trasformo in intero
        String tmp = JOptionPane.showInputDialog("offerta per oggetto in euro!!!");
        int valore = Integer.parseInt(tmp);
        
        //Creo l'oggetto nuova offerta che avrà 3 parametri
        Offerta nuovaofferta = new Offerta(valore, cognome, nomeOggetto);
        
        //Ritorno l'offerta al main
        return nuovaofferta;
    }

}
