/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author asus
 */
public class Login extends JDialog {

    private JTextField tf_id;
    private JPasswordField pf_pass;
    private static Data data;
    private JButton bt_ok, bt_cancel;
    private static Main main;

    public Login(Main ma, Data d) {
        super(ma, true);
        setTitle("Login");
        this.setSize(350, 160);
        this.main = ma;
        this.data = d;
        setupWidgets();
        setupEvents();
        setVisible(true);
    }

    private void setupWidgets() {

        this.setLayout(null);

        JLabel user = new JLabel("User Id");
        user.setBounds(20, 20, 80, 20);

        JLabel pass = new JLabel("Password");
        pass.setBounds(20, 45, 80, 20);

        tf_id = new JTextField();
        tf_id.setBounds(120, 20, 180, 22);

        pf_pass = new JPasswordField();
        pf_pass.setBounds(120, 45, 180, 20);

        bt_ok = new JButton("Ok");
        bt_ok.setBounds(20, 85, 130, 20);

        bt_cancel = new JButton("Cancel");
        bt_cancel.setBounds(170, 85, 130, 20);

        this.add(user);
        this.add(pass);
        this.add(tf_id);
        this.add(pf_pass);
        this.add(bt_ok);
        this.add(bt_cancel);
    }

    private void setupEvents() {
        bt_cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                main.dispose();
            }
        });
        bt_ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (name(tf_id.getText(), pf_pass.getText()) == true) {
                    dispose();
                } else {
                    main.dispose();
                }
            }
        }); 
        addWindowListener( new WindowListener(){
            public void windowOpened(WindowEvent e) {}
            //---------------------------------------------------------
            public void windowClosing(WindowEvent e) {
                main.dispose();
            }
            //---------------------------------------------------------
            public void windowClosed(WindowEvent e) {}
            public void windowIconified(WindowEvent e) {}
            public void windowDeiconified(WindowEvent e) {}
            public void windowActivated(WindowEvent e) {}
            public void windowDeactivated(WindowEvent e) {}
            
        });
    }

    private static boolean name(String n, String pass) {
        if (n.equals("") || pass.equals("")) {
            JOptionPane.showMessageDialog(null, " is empty, re-enter data");
            return false;
        }
        if (data.search_user_pass(n, pass) == false) {
            JOptionPane.showMessageDialog(null, "The user isn't registered");
            return false;
        } else {
            return true;
        }
    }

}
