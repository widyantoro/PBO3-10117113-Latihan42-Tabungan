/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117113.latihan42.tabungan;

import java.util.Scanner;

/*
 * Nama     : Eka Widyantoro
 * NIM      : 10117113
 * Kelas    : IF-3/PBO-3
 * Desc     : Program untuk melihat saldo terkini setelah melakukan penarikan
 *            
 */
public class PBO310117113Latihan42Tabungan {

   public static int saldo;
   public static int jumlah;
    
    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
       System.out.println("====PROGRAM PENARIKAN UANG ====");
       System.out.print("Masukan Saldo Awal : Rp. ");
       saldo = scanner.nextInt();
       
       Tabungan tabungan = new Tabungan(saldo);
      
       System.out.println("Saldo Anda Sekarang : " 
                           + tabungan.AmbilUang(jumlah));
       
        
       
    }
    
}
