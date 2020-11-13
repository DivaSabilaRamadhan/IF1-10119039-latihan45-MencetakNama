/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author 
 * Nama  : Diva Sabila Ramadhan 
 * Kelas : IF1
 * NIM   : 10119039
 * Deskripsi Program : program ini menampilkan mencetak nama dengan pendekatan objek
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    private static String nama;
    private static int jumlah;
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukkan Nama Anda            : ");
        nama = input.nextLine();
        
        System.out.print("Mau Mencetak Berapa banyak? : ");
        jumlah = input.nextInt();
        
        Cetakan cetakan = new Cetakan();
        cetakan.setNama(nama);
        cetakan.setJumlahCetak(jumlah);
        cetakan.cetak(jumlah, nama);
        
    }
    
}
