/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas5;

import java.util.Scanner;

public class no3 {

    public static void cetakPola(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan N (antara 1 - 1000): ");
        int N = scanner.nextInt();

        if (N >= 1 && N <= 1000) {
            cetakPola(N);
        } else {
            System.out.println("Harap masukkan N antara 1 - 1000.");
        }

        scanner.close();
    }


}
