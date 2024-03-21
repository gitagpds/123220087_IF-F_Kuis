/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg123220087_if.f_kuis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Lab Informatika
 */
public class PembelianPageDewasa extends JFrame implements ActionListener {
    JLabel header1 = new JLabel("Halaman Pembelian");
    
    JLabel labelKategori = new JLabel("Kategori");
    JLabel jenisKategori = new JLabel("Majalah Anak");
    JLabel labelHarga = new JLabel("Harga");
    JLabel jenisHarga = new JLabel("Rp26.900 /pcs");
    JLabel labelJumlah = new JLabel("Jumlah");
    JTextField inputJumlah = new JTextField();
    
    JButton tombolKembali = new JButton("Kembali");
    JButton tombolBeli = new JButton("Beli");
    
    JLabel header2 = new JLabel("Total Pembelian");
    JLabel labelHargaSatuan = new JLabel("Harga Satuan");
    JLabel HargaSatuan = new JLabel("Rp.26.900");
    JLabel labelJumlah2 = new JLabel("Jumlah");
    JLabel Jumlah = new JLabel();
    JLabel labelTotalHarga = new JLabel("Total Harga");
    JLabel totalHarga = new JLabel();
    
    PembelianPageDewasa()
    {
        setVisible(true);
        setSize(500,500);
        
        setTitle("Halaman Pembelian");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        add(header1);
        header1.setFont(header1.getFont().deriveFont(24.0f));
        header1.setBounds(30, 10, 500, 50);
        
        add(labelKategori);
        labelKategori.setFont(labelKategori.getFont().deriveFont(16.0f));
        labelKategori.setBounds(30, 40, 500, 50);
        
        add(jenisKategori);
        jenisKategori.setFont(jenisKategori.getFont().deriveFont(16.0f));
        jenisKategori.setBounds(150, 40, 500, 50);
        
        add(labelHarga);
        labelHarga.setFont(labelHarga.getFont().deriveFont(16.0f));
        labelHarga.setBounds(30, 70, 500, 50);
        
        add(jenisHarga);
        jenisHarga.setFont(jenisHarga.getFont().deriveFont(16.0f));
        jenisHarga.setBounds(150, 70, 500, 50);
        
        add(labelJumlah);
        labelJumlah.setFont(labelJumlah.getFont().deriveFont(16.0f));
        labelJumlah.setBounds(30, 120, 500, 50);
        
        add(inputJumlah);
        inputJumlah.setFont(inputJumlah.getFont().deriveFont(16.0f));
        inputJumlah.setBounds(150, 120, 200, 40);
        
        add(tombolKembali);
        tombolKembali.setFont(tombolKembali.getFont().deriveFont(16.0f));
        tombolKembali.setBounds(30, 190, 100, 30);
        
        add(tombolBeli);
        tombolBeli.setFont(tombolBeli.getFont().deriveFont(16.0f));
        tombolBeli.setBounds(150, 190, 100, 30);
        
        add(header2);
        header2.setFont(header2.getFont().deriveFont(24.0f));
        header2.setBounds(30, 230, 500, 50);
        
        add(labelHargaSatuan);
        labelHargaSatuan.setFont(labelHargaSatuan.getFont().deriveFont(16.0f));
        labelHargaSatuan.setBounds(30, 270, 500, 50);
        
        add(HargaSatuan);
        HargaSatuan.setFont(HargaSatuan.getFont().deriveFont(16.0f));
        HargaSatuan.setBounds(150, 270, 500, 50);
        
        add(labelJumlah2);
        labelJumlah2.setFont(labelJumlah2.getFont().deriveFont(16.0f));
        labelJumlah2.setBounds(30, 310, 500, 50);
        
        add(Jumlah);
        Jumlah.setFont(Jumlah.getFont().deriveFont(16.0f));
        Jumlah.setBounds(150, 310, 500, 50);
        
        add(labelTotalHarga);
        labelTotalHarga.setFont(labelTotalHarga.getFont().deriveFont(16.0f));
        labelTotalHarga.setBounds(30, 350, 500, 50);
        
        add(totalHarga);
        totalHarga.setFont(totalHarga.getFont().deriveFont(16.0f));
        totalHarga.setBounds(150, 350, 500, 50);
        
        tombolKembali.addActionListener(this);
        tombolBeli.addActionListener(this);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        /*
        if(e.getSource() == tombolBeli)
        {
            String jumlahh = Jumlah.getText();
            double Jumlah;
            
            double TotalHargaM_Anak = Jumlah * (12700);
            totalHarga.setText(TotalHargaM_Anak);
                
            
        }
        
        else if(e.getSource() == tombolKembali)
        {
            
        }*/
        
    }
    
}
