/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dvdpenyewaan.model;

/**
 *
 * @author Muhammad Romadhoni
 */
public class DVD extends Film implements Sewa {
    private String format; 

    public DVD(String id, String judul, String genre, String format) {
        super(id, judul, genre);
        this.format = format;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("DVD - ID: " + getId() + ", Judul: " + getJudul() +
                           ", Genre: " + getGenre() + ", Format: " + format +
                           ", Status: " + getStatus());
    }

    // Implementasi interface Sewa
    @Override
    public double hitungHargaSewa(int hari) {
        return hari * 10000; // Rp 10.000 per hari
    }

    @Override
    public double hitungHargaSewa(int hari, boolean member) {
        double harga = hari * 10000;
        if (member) {
            harga *= 0.9; // Diskon 10% untuk member
        }
        return harga;
    }
}