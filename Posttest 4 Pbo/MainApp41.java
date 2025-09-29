/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mainapp41;

import java.util.Scanner;
import models.ServisWarga;

/**
 *
 * @author Zidan
 */
public class MainApp41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ServisWarga servis = new ServisWarga();

        int pilihan;
        do {
            System.out.println("\n=== Sistem Pendataan Warga RT 41 ===");
            System.out.println("1. Tambah Warga");
            System.out.println("2. Lihat Daftar Warga");
            System.out.println("3. Update Data Warga");
            System.out.println("4. Hapus Data Warga");
            System.out.println("5. Cari Warga (Nama)");
            System.out.println("6. Cari Warga (Umur)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            try {
                pilihan = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("❌ Input tidak valid, masukkan angka.");
                pilihan = -1;
            }

            switch (pilihan) {
                case 1 -> servis.tambahWarga();
                case 2 -> servis.tampilkanWarga();
                case 3 -> servis.updateWarga();
                case 4 -> servis.hapusWarga();
                case 5 -> {
                    System.out.print("Masukkan nama: ");
                    servis.cariWarga(input.nextLine());
                }
                case 6 -> {
                    System.out.print("Masukkan umur: ");
                    int umur = Integer.parseInt(input.nextLine());
                    servis.cariWarga(umur);
                }
                case 0 -> System.out.println("Keluar dari program...");
                default -> System.out.println("Menu tidak tersedia.");
            }
        } while (pilihan != 0);

        input.close();
    }
}