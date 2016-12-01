/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione_29_11_16Gioco_Carte.GiocoCarte_Mio;

/**
 *
 * @author tss
 */
public class Carta {
private int valore; //numero della carta ad esempio 7
private int seme; //seme della carta come intero esempio cuori 4 quadri 3 ecc...
private String nome; //composto in fase di creazione ad esempio 3 di picche

    public int getValore() {
        return valore;
    }

    public int getSeme() {
        return seme;
    }

    public String getNome() {
        return nome;
    }


//metodo costruttore che verrà richiamato dalle class o dal main
    public Carta(int valore, int seme, String nome) {
        this.valore = valore;
        this.seme = seme;
        this.nome = nome;
    }


}
