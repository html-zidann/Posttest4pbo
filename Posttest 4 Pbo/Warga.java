/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Zidan
 */

public class Warga extends Person implements ValidasiData {
    private String statusKeluarga;

    public Warga(int id, String nama, int umur, String statusKeluarga) {
        super(id, nama, umur);
        this.statusKeluarga = statusKeluarga;
    }

    public String getStatusKeluarga() {
        return statusKeluarga;
    }

    public void setStatusKeluarga(String statusKeluarga) {
        this.statusKeluarga = statusKeluarga;
    }

    //Overriding (dari abstract class Person)
    @Override
    public void displayInfo() {
        System.out.println("ID: " + id + ", Nama: " + nama + ", Umur: " + umur + ", Status: " + statusKeluarga);
    }

    //Implementasi method dari interface ValidasiData
    @Override
    public boolean validasiUmur(int umur) {
        return umur > 0 && umur < 120;
    }

    //Overriding toString()

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "ID: " + id + ", Nama: " + nama + ", Umur: " + umur + ", Status: " + statusKeluarga;
    }
}
