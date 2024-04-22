/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts.soal.pkg2;

/**
 *
 * @author ctray
 */

import java.util.Scanner;

public class UTSSoal2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jumlahPositif = 0;
        int jumlahNegatif = 0;
        int total = 0;
        int bilangan;
        int jumlahBilangan = 0;

        System.out.println("Masukkan bilangan integer, program akan berhenti jika memasukkan nilai 0:");
        
        do {
            bilangan = scanner.nextInt();

            if (bilangan > 0) {
                jumlahPositif++;
                total += bilangan;
                jumlahBilangan++;
            } else if (bilangan < 0) {
                jumlahNegatif++;
                total += bilangan;
                jumlahBilangan++;
            }
        } while (bilangan != 0);

        double rataRata = (double) total / jumlahBilangan;

        System.out.println("Jumlah bilangan positif adalah " + jumlahPositif);
        System.out.println("Jumlah bilangan negatif adalah " + jumlahNegatif);
        System.out.println("Nilai total adalah " + total);
        System.out.println("Nilai rata-rata " + rataRata);
    }
}
