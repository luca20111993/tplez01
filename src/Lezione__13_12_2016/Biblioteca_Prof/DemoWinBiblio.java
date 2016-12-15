/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione__13_12_2016.Biblioteca_Prof;

import java.util.Date;
import javax.swing.DefaultListModel;

/**
 *
 * @author tss
 */
public class DemoWinBiblio extends javax.swing.JFrame {

    /**
     * Creates new form DemoWinBiblio
     */
    Biblioteca bib;
    Dipendente dip;
    DefaultListModel modelLibri = new DefaultListModel();
    DefaultListModel modelClienti = new DefaultListModel();
    DefaultListModel modelPrestiti = new DefaultListModel();

    public DemoWinBiblio(Biblioteca bib) {
        this.bib = bib;
        initComponents();

        String nomedip;
        dip = bib.getElencoDipendenti().get(0);
        nomedip = dip.getCognome();
        jlTitoloWin.setText("Form gestione Biblioteca" + new Date().toString() + "\nDipendente: " + nomedip);
        refreshLibri();
        refreshClienti();
        refreshPrestiti();
    }

    private void refreshLibri() {
        modelLibri = new DefaultListModel();
        for (Libro l : bib.getElencoLibri()) {
            modelLibri.addElement(l.getInfo());
        }
        jLibri.setModel(modelLibri);

    }

    private void refreshClienti() {
        modelClienti = new DefaultListModel();
        for (Cliente c : bib.getElencoClienti()) {
            modelClienti.addElement(c.getCognome() + " " + c.getNome());
        }
        jClienti.setModel(modelClienti);

    }

    
    private void refreshPrestiti() {
        modelPrestiti = new DefaultListModel();
        for (Prestito p : bib.getElencoPrestiti()) {
            modelPrestiti.addElement(p.getNote());
        }
        jPrestiti.setModel(modelPrestiti);

    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlTitoloWin = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtTitolo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtAutore = new javax.swing.JTextField();
        jbaddlibro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMsgLibri = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLibri = new javax.swing.JList<>();
        jbDeLibro = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jClienti = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPrestiti = new javax.swing.JList<>();
        jbAddNewPrestito = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bibliteca Demo");
        setPreferredSize(new java.awt.Dimension(800, 600));

        jlTitoloWin.setBackground(new java.awt.Color(255, 0, 204));
        jlTitoloWin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitoloWin.setText("Form gestione Biblioteca");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setText("Titolo");

        jtTitolo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtTitoloActionPerformed(evt);
            }
        });

        jLabel2.setText("Autore");

        jtAutore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtAutoreActionPerformed(evt);
            }
        });

        jbaddlibro.setText("add new Libro");
        jbaddlibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbaddlibroActionPerformed(evt);
            }
        });

        jtMsgLibri.setColumns(20);
        jtMsgLibri.setLineWrap(true);
        jtMsgLibri.setRows(5);
        jScrollPane1.setViewportView(jtMsgLibri);

        jLibri.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jLibri.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jLibriValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jLibri);

        jbDeLibro.setText("Del Libro Selez");
        jbDeLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeLibroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtTitolo)
                            .addComponent(jtAutore)
                            .addComponent(jbaddlibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbDeLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtTitolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtAutore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbaddlibro)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbDeLibro)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jClienti.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jClienti);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 255, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPrestiti.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jPrestiti);

        jbAddNewPrestito.setText("Add New Prestito");
        jbAddNewPrestito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddNewPrestitoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbAddNewPrestito)
                .addGap(0, 220, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbAddNewPrestito)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlTitoloWin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jlTitoloWin)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtTitoloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtTitoloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTitoloActionPerformed

    private void jtAutoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtAutoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtAutoreActionPerformed

    private void jbaddlibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbaddlibroActionPerformed
        // TODO add your handling code here:
        //jtMsgLibri.setText(new Date().toString());
        String ris;
        ris = dip.addNewLibro(jtTitolo.getText(), jtAutore.getText(), bib);
        jtMsgLibri.setText(ris);
        refreshLibri();
        jtAutore.setText("");
        jtTitolo.setText("");


    }//GEN-LAST:event_jbaddlibroActionPerformed

    private void jbDeLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeLibroActionPerformed
        // TODO add your handling code here:
        int index = jLibri.getSelectedIndex();
        String ris = dip.removeLibroByIndex(index, bib);
        jtMsgLibri.setText(ris);
        refreshLibri();

    }//GEN-LAST:event_jbDeLibroActionPerformed

    private void jLibriValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jLibriValueChanged
        // TODO add your handling code here:ù
        String ris = "";
        ris = jLibri.getSelectedValue();
        jtMsgLibri.setText(ris);


    }//GEN-LAST:event_jLibriValueChanged

    private void jbAddNewPrestitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddNewPrestitoActionPerformed
        // TODO add your handling code here:
        int indexcliente = jClienti.getSelectedIndex();
        int indexLibro = jLibri.getSelectedIndex();
        
        indexcliente = bib.getElencoClienti().get(indexcliente).getCodCliente();
        indexLibro = bib.getElencoLibri().get(indexLibro).getCodLibro();
        dip.addNewPrestito(indexcliente, indexLibro,jClienti.getSelectedValue() + " - " + jLibri.getSelectedValue() , bib);
        refreshPrestiti();
        
        
        
    }//GEN-LAST:event_jbAddNewPrestitoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> jClienti;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jLibri;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JList<String> jPrestiti;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jbAddNewPrestito;
    private javax.swing.JButton jbDeLibro;
    private javax.swing.JButton jbaddlibro;
    private javax.swing.JLabel jlTitoloWin;
    private javax.swing.JTextField jtAutore;
    private javax.swing.JTextArea jtMsgLibri;
    private javax.swing.JTextField jtTitolo;
    // End of variables declaration//GEN-END:variables
}
