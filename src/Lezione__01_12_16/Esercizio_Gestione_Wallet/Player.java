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
public class Player {

    private String nome = "Mario";
    private Wallet mywallet = new Wallet();

    public String getNome() {
        return nome;
    }

    public Wallet getMywallet() {
        return mywallet;
    }

    public Player() {

    }

    public Player(String nome) {
        this.nome = nome;

    }

    public Player(Moneta moneta) {
        this.mywallet.addMoneta(moneta);
    }

    public Player(String nome, Moneta moneta) {
        this.mywallet.addMoneta(moneta);
        this.nome = nome;
    }

}
