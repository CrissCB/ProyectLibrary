/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package library;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class New_Student extends javax.swing.JInternalFrame {
    //------------------------ATTRIBUTES
    private Main main;
    private Data data;
    private String inf_icon;
    //------------------------------------

    public New_Student(Main main, Data data) {
        initComponents();
        this.main = main;
        this.data = data;
        cb_icon.setSelectedIndex(0);
        inf_icon = "Icon_Student/chico.png";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_code = new javax.swing.JTextField();
        tf_name = new javax.swing.JTextField();
        chb_code = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        lb_icon = new javax.swing.JLabel();
        cb_icon = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        bt_add = new javax.swing.JButton();
        bt_cancel = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("New Student");
        setVisible(true);

        jLabel1.setText("Code");

        jLabel2.setText("Name");

        tf_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_codeActionPerformed(evt);
            }
        });

        tf_name.setEnabled(false);

        chb_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_codeActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(lb_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lb_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        cb_icon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chico", "Chica", "Otro" }));
        cb_icon.setEnabled(false);
        cb_icon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_iconActionPerformed(evt);
            }
        });

        bt_add.setText("Add");
        bt_add.setEnabled(false);
        bt_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addActionPerformed(evt);
            }
        });

        bt_cancel.setText("Cancel");
        bt_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(bt_add, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_add, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(bt_cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cb_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(tf_code, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(chb_code, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chb_code))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_codeActionPerformed
        if (tf_code.getText().trim().equals("")) 
            JOptionPane.showMessageDialog(null, "It is empty, re-enter data");
        
        else if (data.search_Student(tf_code.getText()))
            JOptionPane.showMessageDialog(null, "you are already registered");
        
        else {
            tf_name.setEnabled(true);
            tf_code.setEnabled(false);
            bt_add.setEnabled(true);
            chb_code.setSelected(true);
            cb_icon.setEnabled(true);
        }
    }//GEN-LAST:event_tf_codeActionPerformed
   
    private void bt_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelActionPerformed
        dispose();
    }//GEN-LAST:event_bt_cancelActionPerformed

    private void bt_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addActionPerformed
        if (tf_name.getText().trim().equals("") || tf_code.getText().trim().equals("")) 
            JOptionPane.showMessageDialog(null, "It is empty, re-enter data");
        
        else if(data.search_Student(tf_code.getText()))
            JOptionPane.showMessageDialog(null, "you are already registered");
        
        else{
            data.addStudent(tf_code.getText(), tf_name.getText(), "0", inf_icon);
            JOptionPane.showMessageDialog(null, "Registered Student");
            dispose();
        }
    }//GEN-LAST:event_bt_addActionPerformed

    private void chb_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_codeActionPerformed
        if (chb_code.isSelected()) {
            tf_name.setEnabled(true);
            tf_code.setEnabled(false);
            bt_add.setEnabled(true);
            cb_icon.setEnabled(true);
        }else{
            tf_name.setEnabled(false);
            tf_code.setEnabled(true);
            bt_add.setEnabled(false);
            cb_icon.setEnabled(false);
        }
    }//GEN-LAST:event_chb_codeActionPerformed

    private void cb_iconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_iconActionPerformed
        if (cb_icon.getSelectedIndex() == 0) {
            lb_icon.setIcon(new ImageIcon(Toolkit.getDefaultToolkit()
                            .getImage("Icon_Student/chico.png")
                            .getScaledInstance(70,70,Image.SCALE_SMOOTH)));
            inf_icon = "Icon_Student/chico.png";
            
        }else if (cb_icon.getSelectedIndex() == 1) {
            lb_icon.setIcon(new ImageIcon(Toolkit.getDefaultToolkit()
                            .getImage("Icon_Student/chica.png")
                            .getScaledInstance(70,70,Image.SCALE_SMOOTH)));
            inf_icon = "Icon_Student/chica.png";
            
        }else{
            lb_icon.setIcon(new ImageIcon(Toolkit.getDefaultToolkit()
                            .getImage("Icon_Student/robot.png")
                            .getScaledInstance(70,70,Image.SCALE_SMOOTH)));
            inf_icon = "Icon_Student/robot.png";
            
        }
    }//GEN-LAST:event_cb_iconActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_add;
    private javax.swing.JButton bt_cancel;
    private javax.swing.JComboBox<String> cb_icon;
    private javax.swing.JCheckBox chb_code;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lb_icon;
    private javax.swing.JTextField tf_code;
    private javax.swing.JTextField tf_name;
    // End of variables declaration//GEN-END:variables
}
