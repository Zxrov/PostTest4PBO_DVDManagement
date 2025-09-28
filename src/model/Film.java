/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dvdpenyewaan.model;

/**
 *
 * @author Muhammad Romadhoni
 */
public abstract class Film {
    private String id;
    private String judul;
    private String genre;
    private String status;

    public Film(String id, String judul, String genre) {
        this.id = id;
        this.judul = judul;
        this.genre = genre;
        this.status = "Tersedia";
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getJudul() { return judul; }
    public void setJudul(String judul) { this.judul = judul; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    // jadi abstract (harus override di subclass)
    public abstract void tampilkanInfo();
}

