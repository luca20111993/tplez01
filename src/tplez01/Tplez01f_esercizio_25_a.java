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
public class Tplez01f_esercizio_25_a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a1 , b1 , c1;
        int max = 0 , min = 0; 
        
        a1 = JOptionPane.showInputDialog("Inserire primo numero");
        b1 = JOptionPane.showInputDialog("Inserire secondo numero");        
        c1 = JOptionPane.showInputDialog("Inserire terzo numero");

        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(b1);
        int c = Integer.parseInt(c1);
        
        
        
        // trovare max e min
        
        if (a > b) {
            max = a;}
        if (max > c){
            max = a;}
        
        if (b > a) {
            max = b;}
        if (max > c){
            max = b;}
        
        if (c > a){
            max = c;}
        if (max > a){
            max = c;}
        
        
        System.out.println(a + "-"+ b + "-" + c);
        System.out.println("\n" + max);
        
        
        
                   
        }
    }
    

