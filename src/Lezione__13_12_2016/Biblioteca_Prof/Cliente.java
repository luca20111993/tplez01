/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione__13_12_2016.Biblioteca_Prof;

/**
 *
 * @author tss
 */
public class Cliente extends Persona {

    private int codCliente;

    public Cliente(String cognome, String nome, int codCliente) {
        super(cognome, nome);
        this.codCliente = codCliente;
    }

    public int getCodCliente() {
        return codCliente;
    }

}