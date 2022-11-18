/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LABP1KOMP
 */
public class warnet_hafizrecord {
    public static void main(String[] args) {
        warnet_fadel pelanggan = new warnet_fadel();
        
        pelanggan.setKode(1);
        pelanggan.setNamaPelanggan("fadel");
        pelanggan.setJenisPelanggan(1);
        pelanggan.setTglMasuk(2);
        pelanggan.setJamMasuk(5);
        pelanggan.setJamKeluar(8);
        pelanggan.setLama(2);
        
        pelanggan.Print();
        pelanggan.Pembayaran();
        
        
        
        
    }
}