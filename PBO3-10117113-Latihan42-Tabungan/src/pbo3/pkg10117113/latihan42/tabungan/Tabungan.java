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
public class Tabungan {
    private int saldo;
    
    Scanner scanner = new Scanner(System.in);
    public Tabungan (int saldo){
        this.saldo = saldo;
    }
    
    public int AmbilUang (int jumlah){
        System.out.print("Jumlah Uang Yang Akan Diambil : Rp. ");
        jumlah = scanner.nextInt();
        return saldo - jumlah;
    }
}
