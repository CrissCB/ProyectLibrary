/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package library;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Crist
 */
public class Modify_Magazine extends javax.swing.JInternalFrame {

    //------------------------ATTRIBUTES
    private Main main;
    private Data data;
    private String auxnum;
    //--------------------------------------------------------------------------
    public Modify_Magazine(Main main, Data data) {
        initComponents();
        this.main = main;
        this.data = data;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_numMagazine = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_volume = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_date = new javax.swing.JTextField();
        cb_icon = new javax.swing.JComboBox<>();
        pn_icon = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tf_stock = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_loan = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        bt_cancel = new javax.swing.JButton();
        bt_modify = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Modify Magazine");
        setVisible(true);

        jLabel1.setText("Num. Magazine");

        tf_numMagazine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_numMagazineActionPerformed(evt);
            }
        });

        jLabel2.setText("Volume");

        tf_volume.setEnabled(false);

        jLabel3.setText("Article Date");

        tf_date.setEnabled(false);

        cb_icon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_icon.setEnabled(false);

        pn_icon.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout pn_iconLayout = new javax.swing.GroupLayout(pn_icon);
        pn_icon.setLayout(pn_iconLayout);
        pn_iconLayout.setHorizontalGroup(
            pn_iconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        pn_iconLayout.setVerticalGroup(
            pn_iconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jLabel4.setText("Stock");

        tf_stock.setEnabled(false);

        jLabel5.setText("Loan");

        tf_loan.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(cb_icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tf_loan, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                        .addGap(13, 13, 13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_stock, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pn_icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_numMagazine, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                .addComponent(tf_volume)
                                .addComponent(tf_date)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_numMagazine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_volume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_loan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pn_icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bt_cancel.setText("Cancel");
        bt_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelActionPerformed(evt);
            }
        });

        bt_modify.setText("Modify");
        bt_modify.setEnabled(false);
        bt_modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_modifyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_modify, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(bt_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_cancel)
                    .addComponent(bt_modify))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_bt_cancelActionPerformed

    private void tf_numMagazineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_numMagazineActionPerformed
        if (tf_numMagazine.getText().trim().equals(""))
            JOptionPane.showMessageDialog(null, "It is empty, re-enter data");
        
        else if (data.search_Magazine(tf_numMagazine.getText())){
            auxnum = tf_numMagazine.getText();
            int i = 0;
            String[] aux = new String[5];
            StringTokenizer inf = new StringTokenizer(data.getMagazine(tf_numMagazine.getText()), "\n");
            
            while (inf.hasMoreElements()){
                aux[i] = inf.nextToken();
                i++;
            }
            
            bt_modify.setEnabled(true);
            tf_volume.setEnabled(true);
            tf_volume.setText(aux[1]);
            tf_date.setEnabled(true);
            tf_date.setText(aux[2]);
            tf_stock.setEnabled(true);
            tf_stock.setText(aux[3]);
            tf_loan.setEnabled(true);
            tf_loan.setText(aux[4]);
        
        }else
            JOptionPane.showMessageDialog(null, "The magazine isn't registered");
    }//GEN-LAST:event_tf_numMagazineActionPerformed

    private void bt_modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_modifyActionPerformed
        String aux  = tf_stock.getText();
        String aux2 = tf_loan.getText();
        boolean numStok = true;
        
        for (int i = 0; i < aux.length(); i++) {
                char ch  = aux.charAt(i);
                if ( !(Character.isDigit(ch)) ) numStok = false;
            }
        for (int i = 0; i < aux2.length(); i++) {
                char ch2  = aux2.charAt(i);
                if ( !(Character.isDigit(ch2)) ) numStok = false;
        }
        
        if (tf_numMagazine.getText().trim().equals("")|| tf_volume.getText().trim().equals("") 
                || tf_date.getText().trim().equals("") || tf_stock.getText().trim().equals("") 
                || tf_loan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "It is empty, re-enter data"); 
            
        }else{
            
            if (numStok){
                if (auxnum.equals(tf_numMagazine.getText()) || data.search_Magazine(tf_numMagazine.getText())) {
                    data.removeMagazine(tf_numMagazine.getText());
                    data.addMagazine(tf_numMagazine.getText(), tf_volume.getText(), 
                                tf_date.getText(), tf_stock.getText()); 
                }else{
                    data.removeMagazine(auxnum);
                    data.addMagazine(tf_numMagazine.getText(), tf_volume.getText(), 
                                tf_date.getText(), tf_stock.getText());  
                }
                
                
                JOptionPane.showMessageDialog(null, "("+tf_numMagazine.getText()+") is modify"); 
                tf_date.setEnabled(false);
                tf_date.setText("");
                tf_volume.setEnabled(false);
                tf_volume.setText("");
                tf_stock.setEnabled(false);
                tf_stock.setText("");
                tf_loan.setEnabled(false);
                tf_loan.setText("");
                tf_numMagazine.setText("");
                
            }else
                JOptionPane.showMessageDialog(null, "Invalid Stock or Invalid Loan"); 
        }       
    }//GEN-LAST:event_bt_modifyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cancel;
    private javax.swing.JButton bt_modify;
    private javax.swing.JComboBox<String> cb_icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel pn_icon;
    private javax.swing.JTextField tf_date;
    private javax.swing.JTextField tf_loan;
    private javax.swing.JTextField tf_numMagazine;
    private javax.swing.JTextField tf_stock;
    private javax.swing.JTextField tf_volume;
    // End of variables declaration//GEN-END:variables
}
