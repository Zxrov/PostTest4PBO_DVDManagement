/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dvdpemyeawaan.model;

/**
 *
 * @author Muhammad Romadhoni
 */
public interface Sewa {
    double hitungHargaSewa(int hari);   
    double hitungHargaSewa(int hari, boolean member); 
    void kembalikan();
}