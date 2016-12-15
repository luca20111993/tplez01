/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione__13_12_2016.Biblioteca_Prof;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class lancioBiblio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Biblioteca bib = new Biblioteca("Biblio Ivrea", "via ottinetti 2, Ivrea");
        
        Cliente c1;
        c1 = new Cliente("Verdi", "Joseph", 1);
        bib.getElencoClienti().add(c1);
        c1 = new Cliente("Rossini", "Jacques", 2);
        bib.getElencoClienti().add(c1);
        
        Dipendente d1;
        d1= new Dipendente("rossi", "mario", "bibliotecario");
        bib.getElencoDipendenti().add(d1);
        d1 = new Dipendente("gentiloni", "matteo", "premier");
        bib.getElencoDipendenti().add(d1);
        d1.addNewLibro("il signore degli anelli", "tolkien", bib);
        Libro l2 = new Libro("lo hobbit", "tolkien", 2);
        bib.getElencoLibri().add(l2);
        
        //JOptionPane.showMessageDialog(null, bib.getSchedario());

        Prestito p = new Prestito(1 , 1 , "Verdi - signore degli anelli " + new Date().toString());
        bib.getElencoPrestiti().add(p);
        Prestito p1 = new Prestito(2 , 2 , "Rossini - Hobbit " + new Date().toString());
        bib.getElencoPrestiti().add(p1);
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DemoWinBiblio(bib).setVisible(true);
            }
        });
        
    }

}


