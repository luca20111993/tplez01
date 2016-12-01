/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione__01_12_16.Esercizio_Gestione_Wallet;

/**
 *
 * @author tss
 */
public class GestioneWallet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*Creo  due persone player
        
        creeo dei soldi e li do alle persone
        esempio do 1 2 5 10 e 20 a tutti e due
        quando creo la persona mi raccomando creategli un wallet 
        se non sa dove mettere i soldi che gli darete
        dopo create un metodo per far si che il player di sappia dire quantii soldi ha
        e poi anche a domanda quantiPezziDa(5) risponda ad esempio 1 nel nostro caso
        
        es p1.addMoneta(5);
        nel wqallet avra'0 ijn fondo una moneta da 5
        attenzione gli devi dare la moneta per cui se sei la zecca 
        o il main crea la moneta e dalla
        
         */
        Moneta moneta = new Moneta(50);
        Player p1 = new Player();
        Player p2 = new Player("luciana", moneta);
        moneta = null;
        moneta = new Moneta(20);
        p1.getMywallet().addMoneta(moneta);
        moneta = null;
        moneta= new Moneta(50);
        p2.getMywallet().addMoneta(moneta);
        s(p2.getMywallet().QuantiSoldi());
        p2.getMywallet().removeMoneta(340);
        s(p2.getMywallet().QuantiSoldi());
        
    }
    
    static public void s(Object x){
    System.out.println(x);
    }

}
    

