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
public class UtamaPage extends JFrame implements ActionListener {
    JLabel header1 = new JLabel();
    JLabel header2 = new JLabel("Silahkan pilih menu di bawah untuk membeli majalah");
    
    JButton tombolAnak = new JButton("Majalah Anak");
    JButton tombolRemaja = new JButton("Majalah Remaja");
    JButton tombolDewasa = new JButton("Majalah Dewasa");
    
    UtamaPage(String username, String password)
    {
        setVisible(true);
        setSize(600,400);
        
        setTitle("Halaman Utama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        add(header1);
        header1.setText("Selamat Datang, " + username);
        header1.setFont(header1.getFont().deriveFont(24.0f));
        header1.setBounds(30, 10, 500, 50);
        
        add(header2);
        header2.setFont(header2.getFont().deriveFont(16.0f));
        header2.setBounds(30, 40, 500, 50);
        
        add(tombolAnak);
        tombolAnak.setFont(tombolAnak.getFont().deriveFont(16.0f));
        tombolAnak.setBounds(30, 90, 400, 50);
        tombolAnak.setBackground(Color.white);
        tombolAnak.addActionListener(this);
        
        add(tombolRemaja);
        tombolRemaja.setFont(tombolRemaja.getFont().deriveFont(16.0f));
        tombolRemaja.setBounds(30, 160, 400, 50);
        tombolRemaja.setBackground(Color.white);
        tombolRemaja.addActionListener(this);
        
        add(tombolDewasa);
        tombolDewasa.setFont(tombolDewasa.getFont().deriveFont(16.0f));
        tombolDewasa.setBounds(30, 230, 400, 50);
        tombolDewasa.setBackground(Color.white);
        tombolDewasa.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == tombolAnak)
        {
            new PembelianPageAnak();
            this.dispose();
        }
        
        else if(e.getSource() == tombolRemaja)
        {
            new PembelianPageRemaja();
            this.dispose();
        }
        
        if(e.getSource() == tombolDewasa)
        {
            new PembelianPageDewasa();
            this.dispose();
        }
        
    }
    
    
    
    
    
    
}
