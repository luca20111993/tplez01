/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione__22_12_16_Matrici;

import Lezione__22_12_16_Matrici.Matrix;
import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class MatrixSample {

    static int dim = 10;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Matrix m = new Matrix(dim);
        m.printMatrix();
        //tiro a caso tra 1 e 100
        //e metto il numerino in valori e poi ristampo
        String val=JOptionPane.showInputDialog("daami un numero");
        setta(m,Double.parseDouble(val));
        m.printMatrix();
        caso(m);
        caso(m);
        caso(m);
        caso(m);
        caso(m);
        caso(m);
        caso(m);
        caso(m);
        caso(m);
        caso(m);
        caso(m);
        caso(m);

        m.printMatrix();
        

    }

    static public void caso(Matrix m) {
        double numcaso = Math.random() * dim * dim;
        numcaso = Math.round(numcaso);
        try {
            //caso resto 0
            int r;
            if ((numcaso) % dim == 0) {
                r = (int) Math.floor(numcaso / dim) - 1;
            } else {
                r = (int) Math.floor(numcaso / dim);
            }
            // esempio 33 trovo la riga -> 3   0 1 2 3
            // esempio 33 trovo la colonna -> 2   31 32 33
            int c;
            if ((numcaso) % dim == 0) {
                c = dim - 1;
            } else {
                c = (int) ((numcaso) % dim) - 1;
            }
            //assegno nella matrice di stringhe il numerino
            m.valori[r][c] = String.valueOf(numcaso);
        } catch (Exception e) {
            System.out.print("\nxxxxxxxxxxxxxxx" + numcaso + "xxxxxxxxxxxxxxxx\n");
        }
    }

    static public void setta(Matrix m,double numcaso) {
        
        try {
            //caso resto 0
            int r;
            if ((numcaso) % dim == 0) {
                r = (int) Math.floor(numcaso / dim) - 1;
            } else {
                r = (int) Math.floor(numcaso / dim);
            }
            // esempio 33 trovo la riga -> 3   0 1 2 3
            // esempio 33 trovo la colonna -> 2   31 32 33
            int c;
            if ((numcaso) % dim == 0) {
                c = dim - 1;
            } else {
                c = (int) ((numcaso) % dim) - 1;
            }
            //assegno nella matrice di stringhe il numerino
            m.valori[r][c] = String.valueOf(numcaso);
        } catch (Exception e) {
            System.out.print("\nxxxxxxxxxxxxxxx" + numcaso + "xxxxxxxxxxxxxxxx\n");
        }
    }

}
