/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione__01_12_16.gestioneWalletprof;

/**
 *
 * @author tss
 */
public class Player1 {

    private String nome = "Mario";
    private Wallet1 mywallet = new Wallet1();

    public String getNome() {
        return nome;
    }

    public Wallet1 getMywallet() {
        return mywallet;
    }

    public Player1() {

    }

    public Player1(String nome) {
        this.nome = nome;

    } 

    public Player1(Moneta1 moneta) {
        this.mywallet.addMoneta(moneta);
    }

    public Player1(String nome, Moneta1 moneta) {
        this.mywallet.addMoneta(moneta);
        this.nome = nome;
    }

}
