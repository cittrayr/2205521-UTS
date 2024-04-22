/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package jumlahdigit;

/**
 *
 * @author ctray
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan bilangan bulat
        System.out.print("Masukkan bilangan: ");
        long bilangan = scanner.nextLong();

        // Menghitung jumlah digit menggunakan metode sumDigits
        int jumlahDigit = JumlahDigit.sumDigits(bilangan);

        // Menampilkan jumlah digit
        System.out.println("Jumlah digit dalam bilangan " + bilangan + " adalah: " + jumlahDigit);

        // Meminta pengguna untuk memasukkan digit yang ingin dihapus
        System.out.print("Masukkan digit yang ingin diekstrak dan dihapus: ");
        int digitToRemove = scanner.nextInt();

        // Menampilkan cara ekstraksi digit
        System.out.println("Hasil ekstrak digit " + digitToRemove + " dari bilangan " + bilangan + " adalah: " + digitToRemove + " ");

        // Ekstrak dan hapus digit tertentu
        long hasilEkstrak = JumlahDigit.extractAndRemoveDigit(bilangan, digitToRemove);

        // Menampilkan hasil ekstraksi dan penghapusan digit
        System.out.println("Hasil hapus digit " + digitToRemove + " dari bilangan " + bilangan + " adalah: " + hasilEkstrak);

        scanner.close();
    }
}