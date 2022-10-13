/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package library;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.StringTokenizer;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Modify_Student extends javax.swing.JInternalFrame {
    //------------------------ATTRIBUTES
    private Main main;
    private Data data;
    private String[] inf_student;
    private String inf_icon;
    //--------------------------------------------------------------------------
    public Modify_Student(Main main, Data data) {
        initComponents();
        this.main = main;
        this.data = data;
        inf_student = new String[4];
    }
    //--------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_code = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        bt_modify = new javax.swing.JButton();
        bt_cancel = new javax.swing.JButton();
        cb_icon = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        lb_icon = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Modify Student");
        setVisible(true);

        jLabel1.setText("Code");

        tf_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_codeActionPerformed(evt);
            }
        });

        jLabel2.setText("Name");

        tf_name.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_code)
                    .addComponent(tf_name, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bt_modify.setText("Modify");
        bt_modify.setEnabled(false);
        bt_modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_modifyActionPerformed(evt);
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
                .addComponent(bt_modify, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(bt_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_modify)
                    .addComponent(bt_cancel))
                .addContainerGap())
        );

        cb_icon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chico", "Chica", "Otro" }));
        cb_icon.setEnabled(false);
        cb_icon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_iconActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lb_icon, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lb_icon, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cb_icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //--------------------------------------------------------------------------
    private void bt_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_bt_cancelActionPerformed

    private void tf_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_codeActionPerformed
        if (tf_code.getText().trim().equals(""))
            JOptionPane.showMessageDialog(null, "It is empty, re-enter data");
        
        else if (data.search_Student(tf_code.getText())) {
            
            int i = 0;
            StringTokenizer inf = new StringTokenizer(data.getStudent(tf_code.getText()), "\n");
            
            while (inf.hasMoreElements()){
                inf_student[i]  =  inf.nextToken();
                i++;
            }
            
            inf_icon = inf_student[3];
            
            tf_code.setEnabled(false);
            tf_name.setEnabled(true);
            tf_name.setText(inf_student[1]);
            cb_icon.setEnabled(true);
            lb_icon.setIcon(new ImageIcon(Toolkit.getDefaultToolkit()
                            .getImage(inf_student[3])
                            .getScaledInstance(70,70,Image.SCALE_SMOOTH)));
            bt_modify.setEnabled(true);
            
        }else
            JOptionPane.showMessageDialog(null, "The student isn't registered");
    }//GEN-LAST:event_tf_codeActionPerformed

    private void bt_modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_modifyActionPerformed
        if (tf_code.getText().trim().equals("") || tf_name.getText().trim().equals(""))
            JOptionPane.showMessageDialog(null, "It is empty, re-enter data");
        
        else{
            data.removeStudent(tf_code.getText());
            data.addStudent(tf_code.getText(), tf_name.getText(), inf_student[2], inf_icon);
            
            JOptionPane.showMessageDialog(null, "("+tf_code.getText()+") is modify"); 
            
            tf_code.setEnabled(true);
            bt_modify.setEnabled(false);
            tf_name.setText("");
            tf_name.setEnabled(false);
            tf_code.setText("");
            cb_icon.setEnabled(false);
            lb_icon.setIcon(null);
        }
        
        
    }//GEN-LAST:event_bt_modifyActionPerformed

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
    private javax.swing.JButton bt_cancel;
    private javax.swing.JButton bt_modify;
    private javax.swing.JComboBox<String> cb_icon;
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
