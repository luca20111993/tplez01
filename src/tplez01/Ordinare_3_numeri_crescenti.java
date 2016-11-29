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
public class Ordinare_3_numeri_crescenti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String  a1= JOptionPane.showInputDialog("Inserire primo numero:");
        int a = Integer.parseInt(a1);
        System.out.println("Primo numero inserito: " + a);
        String  b1= JOptionPane.showInputDialog("Inserire secondo numero:");
        int b = Integer.parseInt(b1);
        System.out.println("Primo numero inserito: " + b);
        String  c1= JOptionPane.showInputDialog("Inserire primo numero:");
        int c = Integer.parseInt(c1);
        System.out.println("Primo numero inserito: " + c);
        String risultato = "-" ;
        
        if (a > b && b > c){
           risultato =  "I numeri ordinati sono in questo ordine: \nPrimo numero: " + c  + " secondo numero: " + b + " terzo numero: " + a;
        } else {
            if (a > c && c > b){
                risultato = "I numeri ordinati sono in questo ordine: \nPrimo numero: " + b  + " secondo numero: " + c + " terzo numero: " + a;
            } else{
                if ( b > a && a > c){
                    risultato = "I numeri ordinati sono in questo ordine: \nPrimo numero: " + c  + " secondo numero: " + a + " terzo numero: " + b;
                }else{ 
                    if (b > c && c > a){
                        risultato = "I numeri ordinati sono in questo ordine: \nPrimo numero: " + a  + " secondo numero: " + c + " terzo numero: " + b;
                    }else{
                        if (c > a && a > b){
                            risultato = "I numeri ordinati sono in questo ordine: \nPrimo numero: " + b  + " secondo numero: " + a + " terzo numero: " + c;
                        }else{
                            if (c > b && b > a){
                                risultato = "I numeri ordinati sono in questo ordine: \nPrimo numero: " + a  + " secondo numero: " + b + " terzo numero: " + c;
                            }else{
                                if ( a == b && b == c){
                                    risultato = "I numeri hanno tutti lo stesso valore. Non mi prendere in giro!";
                                }else{
                                    if ( a == b && b < c){
                                        risultato = " I numeri ordinati sono in questo ordine: \nAbbiamo due numeri con lo stesso valore di : " + a + " e un numero di valore : " + c ;
                                    }else{
                                        if (a == b && b > c){
                                            risultato = " I numeri ordinati sono in questo ordine: \nPrimo numero: " + c + " e abbiamo due numeri con lo stesso valore di : " + a;
                                        }else{
                                            if (a == c && c < b){
                                                risultato = " I numeri ordinati sono in questo ordine: \nAbbiamo due numeri con lo stesso valore di : " + a + " e un numero di valore : " + b ;
                                            }else{
                                                if (a == c && c > b){
                                                    risultato = " I numeri ordinati sono in questo ordine: \nPrimo numero: " + b + " e abbiamo due numeri con lo stesso valore di : " + a;
                                                }else{
                                                    if (c == b && b < a){
                                                        risultato = " I numeri ordinati sono in questo ordine: \nAbbiamo due numeri con lo stesso valore di : " + c + " e un numero di valore : " + a ;
                                                    }else{
                                                        if ( c == b && b > a) {
                                                            risultato = " I numeri ordinati sono in questo ordine: \nPrimo numero: " + a + " e abbiamo due numeri con lo stesso valore di : " + c;
                                                        }
                                                    }
                                                    
                                                    
                                                    }
                                            
           
                                            }
                                        }
                                    }
                                }
                            }
                            }
                          
                            }
                        }
                    }
                }
        System.out.println( risultato);
            }
        }
        
        
        
    
    
















