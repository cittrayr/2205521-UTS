/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package limassegiempat;

/**
 *
 * @author ctray
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek limas segiempat 1
        LimasSegiEmpat limas1 = new LimasSegiEmpat(1.0, 1.0, 1.0);
        // Menampilkan hasil perhitungan untuk limas 1
        System.out.println("Limas segi empat dengan luas alas : " + limas1.getLuasAlas() +
                           ", luas selubung limas : " + limas1.getLuasSelubungLimas() +
                           " dan tinggi : " + limas1.getTinggi() +
                           ". Luasnya : " + limas1.hitungLuas() +
                           ", sedangkan volumenya : " + String.format("%.2f", limas1.hitungVolume()));

        // Membuat objek limas segiempat 2
        LimasSegiEmpat limas2 = new LimasSegiEmpat(30.0, 40.0, 50.0);
        // Menampilkan hasil perhitungan untuk limas 2
        System.out.println("Limas segi empat dengan luas alas : " + limas2.getLuasAlas() +
                           ", luas selubung limas : " + limas2.getLuasSelubungLimas() +
                           " dan tinggi : " + limas2.getTinggi() +
                           ". Luasnya : " + limas2.hitungLuas() +
                           ", sedangkan volumenya : " + String.format("%.2f", limas2.hitungVolume()));

        // Membuat objek limas segiempat 3
        LimasSegiEmpat limas3 = new LimasSegiEmpat(25.0, 35.0, 45.0);
        // Menampilkan hasil perhitungan untuk limas 3
        System.out.println("Limas segi empat dengan luas alas : " + limas3.getLuasAlas() +
                           ", luas selubung limas : " + limas3.getLuasSelubungLimas() +
                           " dan tinggi : " + limas3.getTinggi() +
                           ". Luasnya : " + limas3.hitungLuas() +
                           ", sedangkan volumenya : " + String.format("%.2f", limas3.hitungVolume()));
    }
}