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

/**
 *
 * @author asus
 */
public class Delete_Student extends javax.swing.JInternalFrame {

    //------------------------ATTRIBUTES
    private Main main;
    private Data data;
    //-------------------------------------------------------------------------- 
    public Delete_Student(Main main, Data data) {
        initComponents();
        this.main = main;
        this.data = data;
    }
    //-------------------------------------------------------------------------- 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_code = new javax.swing.JTextField();
        chb_code = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        bt_remove = new javax.swing.JButton();
        bt_cancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_info = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        lb_icon = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Delete Student");
        setVisible(true);

        jLabel1.setText("Code");

        tf_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_codeActionPerformed(evt);
            }
        });

        chb_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_codeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_code, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chb_code)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chb_code, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_code)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );

        bt_remove.setText("Remove");
        bt_remove.setEnabled(false);
        bt_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_removeActionPerformed(evt);
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
                .addGap(21, 21, 21)
                .addComponent(bt_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(bt_cancel)
                .addComponent(bt_remove))
        );

        ta_info.setEditable(false);
        ta_info.setColumns(20);
        ta_info.setRows(5);
        jScrollPane1.setViewportView(ta_info);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 86, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lb_icon, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 86, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lb_icon, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   //-------------------------------------------------------------------------- 
    private void bt_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_removeActionPerformed
        if (tf_code.getText().trim().equals("")) 
            JOptionPane.showMessageDialog(null, "It is empty, re-enter data");
        
        else if (data.search_Student(tf_code.getText())) {
            data.removeStudent(tf_code.getText());
            JOptionPane.showMessageDialog(null, "("+tf_code.getText()+") student removed successfully");
            tf_code.setEnabled(true);
            tf_code.setText("");
            ta_info.setText("");
            bt_remove.setEnabled(false);
            chb_code.setSelected(false);
            lb_icon.setIcon(null);
            
        }else
            JOptionPane.showMessageDialog(null, "The student isn't registered");
            
    }//GEN-LAST:event_bt_removeActionPerformed
    //-------------------------------------------------------------------------- 
    private void bt_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_bt_cancelActionPerformed

    private void tf_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_codeActionPerformed
        if (tf_code.getText().trim().equals(""))
            JOptionPane.showMessageDialog(null, "It is empty, re-enter data");
        
        else if (data.search_Student(tf_code.getText())){
            tf_code.setEnabled(false);
            chb_code.setSelected(true);
            bt_remove.setEnabled(true);
            
            int i = 0;
            String[] inf = new String[4];
            StringTokenizer aux = new StringTokenizer(data.getStudent(tf_code.getText()), "\n");

            while (aux.hasMoreElements() ){
                inf[i] = aux.nextToken();
                i++;
            }
            
            lb_icon.setIcon(new ImageIcon(Toolkit.getDefaultToolkit()
                            .getImage(inf[3])
                            .getScaledInstance(86,86,Image.SCALE_SMOOTH)));
            
            ta_info.setText("Code Student:  "+inf[0]+
                            "\nName Student:  "+inf[1]+
                            "\nLoan: "+inf[2]);
        }else
            JOptionPane.showMessageDialog(null, "The student isn't registered");
    }//GEN-LAST:event_tf_codeActionPerformed

    private void chb_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_codeActionPerformed
        if (chb_code.isSelected()) {
            tf_code.setEnabled(false);
            bt_remove.setEnabled(true);
        }else{
            tf_code.setEnabled(true);
            bt_remove.setEnabled(false);
        }
    }//GEN-LAST:event_chb_codeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cancel;
    private javax.swing.JButton bt_remove;
    private javax.swing.JCheckBox chb_code;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_icon;
    private javax.swing.JTextArea ta_info;
    private javax.swing.JTextField tf_code;
    // End of variables declaration//GEN-END:variables
}
