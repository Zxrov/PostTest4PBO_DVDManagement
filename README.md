# PostTest4PBO_DVDManagement

Deskripsi Program

Program ini merupakan pengembangan dari tugas Posttest 3. 
Dengan tambahan ketentuan sebagai berikut :
- Menerapkan Abstraction (minimal 1 abstract class atau 1 interface).
- Menerapkan Polymorphism (minimal menggunakan 1 Overloading dan 1 Overriding).

Nilai tambah :
- Menggunakan kombinasi abstract class dan interface secara bersamaan dalam program.

---

## Implementasi Program PostTest 4

Implementasi OOP: **Abstraction, Encapsulation, Inheritance, Polymorphism (Overriding & Overloading)**  

## Penerapan Konsep OOP

Dokumentasi penerapan konsep OOP yang diminta dalam penugasan PostTest 4

## 1. Abstraction

Menggunakan abstract class Film.java sebagai blueprint untuk class turunannya (DVD & OnlineMovie).

<img width="1066" height="755" alt="image" src="https://github.com/user-attachments/assets/b31ec203-85bb-42e2-a100-44af91cb3836" />

Pada class Film.java, konsep abstraction diterapkan dengan menjadikannya abstract class dan mendefinisikan method abstrak tampilkanInfo() yang wajib dioverride oleh subclass. Konsep encapsulation terlihat dari atribut yang dibuat private serta diakses melalui getter dan setter. Selain itu, constructor digunakan untuk inisialisasi data awal dengan status default "Tersedia". Class ini menjadi dasar bagi subclass seperti DVD dan OnlineMovie dalam sistem penyewaan film.

## 2. Inheritance

Class DVD dan OnlineMovie mewarisi class Film lalu meng-override method tampilkanInfo().

<img width="1064" height="775" alt="image" src="https://github.com/user-attachments/assets/42d83303-51c4-40c1-96d3-ccbf70d7b13e" />
DVD.java, class ini memperluas Film dan menambahkan atribut baru format. Selain itu, method tampilkanInfo() dioverride untuk menampilkan informasi khusus DVD, serta terdapat implementasi hitungHargaSewa() dengan aturan harga sewa Rp10.000 per hari dan diskon 10% untuk member.

---
<img width="914" height="808" alt="image" src="https://github.com/user-attachments/assets/6296ced6-92ca-4768-b280-6c3bb476237c" />
OnlineMovie.java, class ini juga memperluas Film, tetapi menambahkan atribut platform. Method tampilkanInfo() dioverride untuk menampilkan informasi khusus film online, dan hitungHargaSewa() dioverride dengan aturan harga Rp15.000 per hari serta diskon 15% untuk member.

---

## 3. Polymorphism (Overriding & Overloading)

Class Sewa.java memiliki method sewaFilm() yang dibuat dalam 2 versi (Overloading).

<img width="1052" height="374" alt="image" src="https://github.com/user-attachments/assets/3c2b6e85-6ebe-4f63-a554-4c11a450d6df" />


