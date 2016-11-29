/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez01;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Tabellina_del_sette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 0 ; // cicli
        int num = 7;
        String totale= " " ;
        
        for ( i = 0 ; i < 10; i++ ){
            
            totale = totale + "\n" + num * (i+1) ; // totale = totale + ' numero deciso sopra ' * ( numero cicli + 1)
            //num = num + 7; al posto di * (cicli+1))
            
        }
        
        JOptionPane.showMessageDialog(null, totale);
    }
    
}
