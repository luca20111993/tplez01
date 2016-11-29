/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez01;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Tplez01A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Dichiarare le variabili che mi servono per risolvere il problema
        // Costo del biglietto
        double costo_biglietto = 10;
        // Raggio del pallone
        double raggio = 8;
        // Costo riscaldamento metro cubo
        double costo_mcubo = 0.8;
        
        // Dichiaro uno String per le input
        String input;
        
        
        // Chiedo raggio pallone
        input = JOptionPane.showInputDialog("Scrivere il raggio del pallone");
        raggio = Double.parseDouble(input);
        System.out.println("raggio del pallone:" + raggio);
        // Chiedo costo riscaldamento metro cubo
        input = JOptionPane.showInputDialog("Indicare costo per metro cubo");
        costo_mcubo = Double.parseDouble(input);
        System.out.println("Costo per metro cubo:" + costo_mcubo);
        // Chiedo costo presunto biglietto
        input = JOptionPane.showInputDialog("indicare costo del biglietto");
        costo_biglietto = Double.parseDouble(input);
        System.out.println("costo del biglietto:" + costo_biglietto);
        
        
        
        // Dichiaro una costante
        final double PIGRECO = 3.1415; 
        // Operazione per calcolo area cerchio
        double area = PIGRECO * raggio * raggio;
        System.out.println("Valore dell'area:" + area);
        
        // calcolo volume semisfera
        double volume = PIGRECO * raggio * raggio * raggio *2/3;
        System.out.println("Valore del volume della semisfera:" + volume);
        
        // Calcolo numero persone massime dentro il tendone.
        double max_persone = Math.floor(area);
        System.out.println("numero persone massime:" + max_persone);
        
        
        // Calcolo costi del riscaldamento
        double costi = volume*costo_mcubo;
        System.out.println("Costo del riscaldamento:" + costi);
        // Calcolo ricavo
        double ricavi = max_persone*costo_biglietto;
        System.out.println("Ricavi:" + ricavi);
        // Calcolo gli utili
        double utili = ricavi - costi;
        System.out.println("utili:" + utili);
        
        // Preparo output
        
        String report ; 
        
        report = "report finale\n";
        report = report + "Raggio pallone" + raggio + "\n";
        report = report + "Costo per metro cubo" + costo_mcubo + "\n";
        report = report + "Costo del biglietto" + costo_biglietto + "\n";      
        report = report + "Valore dell'area" + area + "\n";
        report = report + "Volume della semisfera" + volume + "\n";
        report = report + "Numero max persone" + max_persone + "\n";
        report = report + "Costi del riscaldamento" + costi + "\n";
        report = report + "Ricavo totale" + ricavi + "\n";
        report = report + "Utile totale" + utili + "\n";
        report = report + "--------------\n" + new Date() + "\n";
        
        JOptionPane.showMessageDialog(null, report);
       
        
        
        
        
        
        

        
        
    }
    
}
