/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * Nama  : Diva Sabila Ramadhan
 * Kelas : IF1
 * NIM   : 10119039
 * Deskripsi Program : berisi class Cetak
 */
public class Cetakan {
    private int jumlahCetak;
    private String nama;    
    public int getJumlahCetak(){
        return jumlahCetak;
    }
    
    public void setJumlahCetak(int jumlahCetak){
        this.jumlahCetak = jumlahCetak;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void cetak(int jumlahCetak, String nama){
            System.out.println("Hasil Cetakan : ");
            for (int i = 1; i < jumlahCetak; i++){
                System.out.println(i + ".".concat(nama));
            }
    }
}
