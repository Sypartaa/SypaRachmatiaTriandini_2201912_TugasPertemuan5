/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas5;

import java.util.Scanner;

public class no1 {
    
    static void Ribuan(int angka1, int angka2, int angka3) {
        int totalAngka = angka1 * 100 + angka2 * 10 + angka3;

        // Memeriksa apakah angka tersebut adalah ribuan
        if (totalAngka >= 1000 && totalAngka <= 9999) {
            System.out.println("Masukan adalah ribuan.");
        } else {
            System.out.println("Masukan bukan ribuan.");
        }
    }
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan angka pertama: ");
        int angka1 = scanner.nextInt();
        
        System.out.println("Masukkan angka kedua: ");
        int angka2 = scanner.nextInt();
        
        System.out.println("Masukkan angka ketiga: ");
        int angka3 = scanner.nextInt();
        
        // Memanggil fungsi untuk memeriksa apakah angka-angka tersebut adalah ribuan
        Ribuan(angka1, angka2, angka3);

        // Menutup objek Scanner
        scanner.close();
    }
}