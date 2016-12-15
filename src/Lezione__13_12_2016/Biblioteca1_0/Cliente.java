/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione__13_12_2016.Biblioteca1_0;

/**
 *
 * @author tss
 */
public class Cliente extends Persona {

    private int codCliente;

    public Cliente(String nome, String cognome, int codCliente) {
        super(nome, cognome);
        this.codCliente = codCliente;
    }

}
