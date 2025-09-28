/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dvdpenyewaan.main;

import dvdpenyewaan.service.DVDService;
import java.util.Scanner;
/**
 *
 * @author Muhammad Romadhoni
 */

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DVDService service = new DVDService(scanner);
        service.tampilkanMenu();
    }
}