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
 * @author Udenar
 */
public class New_Book extends javax.swing.JInternalFrame {
    
    private Data data;
    private Main main;
    private String inf_icon;

    /**
     * Creates new form New_Book
     */
    public New_Book(Main main, Data data) {
        initComponents();
        this.main = main;
        this.data = data;
        inf_icon ="Icon_Book/cienciasNaturales.png";
        cb_subjects.setSelectedIndex(0);
       
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
        lb_codebook = new javax.swing.JLabel();
        tf_codebook = new javax.swing.JTextField();
        lb_namebook = new javax.swing.JLabel();
        tf_namebook = new javax.swing.JTextField();
        lb_stock = new javax.swing.JLabel();
        tf_stock = new javax.swing.JTextField();
        cb_subjects = new javax.swing.JComboBox<>();
        lb_state = new javax.swing.JLabel();
        cb_state = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        lb_icon = new javax.swing.JLabel();
        lb_subjects = new javax.swing.JLabel();
        chb_codebook = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        bt_add = new javax.swing.JButton();
        bt_cancel = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("New Book");
        setVisible(true);

        lb_codebook.setText("Code Book");

        tf_codebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_codebookActionPerformed(evt);
            }
        });

        lb_namebook.setText("Name Book");

        lb_stock.setText("Stock");

        cb_subjects.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ciencias Naturales", "Ingles", "Física", "Matemáticas", "Química", "Español", "Otros" }));
        cb_subjects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_subjectsActionPerformed(evt);
            }
        });

        lb_state.setText("State");

        cb_state.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_icon, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_icon, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
        );

        lb_subjects.setText("Subjects");

        chb_codebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_codebookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lb_subjects)
                            .addGap(18, 18, 18)
                            .addComponent(cb_subjects, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lb_state, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(cb_state, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lb_codebook)
                    .addComponent(lb_namebook)
                    .addComponent(lb_stock))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_namebook, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(tf_stock)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tf_codebook, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chb_codebook)))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_codebook)
                    .addComponent(tf_codebook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chb_codebook))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_namebook)
                    .addComponent(tf_namebook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_stock)
                    .addComponent(tf_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_subjects, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_subjects))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_state))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bt_add.setText("Add");
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(bt_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(bt_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_add)
                    .addComponent(bt_cancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_codebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_codebookActionPerformed
        // TODO add your handling code here:
        if (tf_codebook.getText().trim().equals("")) 
            JOptionPane.showMessageDialog(null, "It is empty, re-enter data");
        
        else if (data.search_Book(tf_codebook.getText()))
           JOptionPane.showMessageDialog(null, "The book is already registered");
        
        else{
            tf_namebook.setEnabled(true);
            tf_stock.setEnabled(true);
            bt_add.setEnabled(true);
            cb_subjects.setEnabled(true);
            cb_state.setEnabled(true);
            tf_codebook.setEnabled(false);
            chb_codebook.setSelected(true);
        }
    }//GEN-LAST:event_tf_codebookActionPerformed

    private void bt_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelActionPerformed
        dispose();
    }//GEN-LAST:event_bt_cancelActionPerformed

    private void bt_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addActionPerformed
        // TODO add your handling code here:
        String aux = tf_stock.getText();
        boolean numStok = true;
        
        if (tf_codebook.getText().trim().equals("") ||
            tf_namebook.getText().trim().equals("") ||
            tf_stock.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "!!Complete the data¡¡");
            
        }else if(data.search_Book(tf_codebook.getText()))
            JOptionPane.showMessageDialog(null, "The book is already registered");
            
        else{
            for (int i = 0; i < aux.length(); i++) {
                char ch = aux.charAt(i);
                if ( !Character.isDigit(ch) ) numStok = false;
            }
            
            if ( numStok ){
                data.addBook(tf_codebook.getText(), tf_namebook.getText(), 
                                 tf_stock.getText(), "0", inf_icon);
                JOptionPane.showMessageDialog(null, "Registered book");
                dispose();
            }else
               JOptionPane.showMessageDialog(null, "!!Invalid Stock¡¡"); 
        }
    }//GEN-LAST:event_bt_addActionPerformed

    private void chb_codebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_codebookActionPerformed
        // TODO add your handling code here:
        if (chb_codebook.isSelected()){
            tf_namebook.setEnabled(true);
            tf_stock.setEnabled(true);
            bt_add.setEnabled(true);
            cb_subjects.setEnabled(true);
            tf_codebook.setEnabled(false);
            
        }else{
            tf_codebook.setEnabled(true);
            tf_namebook.setEnabled(false);
            tf_stock.setEnabled(false);
            bt_add.setEnabled(false);
            cb_subjects.setEnabled(false);
        } 
    }//GEN-LAST:event_chb_codebookActionPerformed

    private void cb_subjectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_subjectsActionPerformed
        // TODO add your handling code here:
        if (cb_subjects.getSelectedIndex() == 0) {
            lb_icon.setIcon(new ImageIcon(Toolkit.getDefaultToolkit()
                            .getImage("Icon_Book/cienciasNaturales.png")
                            .getScaledInstance(120,80,Image.SCALE_SMOOTH)));
            inf_icon = "Icon_Book/cienciasNaturales.png";
            
        }else if (cb_subjects.getSelectedIndex() == 1) {
            lb_icon.setIcon(new ImageIcon(Toolkit.getDefaultToolkit()
                            .getImage("Icon_Book/english.png")
                            .getScaledInstance(120,80,Image.SCALE_SMOOTH)));
            inf_icon = "Icon_Book/english.png";
            
        }else if (cb_subjects.getSelectedIndex() == 2) {
            lb_icon.setIcon(new ImageIcon(Toolkit.getDefaultToolkit()
                            .getImage("Icon_Book/fisica.png")
                            .getScaledInstance(120,80,Image.SCALE_SMOOTH)));
            inf_icon = "Icon_Book/fisica.png";
            
        } else if (cb_subjects.getSelectedIndex() == 3) {
            lb_icon.setIcon(new ImageIcon(Toolkit.getDefaultToolkit()
                            .getImage("Icon_Book/math.png")
                            .getScaledInstance(120,80,Image.SCALE_SMOOTH)));
            inf_icon = "Icon_Book/math.png";
            
        }else if (cb_subjects.getSelectedIndex() == 4) {
            lb_icon.setIcon(new ImageIcon(Toolkit.getDefaultToolkit()
                            .getImage("Icon_Book/quimica.png")
                            .getScaledInstance(120,80,Image.SCALE_SMOOTH)));
            inf_icon = "Icon_Book/quimica.png";
            
        }else if(cb_subjects.getSelectedIndex() == 5){
            lb_icon.setIcon(new ImageIcon(Toolkit.getDefaultToolkit()
                            .getImage("Icon_Book/spanish.png")
                            .getScaledInstance(120,80,Image.SCALE_SMOOTH)));
            inf_icon = "Icon_Book/spanish.png";
        }else if(cb_subjects.getSelectedIndex() == 6){
            lb_icon.setIcon(new ImageIcon(Toolkit.getDefaultToolkit()
                            .getImage("Icon_Book/other.png")
                            .getScaledInstance(120, 80, Image.SCALE_SMOOTH)));
            inf_icon = "Icon_Book/other.png";
        }
    }//GEN-LAST:event_cb_subjectsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_add;
    private javax.swing.JButton bt_cancel;
    private javax.swing.JComboBox<String> cb_state;
    private javax.swing.JComboBox<String> cb_subjects;
    private javax.swing.JCheckBox chb_codebook;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lb_codebook;
    private javax.swing.JLabel lb_icon;
    private javax.swing.JLabel lb_namebook;
    private javax.swing.JLabel lb_state;
    private javax.swing.JLabel lb_stock;
    private javax.swing.JLabel lb_subjects;
    private javax.swing.JTextField tf_codebook;
    private javax.swing.JTextField tf_namebook;
    private javax.swing.JTextField tf_stock;
    // End of variables declaration//GEN-END:variables
}
