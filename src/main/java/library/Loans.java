/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package library;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Loans extends javax.swing.JInternalFrame {
    //------------------------ATTRIBUTES
    private Main main;
    private Data data;
    private ArrayList<String[]> inf;
    private ArrayList<String[]> student;
    //--------------------------------------------------------------------------
    public Loans(Main m, Data data) {
        initComponents();
        this.main = m;
        this.data = data;
        inf = new ArrayList<>();
        student = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cb_codeArticle = new javax.swing.JComboBox<>();
        tf_codeStudent = new javax.swing.JTextField();
        cb_student = new javax.swing.JComboBox<>();
        cb_article = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_codeArticle = new javax.swing.JTextField();
        cl_calendar = new com.toedter.calendar.JDateChooser();
        cb_stock = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        bt_cancel = new javax.swing.JButton();
        bt_loans = new javax.swing.JButton();

        setClosable(true);
        setTitle("Loans");
        setVisible(true);

        jLabel1.setText("Code of student");

        jLabel2.setText("Article");

        cb_codeArticle.setEnabled(false);
        cb_codeArticle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_codeArticleActionPerformed(evt);
            }
        });

        tf_codeStudent.setEditable(false);

        cb_student.setEnabled(false);
        cb_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_studentActionPerformed(evt);
            }
        });

        cb_article.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Book", "Magazine" }));
        cb_article.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_articleActionPerformed(evt);
            }
        });

        jLabel5.setText("Calendar");

        jLabel4.setText("Stock");

        jLabel6.setText("Code of article");

        tf_codeArticle.setEditable(false);

        cb_stock.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_article, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cl_calendar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(tf_codeArticle, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_codeStudent, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_student, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_codeArticle, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cb_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cb_article, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_codeArticle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_codeArticle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cb_student, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_codeStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(cl_calendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        bt_cancel.setText("Cancel");
        bt_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelActionPerformed(evt);
            }
        });

        bt_loans.setText("Loans");
        bt_loans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_loansActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(bt_loans, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(bt_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_loans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
    //--------------------------------------------------------------------------
    private void cb_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_studentActionPerformed
        tf_codeStudent.setText((String)cb_student.getSelectedItem());
    }//GEN-LAST:event_cb_studentActionPerformed
    //--------------------------------------------------------------------------
    private void bt_loansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_loansActionPerformed
        if (tf_codeArticle.getText().trim().equals("") || 
            tf_codeStudent.getText().trim().equals("") ||
            cl_calendar.toString().trim().equals(""))
            JOptionPane.showMessageDialog(null, "It is empty, re-enter data");
            
        else{
            if (cb_article.getSelectedIndex() == 1)
                inf = data.getMagazines();
            else
                inf = data.getBooks();
            
            int i = 0;
            int x = 0;
            int loan = Integer.parseInt((String)cb_stock.getSelectedItem());
            int stock = 0; 
            
            for (String[] fields : inf) {
                if (cb_article.getSelectedIndex() == 1){
                    if (i == cb_codeArticle.getSelectedIndex()) {
                        stock = Integer.parseInt(fields[3]) - loan;
                        
                        if (stock == 0)
                            fields[6].replaceAll("1", "0");
                        
                        for (String[] field : student) {
                            if (x == cb_student.getSelectedIndex()) {
                                field[2] = (loan + Integer.parseInt(field[2])) +"";
                                student.set(x, field);
                                break;
                            }
                            x++;
                        }
                        
                        loan += Integer.parseInt(fields[4]);
                        fields[3] = stock +"";
                        fields[4] = loan + "";

                        inf.set(i, fields);
                        
                        break;
                    }
                    
                }else{
                    if (i == cb_codeArticle.getSelectedIndex()) {
                        stock = Integer.parseInt(fields[2]) - loan;
                        
                        if (stock == 0)
                            fields[5].replaceAll("1", "0");
                        
                        for (String[] field : student) {
                            if (x == cb_student.getSelectedIndex()) {
                                field[2] = (loan + Integer.parseInt(field[2])) +"";
                                student.set(x, field);
                                break;
                            }
                            x++;
                        }

                        loan += Integer.parseInt(fields[3]);
                        fields[2] = stock +"";
                        fields[3] = loan + "";

                        inf.set(i, fields); 
                        
                        break;
                    }
                }
                
                
                i++;
            }
            JOptionPane.showMessageDialog(null, "Loan made");
            
            cb_codeArticle.removeAllItems();
            cb_codeArticle.setEnabled(false);
            cb_student.removeAllItems();
            cb_student.setEnabled(false);
            cb_stock.removeAllItems();
            cb_stock.setEnabled(false);
            tf_codeArticle.setText("");
            tf_codeStudent.setText("");
            
        }
    }//GEN-LAST:event_bt_loansActionPerformed
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
        cb_student.removeAllItems();
        
        for (String[] fields : inf)
            cb_codeArticle.addItem(fields[0]+" :"+fields[1]);
        
        student = data.getStudents();
            
        for (String[] fields : student)
            cb_student.addItem(fields[0]+" :"+fields[1]);
        
        tf_codeArticle.setText((String)cb_codeArticle.getSelectedItem());
        cb_codeArticle.setEnabled(true);
        cb_student.setEnabled(true);
    }//GEN-LAST:event_cb_articleActionPerformed

    private void cb_codeArticleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_codeArticleActionPerformed
        int i = 0;
        
        if (cb_article.getSelectedIndex() == 1)
            inf = data.getMagazines();
        else
            inf = data.getBooks();
        
        cb_stock.removeAllItems();
        for (String[] fields : inf){
            if (i == cb_codeArticle.getSelectedIndex()) {
                int stock = 1;
                
                if (cb_article.getSelectedIndex() == 1)
                    while (stock <= Integer.parseInt(fields[3])){
                    cb_stock.addItem(""+stock);
                    stock++;
                    }
                    
                else
                    while (stock <= Integer.parseInt(fields[2])){
                    cb_stock.addItem(""+stock);
                    stock++;
                    }
                
                
                break;
            }
            i++;
        }
        
        tf_codeArticle.setText((String)cb_codeArticle.getSelectedItem());
        cb_stock.setEnabled(true);
    }//GEN-LAST:event_cb_codeArticleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cancel;
    private javax.swing.JButton bt_loans;
    private javax.swing.JComboBox<String> cb_article;
    private javax.swing.JComboBox<String> cb_codeArticle;
    private javax.swing.JComboBox<String> cb_stock;
    private javax.swing.JComboBox<String> cb_student;
    private com.toedter.calendar.JDateChooser cl_calendar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField tf_codeArticle;
    private javax.swing.JTextField tf_codeStudent;
    // End of variables declaration//GEN-END:variables
}
