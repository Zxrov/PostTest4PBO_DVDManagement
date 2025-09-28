/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dvdpenyewaan.service;

import dvdpenyewaan.model.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Muhammad Romadhoni
 */
public class DVDService {
    private ArrayList<Film> daftarFilm = new ArrayList<>();
    private Scanner scanner;

    // Constructor
    public DVDService(Scanner scanner) {
        this.scanner = scanner;
    }

    // Menu utama
    public void tampilkanMenu() {
        int pilihan;
        do {
            System.out.println("\n=== Sistem Manajemen Penyewaan Film ===");
            System.out.println("1. Tambah DVD");
            System.out.println("2. Tambah Film");
            System.out.println("3. Lihat Daftar DVD/Film");
            System.out.println("4. Update DVD/Film");
            System.out.println("5. Hapus DVD/Film");
            System.out.println("6. Sewa DVD/Film");
            System.out.println("7. Kembalikan DVD/Film");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Input harus angka! Pilih menu: ");
                scanner.next(); 
            }
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> tambahDVD();
                case 2 -> tambahOnlineMovie();
                case 3 -> tampilkanDaftarFilm();
                case 4 -> updateFilm();
                case 5 -> hapusFilm();
                case 6 -> sewaFilm();
                case 7 -> kembalikanFilm();
                case 8 -> System.out.println("Keluar dari program...");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 8);
    }

    // Tambah DVD
    private void tambahDVD() {
        System.out.print("Masukkan ID DVD: ");
        String id = scanner.nextLine();
        System.out.print("Masukkan Judul DVD: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan Genre DVD: ");
        String genre = scanner.nextLine();
        System.out.print("Masukkan Format DVD (Blu-ray/DVD): ");
        String format = scanner.nextLine();

        daftarFilm.add(new DVD(id, judul, genre, format));
        System.out.println("DVD berhasil ditambahkan!");
    }

    // Tambah Online Movie
    private void tambahOnlineMovie() {
        System.out.print("Masukkan ID Online Movie: ");
        String id = scanner.nextLine();
        System.out.print("Masukkan Judul Film: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan Genre Film: ");
        String genre = scanner.nextLine();
        System.out.print("Masukkan Platform (Netflix/Disney): ");
        String platform = scanner.nextLine();

        daftarFilm.add(new OnlineMovie(id, judul, genre, platform));
        System.out.println("Online Movie berhasil ditambahkan!");
    }

    // Tampilkan semua film
    private void tampilkanDaftarFilm() {
        System.out.println("\nDaftar Film:");
        if (daftarFilm.isEmpty()) {
            System.out.println("(Kosong)");
        } else {
            for (Film film : daftarFilm) {
                film.tampilkanInfo(); // polymorphism jalan otomatis
            }
        }
    }

    // Update film (bisa DVD atau OnlineMovie)
    private void updateFilm() {
        System.out.print("Masukkan ID Film yang ingin diupdate: ");
        String id = scanner.nextLine();
        for (Film film : daftarFilm) {
            if (film.getId().equals(id)) {
                System.out.print("Masukkan Judul baru: ");
                film.setJudul(scanner.nextLine());
                System.out.print("Masukkan Genre baru: ");
                film.setGenre(scanner.nextLine());
                System.out.println("Film berhasil diupdate!");
                return;
            }
        }
        System.out.println("Film dengan ID " + id + " tidak ditemukan.");
    }

    // Hapus film
    private void hapusFilm() {
        System.out.print("Masukkan ID Film yang ingin dihapus: ");
        String id = scanner.nextLine();
        boolean removed = daftarFilm.removeIf(f -> f.getId().equals(id));
        if (removed) {
            System.out.println("Film berhasil dihapus.");
        } else {
            System.out.println("Film dengan ID " + id + " tidak ditemukan.");
        }
    }

    // Sewa film
    private void sewaFilm() {
        System.out.print("Masukkan ID Film yang ingin disewa: ");
        String id = scanner.nextLine();
        for (Film film : daftarFilm) {
            if (film.getId().equals(id)) {
                if (film.getStatus().equals("Tersedia")) {
                    System.out.print("Berapa hari ingin disewa? ");
                    int hari = scanner.nextInt();
                    scanner.nextLine();

                    boolean isMember = false;
                    System.out.print("Apakah Anda member? (y/n): ");
                    String member = scanner.nextLine();
                    if (member.equalsIgnoreCase("y")) {
                        isMember = true;
                    }

                    if (film instanceof Sewa sewaFilm) {
                        double harga = sewaFilm.hitungHargaSewa(hari, isMember);
                        System.out.println("Total harga sewa: Rp " + harga);
                    }

                    film.setStatus("Dipinjam");
                    System.out.println("Film berhasil disewa!");
                } else {
                    System.out.println("Film sedang dipinjam, tidak bisa disewa.");
                }
                return;
            }
        }
        System.out.println("Film dengan ID " + id + " tidak ditemukan.");
    }

    // Kembalikan film
    private void kembalikanFilm() {
        System.out.print("Masukkan ID Film yang ingin dikembalikan: ");
        String id = scanner.nextLine();
        for (Film film : daftarFilm) {
            if (film.getId().equals(id)) {
                if (film.getStatus().equals("Dipinjam")) {
                    film.setStatus("Tersedia");
                    System.out.println("Film berhasil dikembalikan!");
                } else {
                    System.out.println("Film tidak sedang dipinjam.");
                }
                return;
            }
        }
        System.out.println("Film dengan ID " + id + " tidak ditemukan.");
    }
}