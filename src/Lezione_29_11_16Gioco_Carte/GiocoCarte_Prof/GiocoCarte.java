/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione_29_11_16Gioco_Carte.GiocoCarte_Prof;

import java.util.ArrayList;
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
        //mazzo pronto
//creo i due giocatori
        Player p1 = new Player("luca");
        Player p2 = new Player("marco");
        //faccio giocare il primo
        giocata(p1);
        //poi l'altro
        giocata(p2);
        
        double r1, r2;
        //leggo i due punteggi
        r1 = p1.dammiPunteggio();
        r2 = p2.dammiPunteggio();
        //li confronto e decreto il vincitore
        String msg="";
        if (r1 < r2) {
            msg = "vince " + p2.getNome();
        }
        if (r2 < r1) {
            msg = "vince " + p1.getNome();
        }
        if (r2 == r1) {
            msg = "pari tra " + p1.getNome() + " e " + p2.getNome();
        }
        System.out.println(msg + "\n" + nomecarta);
    }

    static public void giocata(Player p1) {

        //inizio gioco player
        boolean avanti = true;
        while (avanti == true) {

            // prendo la prima carta e inizio
            cartacorrente = miomazzo.getCartaIndex(poscarta++);
            //cartacorrente = miomazzo.getCartaIndex(poscarta);
            //poscarta++;
            //la passo a p1        
            p1.prendeCarta(cartacorrente);
            
           
            //adesso chiedo quanti punti ha
            punteggiocorrente = p1.dammiPunteggio();
            //vediamo anche...
            System.out.println(punteggiocorrente + " - " + cartacorrente.getNome());

            if (punteggiocorrente >= 8) {
                avanti = false;
                p1.seiFuori();
            } else {
                //gli chiedo se vuole continuare
                String input = JOptionPane.showInputDialog("vuoi continuare?\nvuoto continua\nqualsiasi carattere smette");
                if (input.equals("") == false) {
                    avanti = false;
                }
                
            }
            
            

        } //fine gioco player

    }

}
