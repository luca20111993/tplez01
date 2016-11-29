/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione_29_11_16Gioco_Carte;

/**
 *
 * @author tss
 */
public class Mazzo {

    //Array che conterrà le carte
    private Carta mazzo[];
    int numcarte; //numero carte mazzo

    //costruttore del mazzo
    public Mazzo(int numcarte) {
        this.numcarte = numcarte;
        //Creo e dimensiono il mazzo

        mazzo = new Carta[numcarte];

        //creare tot carte e inserirle nel mazzo
        String semicarta[] = {"StringVuota", "picche", "fiori", "quadri", "cuori"};

        int valore = 1;
        int seme = 1;
        for (int i = 1; i <= numcarte; i++) {

            //Attenzione al numero che dopo 10 va riportato a 1
            //e si cambia il seme
            String nomecarta = valore + " di " + semicarta[seme];
            Carta carta = new Carta(valore, seme, nomecarta);
            mazzo[i - 1] = carta;
            //incremento il valore
            valore ++;
            //Valore  e seme sono due variabili che servono a ficcare il valore giusto

            //se elemento valore corrente è divisibile per 10 resett i valori e i semi
            //se sono sul 10 ad esempio rimetto valore a 1 e incremento di uno il seme
            if (i % (numcarte / 4) == 0) {
                seme++;
                valore = 1;
            }

        }
    }

    public Carta[] getMazzo() {
        return mazzo;
    }

    public int getNumcarte() {
        return numcarte;
    }

    public Carta getCartaIndex(int i) {
        //inizializzo l'oggetto così non rompe. si inizializza con null
        Carta c = null;
        c = mazzo[i];

        return c;
    }

    public void mischia() {
        //soluziona alla computer
        //con ciclo for di 1000 giri
        for (int i = 0; i < 1000; i++) {

            //pesco due numeri a caso a 39
            //e scambio le due carte corrispondenti
            //scambio carte
            //caso1 = 22;
            //caso2 = 34        
            //la 22 la scambio con la 34
            int caso1 = (int) Math.floor(Math.random() * numcarte);
            int caso2 = (int) Math.floor(Math.random() * numcarte);

            //prendo la 22 in mano e sposto la 34 al posto della 22
            Carta cartainmano;
            //prendo in mano la 22 (variabile t)
            cartainmano = mazzo[caso1];
            //metto la 34 nel posto della 22
            mazzo[caso1] = mazzo[caso2];
            //la carta nella mia mano (variabile t) la metto nel posto della carta 34
            mazzo[caso2] = cartainmano;
            //Carte spostate
        }
    }
}
