/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dvdpenyewaan.model;

/**
 *
 * @author Muhammad Romadhoni
 */
public class OnlineMovie extends Film implements Sewa {
    private String platform; // Netflix, Disney, dll

    public OnlineMovie(String id, String judul, String genre, String platform) {
        super(id, judul, genre);
        this.platform = platform;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("OnlineMovie - ID: " + getId() + ", Judul: " + getJudul() +
                           ", Genre: " + getGenre() + ", Platform: " + platform +
                           ", Status: " + getStatus());
    }

    // Implementasi interface Sewa
    @Override
    public double hitungHargaSewa(int hari) {
        return hari * 15000; // Rp 15.000 per hari
    }

    @Override
    public double hitungHargaSewa(int hari, boolean member) {
        double harga = hari * 15000;
        if (member) {
            harga *= 0.85; // Diskon 15% untuk member
        }
        return harga;
    }
}

