/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package library;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Udenar
 */
public class Searching extends javax.swing.JInternalFrame {
    //------------------------ATTRIBUTES
    private Main main;
    private Data data;
    private ArrayList<String[]> inf;
    //--------------------------------------------------------------------------
    public Searching(Main m, Data data ) {
        initComponents();
        this.main = m;
        this.data = data;
        inf = new ArrayList<>();
    }
    //--------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        cb_article = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bt_cancel = new javax.swing.JButton();
        cb_codeArticle = new javax.swing.JComboBox<>();
        cb_codeStudent = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_info = new javax.swing.JTable();

        setClosable(true);
        setTitle("Searching");
        setVisible(true);

        jLabel2.setText("Article");

        cb_article.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Book", "Magazine" }));
        cb_article.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_articleActionPerformed(evt);
            }
        });

        jLabel6.setText("Code of article");

        jLabel1.setText("Code of student");

        bt_cancel.setText("Cancel");
        bt_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelActionPerformed(evt);
            }
        });

        cb_codeArticle.setEnabled(false);
        cb_codeArticle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_codeArticleActionPerformed(evt);
            }
        });

        cb_codeStudent.setEnabled(false);
        cb_codeStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_codeStudentActionPerformed(evt);
            }
        });

        tb_info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Name", "Stock", "Loan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_info.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tb_info);
        tb_info.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tb_info.getColumnModel().getColumnCount() > 0) {
            tb_info.getColumnModel().getColumn(0).setResizable(false);
            tb_info.getColumnModel().getColumn(1).setResizable(false);
            tb_info.getColumnModel().getColumn(2).setResizable(false);
            tb_info.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb_article, 0, 151, Short.MAX_VALUE)
                            .addComponent(cb_codeArticle, 0, 151, Short.MAX_VALUE)
                            .addComponent(cb_codeStudent, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(bt_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2))
                    .addComponent(cb_article, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cb_codeArticle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cb_codeStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_cancel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //--------------------------------------------------------------------------
    private void bt_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_bt_cancelActionPerformed

    private void cb_articleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_articleActionPerformed
        if (cb_article.getSelectedIndex() == 1)
            inf = data.getMagazines();
        else
            inf = data.getBooks();
        
        cb_codeArticle.removeAllItems();
        
        for (String[] fields : inf)
            cb_codeArticle.addItem(fields[0]+" :"+fields[1]);
        
        cb_codeStudent.removeAllItems();
        
        inf = data.getStudents();
        for (String[] fields : inf)
            cb_codeStudent.addItem(fields[0]+" :"+fields[1]);
        
        String[] auxinf = new String[4];
        
        DefaultTableModel tm_inf = (DefaultTableModel) tb_info.getModel();
        
        while (tm_inf.getRowCount() > 0)
            tm_inf.removeRow(0);
        
        tb_info.setModel(tm_inf);
        
        if (cb_article.getSelectedIndex() == 1){ 
            inf = data.getMagazines();
            
            for (String[] fields : inf) {
                auxinf[0] = fields[0];
                auxinf[1] = fields[1];
                auxinf[2] = fields[3];
                auxinf[3] = fields[4];
                tm_inf.addRow(auxinf);
            }
            
        }else{
            inf = data.getBooks();
            
            for (String[] fields : inf) {
                auxinf[0] = fields[0];
                auxinf[1] = fields[1];
                auxinf[2] = fields[2];
                auxinf[3] = fields[3];
                tm_inf.addRow(auxinf);
            }
        }
        
        cb_codeArticle.setEnabled(true);
        cb_codeStudent.setEnabled(true);
    }//GEN-LAST:event_cb_articleActionPerformed

    private void cb_codeArticleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_codeArticleActionPerformed
        int i = 0;
        String[] auxinf = new String[4];
        
        tb_info.removeAll();
        DefaultTableModel tm_inf = (DefaultTableModel) tb_info.getModel();
        
        while (tm_inf.getRowCount() > 0)
           tm_inf.removeRow(0);
         
        tb_info.setModel(tm_inf);
        
        if (cb_article.getSelectedIndex() == 1) {
            inf = data.getMagazines();
            
            for (String[] fields : inf){
                
                if (i == cb_codeArticle.getSelectedIndex()) {
                    auxinf[0] = fields[0];
                    auxinf[1] = fields[1];
                    auxinf[2] = fields[3];
                    auxinf[3] = fields[4];
                    tm_inf.addRow(auxinf);
                    break;
                }
                i++;
            }
        }else{
            inf = data.getBooks();
            
            for (String[] fields : inf){
                
                if (i == cb_codeArticle.getSelectedIndex()) {
                    auxinf[0] = fields[0];
                    auxinf[1] = fields[1];
                    auxinf[2] = fields[2];
                    auxinf[3] = fields[3];
                    tm_inf.addRow(auxinf);
                    break;
                }
                i++;
            }
        }
    }//GEN-LAST:event_cb_codeArticleActionPerformed

    private void cb_codeStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_codeStudentActionPerformed
        String[] auxinf = new String[4];
        int i = 0;
        
        inf = data.getStudents();
        
        tb_info.removeAll();
        DefaultTableModel tm_inf = (DefaultTableModel) tb_info.getModel();
        
        while (tm_inf.getRowCount() > 0)
           tm_inf.removeRow(0);
         
        tb_info.setModel(tm_inf);
            
        for (String[] fields : inf){
                
            if (i == cb_codeStudent.getSelectedIndex()) {
                auxinf[0] = fields[0];
                auxinf[1] = fields[1];
                auxinf[2] = "";
                auxinf[3] = fields[2];
                tm_inf.addRow(auxinf);
                break;
            }
            i++;
        }
    }//GEN-LAST:event_cb_codeStudentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cancel;
    private javax.swing.JComboBox<String> cb_article;
    private javax.swing.JComboBox<String> cb_codeArticle;
    private javax.swing.JComboBox<String> cb_codeStudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_info;
    // End of variables declaration//GEN-END:variables
}
