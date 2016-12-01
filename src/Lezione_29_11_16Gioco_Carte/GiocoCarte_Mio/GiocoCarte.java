/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione_29_11_16Gioco_Carte.GiocoCarte_Mio;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class GiocoCarte {

    /**
     * @param args the command line arguments
     */
    static Mazzo miomazzo;
    static int poscarta = 0;
    static Carta cartacorrente;
    static double punteggiocorrente;

    public static void main(String[] args) {
        // TODO code application logic here

        miomazzo = new Mazzo(40);
        miomazzo.mischia();

        String nomecarta = "elenco carte mazzo\n";
        for (int i = 0; i < 40; i++) {
            nomecarta += miomazzo.getCartaIndex(i).getNome() + "\n";

        }

        //inizio gioco player
        Player p1 = new Player("luca");

        boolean avanti = true;
        while (avanti == true) {

            //prendo la prima carta e inizio
            cartacorrente = miomazzo.getCartaIndex(poscarta++);
            //potevo scrivere così il passaggio rpecedente:
            //cartacorrente = miomazzo.getCartaIndex(poscarta);
            //poscarta++;

            p1.prendeCarta(cartacorrente);
            //Adesso chiedo quanti punti ha adesso
            punteggiocorrente = p1.dammiPunteggio();
            /// vediamo anche...
            System.out.println(punteggiocorrente + " - " + cartacorrente.getNome());

            if (punteggiocorrente >= 8) {
                avanti = false;
            } else {
                //gli chiedo se vuole continuare
                String input = JOptionPane.showInputDialog("vuoi continuare? \nvuoto continua \nqualsiasi carattere per interrompere");
                if (input.equalsIgnoreCase("") == false) {
                    avanti = false;
                }
            }

        }//fine gioco player

        //inizio gioco player
        Player p2 = new Player("luca");

        avanti = true;
        while (avanti == true) {

            //prendo la prima carta e inizio
            cartacorrente = miomazzo.getCartaIndex(poscarta++);
            //potevo scrivere così il passaggio rpecedente:
            //cartacorrente = miomazzo.getCartaIndex(poscarta);
            //poscarta++;

            p1.prendeCarta(cartacorrente);
            //Adesso chiedo quanti punti ha adesso
            punteggiocorrente = p1.dammiPunteggio();
            /// vediamo anche...
            System.out.println(punteggiocorrente + " - " + cartacorrente.getNome());

            if (punteggiocorrente >= 8) {
                avanti = false;
            } else {
                //gli chiedo se vuole continuare
                String input = JOptionPane.showInputDialog("vuoi continuare? \nvuoto continua \nqualsiasi carattere per interrompere");
                if (input.equalsIgnoreCase("") == false) {
                    avanti = false;
                }
            }

        }//fine gioco player
 
    }
}
