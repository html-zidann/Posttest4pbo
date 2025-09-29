    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Zidan
 */
public class ServisWarga {
    private ArrayList<Warga> daftarWarga = new ArrayList<>();
    private Scanner input = new Scanner(System.in);
    private int nextId = 1;

    public void tambahWarga() {
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Umur: ");
        int umur = Integer.parseInt(input.nextLine());
        System.out.print("Masukkan Status Keluarga (Kepala Keluarga/Anggota): ");
        String status = input.nextLine();

        Warga warga = new Warga(nextId++, nama, umur, status);

        // Validasi pakai interface
        if (!warga.validasiUmur(umur)) {
            System.out.println("Umur tidak valid (1-119).");
            return;
        }

        daftarWarga.add(warga);
        System.out.println("Data warga berhasil ditambahkan.");
    }

    public void tampilkanWarga() {
        if (daftarWarga.isEmpty()) {
            System.out.println("Belum ada data warga.");
        } else {
            for (Warga w : daftarWarga) {
                w.displayInfo(); // Polymorphism (Overriding)
            }
        }
    }

    public void updateWarga() {
        tampilkanWarga();
        System.out.print("Masukkan ID Warga yang ingin diupdate: ");
        int id = Integer.parseInt(input.nextLine());

        for (Warga w : daftarWarga) {
            if (w.getId() == id) {
                System.out.print("Nama baru: ");
                w.setNama(input.nextLine());
                System.out.print("Umur baru: ");
                int umurBaru = Integer.parseInt(input.nextLine());

                if (!w.validasiUmur(umurBaru)) {
                    System.out.println("Umur tidak valid.");
                    return;
                }

                w.setUmur(umurBaru);
                System.out.print("Status baru: ");
                w.setStatusKeluarga(input.nextLine());
                System.out.println("Data warga berhasil diperbarui.");
                return;
            }
        }
        System.out.println("Warga dengan ID tersebut tidak ditemukan.");
    }

    public void hapusWarga() {
        tampilkanWarga();
        System.out.print("Masukkan ID Warga yang ingin dihapus: ");
        int id = Integer.parseInt(input.nextLine());

        boolean removed = daftarWarga.removeIf(w -> w.getId() == id);
        if (removed) {
            System.out.println("Data warga berhasil dihapus.");
        } else {
            System.out.println("Data tidak ditemukan.");
        }
    }

    // Overloading (cari berdasarkan nama)
    public void cariWarga(String keyword) {
        boolean found = false;
        for (Warga w : daftarWarga) {
            if (w.getNama().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(w);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tidak ada warga dengan nama tersebut.");
        }
    }

    // Overloading (cari berdasarkan umur)
    public void cariWarga(int umur) {
        boolean found = false;
        for (Warga w : daftarWarga) {
            if (w.getUmur() == umur) {
                System.out.println(w);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tidak ada warga dengan umur tersebut.");
        }
    }
}