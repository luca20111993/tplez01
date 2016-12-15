/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione__13_12_2016.Biblioteca_Prof;

import java.util.Date;

/**
 *
 * @author tss
 */
public class Prestito {

    int codCliente;
    int codLibro;
    String dataPrestito = new Date().toString();
    String dataRestituzione = "";
    boolean reso = false;
    String note;
    
    public Prestito(int codCliente, int codLibro , String note) {
        this.codCliente = codCliente;
        this.codLibro = codLibro;
        this.note = note;
    }

    public void setDataRestituzione(String dataRestituzione) {
        this.dataRestituzione = dataRestituzione;
    }

    public void setReso(boolean reso) {
        this.reso = reso;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public int getCodLibro() {
        return codLibro;
    }

    public String getDataPrestito() {
        return dataPrestito;
    }

    public String getDataRestituzione() {
        return dataRestituzione;
    }

    public boolean isReso() {
        return reso;
    }

    public String getNote() {
        return note;
    }
    
     

    
}
