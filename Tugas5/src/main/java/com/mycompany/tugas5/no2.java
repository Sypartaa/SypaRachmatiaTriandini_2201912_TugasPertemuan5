/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas5;

import java.util.Scanner;

public class no2 {

    public static String cek(int angka) {
        if (angka < 2) {
            return "Komposit";
        }
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                return "Komposit";
            }
        }
        return "Prima";
    }

    public static void Print(int batasAwal, int batasAkhir) {
        System.out.println("Bilangan prima " + batasAwal + " sd " + batasAkhir + " adalah:");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (cek(i).equals("Prima")) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nBilangan komposit " + batasAwal + " sd " + batasAkhir + " adalah:");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (cek(i).equals("Komposit")) {
                System.out.print(i + " ");
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan batas awal: ");
        int batasAwal = scanner.nextInt();

        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = scanner.nextInt();

        if (batasAwal >= 1 && batasAkhir <= 100) {
            Print(batasAwal, batasAkhir);
        } else {
            System.out.println("Masukkan tidak valid. Harap masukkan batas awal >= 1 dan batas akhir <= 100.");
        }

        scanner.close();
    }
}