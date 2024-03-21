/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg123220087_if.f_kuis;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Lab Informatika
 */
public class LoginPage extends JFrame implements ActionListener {
    JLabel header1 = new JLabel("Selamat Datang");
    JLabel header2 = new JLabel("Silahkan masuk untuk melanjutkan");
    
    JLabel labelUsername = new JLabel("Username");
    JTextField inputUsername = new JTextField();
    JLabel labelPassword = new JLabel("Password");
    JTextField inputPassword = new JTextField();
    JButton tombolLogin = new JButton("Login");
    
    LoginPage()
    {
        setVisible(true);
        setSize(650,650);
        
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        add(header1);
        header1.setFont(header1.getFont().deriveFont(24.0f));
        header1.setBounds(30, 10, 500, 50);
        
        add(header2);
        header2.setFont(header2.getFont().deriveFont(16.0f));
        header2.setBounds(30, 40, 500, 50);
        
        add(labelUsername);
        labelUsername.setFont(labelUsername.getFont().deriveFont(16.0f));
        labelUsername.setBounds(30, 80, 100, 50);
        
        add(inputUsername);
        inputUsername.setBounds(30, 125, 570, 35);
        
        add(labelPassword);
        labelPassword.setFont(labelPassword.getFont().deriveFont(16.0f));
        labelPassword.setBounds(30, 170, 100, 50);
        
        add(inputPassword);
        inputPassword.setBounds(30, 215, 570, 35);
        
        add(tombolLogin);
        tombolLogin.setFont(tombolLogin.getFont().deriveFont(16.0f));
        tombolLogin.setBounds(250, 260, 100, 50);
        tombolLogin.setBackground(Color.white);
        tombolLogin.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try
        {
            String username = inputUsername.getText();
            String password = inputPassword.getText();
            if(username.isEmpty())
            { throw new Exception("Username Tidak Boleh Kosong");}
            if(password.isEmpty())
            { throw new Exception("Password Tidak Boleh Kosong");}
            
            new UtamaPage(username, password);
            this.dispose();
            
        }
        
        catch(Exception error)
        {
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
    }
    
    
    
    
}
