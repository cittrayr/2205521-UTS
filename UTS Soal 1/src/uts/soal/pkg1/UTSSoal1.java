/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts.soal.pkg1;

/**
 *
 * @author ctray
 */

import java.util.Random;

public class UTSSoal1 {

    public static void main(String[] args) {
        // Membuat objek dari kelas Random
        Random rand = new Random();

        // Menghasilkan bilangan bulat acak antara 1 dan 12
        int nomorBulan = rand.nextInt(12) + 1;

        // Menampilkan nama bulan sesuai dengan nomor bulan yang dihasilkan
        String namaBulan;
        namaBulan = switch (nomorBulan) {
            case 1 -> "Januari";
            case 2 -> "Februari";
            case 3 -> "Maret";
            case 4 -> "April";
            case 5 -> "Mei";
            case 6 -> "Juni";
            case 7 -> "Juli";
            case 8 -> "Agustus";
            case 9 -> "September";
            case 10 -> "Oktober";
            case 11 -> "November";
            case 12 -> "Desember";
            default -> "Bulan tidak valid";
        };

        // Menampilkan hasil
        System.out.println("Nomor Bulan: " + nomorBulan);
        System.out.println("Nama Bulan: " + namaBulan);
    }
}