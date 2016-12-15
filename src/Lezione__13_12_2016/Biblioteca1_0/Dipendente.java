/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione__13_12_2016.Biblioteca1_0;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class Dipendente extends Persona {

    private String ruolo;

    public Dipendente(String nome, String cognome, String ruolo) {
        super(nome, cognome);
        this.ruolo = ruolo;
    }

    public void addNuovoLibro(String titolo, String autore, Biblioteca biblioteca) {
        //METODO MOLTO PARTICOLARE PER PRENDERSI IL CODICE DEL LIBRO
        //Allora. con la aprte [biblioteca.getElencoLibri().size()-1] guardiamo la grandezza dell'array (es 10) e allora prendo questa granedzza e faccio -1 in modo da trovare
        //La posizione dell'ultimo libro e il suo relativo codice. (Se abbiamo 9 libri non esiste un codice per il 10 libro nonostante kl'array sia da 10)
        //Dopo richiamiamo il nostro array di elenco libri e gli chiediamo con il .get di prendere l'oggetto desiderato in questo caso l'ultimo e di prendere il codice del libro.
        //Infine per creare un numero nuovo aggiungiamo +1
        ArrayList<Libro> l = biblioteca.getElencoLibri();
        int newcode = 1;
        if (l.size() == 0) {
            newcode = 1;
        } else {
            newcode = l.get(l.size() - 1).getCodLibro() + 1;
        }

        //Creo nuovo libro
        Libro l1 = new Libro(titolo, autore, newcode);
        biblioteca.getElencoLibri().add(l1);
    }

}
