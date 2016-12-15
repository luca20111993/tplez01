/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione__13_12_2016.Biblioteca1_0;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class LancioBiblio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Creo la mia biblioteca
        Biblioteca bib = new Biblioteca("Biblio Ivrea", "via Ottinetti 2 , Ivrea");

        //Creo i miei dipendenti
        Dipendente d1 = new Dipendente("Mario", "Rossi", "Bibliotecario");
        Dipendente d2 = new Dipendente("John", "Wayne", "Responsabile Biblioteca");
        //Li aggiungo nel mio array
        bib.getElencoDipendenti().add(d1);
        bib.getElencoDipendenti().add(d2);

        //Creo i miei libri
        Libro l1 = new Libro("Il signore degli anelli", "tolkyen", 1);
        Libro l2 = new Libro("Lo hobbit", "tolkyen", 2);
        Libro l3 = new Libro("La metamorfosi", "kafka", 3);
        
        //Li aggiungo nel mio array
        bib.getElencoLibri().add(l1);
        bib.getElencoLibri().add(l2);
        bib.getElencoLibri().add(l3);
        
        JOptionPane.showMessageDialog(null, "Lista dei libri della biblioteca : \n" + bib.GetSchedario());;
        
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewWinBiblio(bib).setVisible(true);
            }
        });

    }

}




















