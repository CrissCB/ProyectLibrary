package library;

import java.beans.PropertyVetoException;
import javax.swing.JInternalFrame;
import javax.swing.JMenuItem;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

public class Main extends javax.swing.JFrame {
    //--------------------------------------------------------------------------
    private Data data;
    //--------------------------------------------------------------------------
    public Main() {
        data = new Data();
        data.loadUsers();
        data.loadStudent();
        data.loadBook();
        data.loadMagazine();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dp_pane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newUser = new javax.swing.JMenuItem();
        searchUser = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        setUser = new javax.swing.JMenuItem();
        deleteUser = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        newStudent = new javax.swing.JMenuItem();
        searchStudent = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        setStudent = new javax.swing.JMenuItem();
        deleteStudent = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        newBook = new javax.swing.JMenuItem();
        searchBook = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        setBook = new javax.swing.JMenuItem();
        deleteBook = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        newMagazine = new javax.swing.JMenuItem();
        searchMagazine = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        setMagazine = new javax.swing.JMenuItem();
        deleteMagazine = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        loans = new javax.swing.JMenuItem();
        returns = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        searching = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        rp_User = new javax.swing.JMenuItem();
        rp_Student = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        rp_Book = new javax.swing.JMenuItem();
        rp_Magazine = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        rp_Loans = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library");
        setBackground(new java.awt.Color(205, 243, 240));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout dp_paneLayout = new javax.swing.GroupLayout(dp_pane);
        dp_pane.setLayout(dp_paneLayout);
        dp_paneLayout.setHorizontalGroup(
            dp_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
        );
        dp_paneLayout.setVerticalGroup(
            dp_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );

        jMenu1.setText("Users");

        newUser.setText("New User");
        newUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUserActionPerformed(evt);
            }
        });
        jMenu1.add(newUser);

        searchUser.setText("Search user");
        searchUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchUserActionPerformed(evt);
            }
        });
        jMenu1.add(searchUser);
        jMenu1.add(jSeparator2);

        setUser.setText("Modify user");
        setUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setUserActionPerformed(evt);
            }
        });
        jMenu1.add(setUser);

        deleteUser.setText("Delete User");
        deleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserActionPerformed(evt);
            }
        });
        jMenu1.add(deleteUser);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Students");

        newStudent.setText("New Student");
        newStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newStudentActionPerformed(evt);
            }
        });
        jMenu2.add(newStudent);

        searchStudent.setText("Search Student");
        searchStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchStudentActionPerformed(evt);
            }
        });
        jMenu2.add(searchStudent);
        jMenu2.add(jSeparator1);

        setStudent.setText("Modify Student");
        setStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setStudentActionPerformed(evt);
            }
        });
        jMenu2.add(setStudent);

        deleteStudent.setText("Delete Student");
        deleteStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStudentActionPerformed(evt);
            }
        });
        jMenu2.add(deleteStudent);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Books");

        newBook.setText("New Book");
        newBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBookActionPerformed(evt);
            }
        });
        jMenu3.add(newBook);

        searchBook.setText("Search Book");
        searchBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBookActionPerformed(evt);
            }
        });
        jMenu3.add(searchBook);
        jMenu3.add(jSeparator3);

        setBook.setText("Modify Book");
        setBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setBookActionPerformed(evt);
            }
        });
        jMenu3.add(setBook);

        deleteBook.setText("Delete Book");
        deleteBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBookActionPerformed(evt);
            }
        });
        jMenu3.add(deleteBook);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Magazines");

        newMagazine.setText("New Magazine");
        newMagazine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMagazineActionPerformed(evt);
            }
        });
        jMenu4.add(newMagazine);

        deleteMagazine.setText("Delete Magazine");
        deleteMagazine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMagazineActionPerformed(evt);
            }
        });
        jMenu4.add(deleteMagazine);
        jMenu4.add(jSeparator4);

        searchMagazine.setText("Search Magazine");
        searchMagazine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchMagazineActionPerformed(evt);
            }
        });
        jMenu4.add(searchMagazine);
        jMenu4.add(jSeparator4);

        setMagazine.setText("Modify Magazine");
        setMagazine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setMagazineActionPerformed(evt);
            }
        });
        jMenu4.add(setMagazine);

        deleteMagazine.setText("Delete Magazine");
        jMenu4.add(deleteMagazine);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Circulation");

        loans.setText("Loans");
        loans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loansActionPerformed(evt);
            }
        });
        jMenu5.add(loans);

        returns.setText("Returns");
        returns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnsActionPerformed(evt);
            }
        });
        jMenu5.add(returns);
        jMenu5.add(jSeparator5);

        searching.setText("Searching");
        searching.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchingActionPerformed(evt);
            }
        });
        jMenu5.add(searching);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Report");

        rp_User.setText("Users");
        jMenu6.add(rp_User);

        rp_Student.setText("Students");
        jMenu6.add(rp_Student);
        jMenu6.add(jSeparator6);

        rp_Book.setText("Books");
        jMenu6.add(rp_Book);

        rp_Magazine.setText("Magazines");
        jMenu6.add(rp_Magazine);
        jMenu6.add(jSeparator7);

        rp_Loans.setText("Loans");
        rp_Loans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rp_LoansActionPerformed(evt);
            }
        });
        jMenu6.add(rp_Loans);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dp_pane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dp_pane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //--------------------------------------------------------------------------
    private void rp_LoansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rp_LoansActionPerformed
    }//GEN-LAST:event_rp_LoansActionPerformed
    
    //User classes
    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    private void newUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUserActionPerformed
        JInternalFrame user = new New_User(this, data);
        waterfall(user, evt);
    }//GEN-LAST:event_newUserActionPerformed
    //--------------------------------------------------------------------------
    private void deleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserActionPerformed
        JInternalFrame delete = new Delete_User(this,data);
        waterfall(delete, evt);
    }//GEN-LAST:event_deleteUserActionPerformed
    //--------------------------------------------------------------------------
    private void searchUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchUserActionPerformed
        // TODO add your handling code here:
        JInternalFrame search = new Search_User(this);
        waterfall(search, evt);
    }//GEN-LAST:event_searchUserActionPerformed
    //--------------------------------------------------------------------------
    private void setUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setUserActionPerformed
        // TODO add your handling code here:
        JInternalFrame modify = new Modify_User(this,data);
        waterfall(modify, evt);
    }//GEN-LAST:event_setUserActionPerformed

    //Student classes
    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    private void newStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newStudentActionPerformed
        // TODO add your handling code here:
        JInternalFrame stundent = new New_Student(this, data);
        waterfall(stundent, evt);
    }//GEN-LAST:event_newStudentActionPerformed
    //--------------------------------------------------------------------------
    private void deleteStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStudentActionPerformed
        // TODO add your handling code here:
        JInternalFrame delete = new Delete_Student(this, data);
        waterfall(delete, evt);
    }//GEN-LAST:event_deleteStudentActionPerformed
    //--------------------------------------------------------------------------
    private void searchStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchStudentActionPerformed
        // TODO add your handling code here:
        JInternalFrame search = new Search_Student(this, data);
        waterfall(search, evt);
    }//GEN-LAST:event_searchStudentActionPerformed
    //--------------------------------------------------------------------------
    private void setStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setStudentActionPerformed
        // TODO add your handling code here:
        JInternalFrame modify = new Modify_Student(this, data);
        waterfall(modify, evt);
    }//GEN-LAST:event_setStudentActionPerformed
    
    //Book Classes
    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    private void newBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBookActionPerformed
        // TODO add your handling code here:
        JInternalFrame book = new New_Book(this, data);
        waterfall(book, evt);
    }//GEN-LAST:event_newBookActionPerformed
    //--------------------------------------------------------------------------
    private void searchBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBookActionPerformed
        // TODO add your handling code here:
        JInternalFrame search = new Search_Book(this, data);
        waterfall(search, evt);
    }//GEN-LAST:event_searchBookActionPerformed
    //--------------------------------------------------------------------------
    private void setBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setBookActionPerformed
        // TODO add your handling code here:
        JInternalFrame modify = new Modify_Book(this, data);
        waterfall(modify, evt);
    }//GEN-LAST:event_setBookActionPerformed
    //--------------------------------------------------------------------------
    private void deleteBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBookActionPerformed
        // TODO add your handling code here:
         JInternalFrame delete = new Delete_Book(this,data);
        waterfall(delete, evt);
    }//GEN-LAST:event_deleteBookActionPerformed
    private void newMagazineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMagazineActionPerformed
        // TODO add your handling code here:
        JInternalFrame magazine = new New_Magazine(this, data);
        waterfall(magazine, evt);
    }//GEN-LAST:event_newMagazineActionPerformed
    //--------------------------------------------------------------------------
    private void deleteMagazineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMagazineActionPerformed
        // TODO add your handling code here:
        JInternalFrame delete = new Delete_Magazine(this, data);
        waterfall(delete, evt);
    }//GEN-LAST:event_deleteMagazineActionPerformed
    //--------------------------------------------------------------------------
    private void searchMagazineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchMagazineActionPerformed
        // TODO add your handling code here:
        JInternalFrame search = new Search_Magazine(this, data);
        waterfall(search, evt);
    }//GEN-LAST:event_searchMagazineActionPerformed
    //--------------------------------------------------------------------------
    private void setMagazineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setMagazineActionPerformed
        // TODO add your handling code here:
        JInternalFrame modify = new Modify_Magazine(this, data);
        waterfall(modify, evt);
    }//GEN-LAST:event_setMagazineActionPerformed
    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    private void loansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loansActionPerformed
        // TODO add your handling code here:
        JInternalFrame loan = new Loans(this);
        waterfall(loan, evt);
    }//GEN-LAST:event_loansActionPerformed
    //--------------------------------------------------------------------------
    private void returnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnsActionPerformed
        // TODO add your handling code here:
        JInternalFrame returns = new Returns(this);
        waterfall(returns, evt);

    }//GEN-LAST:event_returnsActionPerformed
    //--------------------------------------------------------------------------
    private void searchingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchingActionPerformed
        // TODO add your handling code here:
        JInternalFrame search = new Searching(this);
        waterfall(search, evt);
    }//GEN-LAST:event_searchingActionPerformed
    //--------------------------------------------------------------------------
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        data.saveUsers();
    }//GEN-LAST:event_formWindowClosing
    //-------------------------------------------------------------------------- 
    //--------------------------------------------------------------------------
    //It serves so that the windows open in the form of a waterfall
    private void waterfall(JInternalFrame wf, java.awt.event.ActionEvent evt) {
        dp_pane.add(wf);
        wf.moveToFront();
        try {
            wf.setSelected(true);
        } catch (PropertyVetoException ex) {
        }
        int lastx = -20, lasty = -20;
        for (JInternalFrame c : dp_pane.getAllFrames()) {
            if (c == wf) {
                continue;
            }
            if (c.getX() > lastx) {
                lastx = c.getX();
            }
            if (c.getY() > lasty) {
                lasty = c.getY();
            }
        }
        wf.setLocation(lastx + 20, lasty + 20);
        //----------------------------------------------------------------------
        //Activation or deactivation of a button
        ((JMenuItem) evt.getSource()).setEnabled(false);
        wf.addInternalFrameListener(new InternalFrameAdapter() {
            public void internalFrameClosed(InternalFrameEvent ev) {
                ((JMenuItem) evt.getSource()).setEnabled(true);
            }
        });

    }
    //--------------------------------------------------------------------------
    public JMenuItem getLoans() {
        return loans;
    }
    //--------------------------------------------------------------------------
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem deleteBook;
    private javax.swing.JMenuItem deleteMagazine;
    private javax.swing.JMenuItem deleteStudent;
    private javax.swing.JMenuItem deleteUser;
    private javax.swing.JDesktopPane dp_pane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JMenuItem loans;
    private javax.swing.JMenuItem newBook;
    private javax.swing.JMenuItem newMagazine;
    private javax.swing.JMenuItem newStudent;
    private javax.swing.JMenuItem newUser;
    private javax.swing.JMenuItem returns;
    private javax.swing.JMenuItem rp_Book;
    private javax.swing.JMenuItem rp_Loans;
    private javax.swing.JMenuItem rp_Magazine;
    private javax.swing.JMenuItem rp_Student;
    private javax.swing.JMenuItem rp_User;
    private javax.swing.JMenuItem searchBook;
    private javax.swing.JMenuItem searchMagazine;
    private javax.swing.JMenuItem searchStudent;
    private javax.swing.JMenuItem searchUser;
    private javax.swing.JMenuItem searching;
    private javax.swing.JMenuItem setBook;
    private javax.swing.JMenuItem setMagazine;
    private javax.swing.JMenuItem setStudent;
    private javax.swing.JMenuItem setUser;
    // End of variables declaration//GEN-END:variables
}
