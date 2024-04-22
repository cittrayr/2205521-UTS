/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jumlahdigit;

/**
 *
 * @author ctray
 */
public class JumlahDigit {
    public static int sumDigits(long n) {
        // Hitung jumlah digit
        int sum = 0;
        while (n != 0) {
            sum += n % 10; 
            n /= 10; 
        }
        return sum;
    }

    public static long extractAndRemoveDigit(long number, int digitToRemove) {
        // Ekstrak digit dan hapus digit tertentu
        long remainingNumber = 0;
        long multiplier = 1;

        while (number != 0) {
            long digit = number % 10;
            if (digit != digitToRemove) {
                remainingNumber = digit * multiplier + remainingNumber;
                multiplier *= 10;
            }
            number /= 10;
        }

        return remainingNumber;
    }
}