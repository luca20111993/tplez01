/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione__22_12_16_Matrici;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Matrix {

    int size;
    int[][] matrice;
    String[][] valori;
    // m[righe][colonne] r righe e c colonne   
//                          0   1   2   3 
/*                      0   a   b   c   d
                        1   e   f   g   h
                        2
     */
    public Matrix(int size) {
        this.size = size;
        this.matrice = new int[size][size];
        this.valori = new String[size][size];
        int nextnum = 1;
        for (int r = 0; r < size; r++) { //scorro le righe
            for (int c = 0; c < size; c++) { //scorro le colonne
                matrice[r][c] = nextnum++;
                valori[r][c]="-";
            }

        }
    }

    public String printMatrix() {
        String ris = "";
        for (int r = 0; r < size; r++) { //scorro le righe
            for (int c = 0; c < size; c++) { //scorro le colonne
                ris = ris + matrice[r][c] + "\t";
            }
            ris = ris + "\n";
        }
        ris = ris + "\n";
        for (int r = 0; r < size; r++) { //scorro le righe
            for (int c = 0; c < size; c++) { //scorro le colonne
                ris = ris + valori[r][c] + "\t";
            }
            ris = ris + "\n";
        }
        System.out.println( ris);
        return ris;

    }

}
