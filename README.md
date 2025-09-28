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

<img width="1087" height="943" alt="image" src="https://github.com/user-attachments/assets/9514e7f5-b81d-4313-8d55-9ce64ed7ce63" />
DVD.java, class ini memperluas Film dan menambahkan atribut baru format. Selain itu, method tampilkanInfo() dioverride untuk menampilkan informasi khusus DVD, serta terdapat implementasi hitungHargaSewa() dengan aturan harga sewa Rp10.000 per hari dan diskon 10% untuk member.

---
<img width="896" height="942" alt="image" src="https://github.com/user-attachments/assets/37d84810-0ab3-4d0f-9b07-478495d6a0e9" />
OnlineMovie.java, class ini juga memperluas Film, tetapi menambahkan atribut platform. Method tampilkanInfo() dioverride untuk menampilkan informasi khusus film online, dan hitungHargaSewa() dioverride dengan aturan harga Rp15.000 per hari serta diskon 15% untuk member.

---

## 3. Polymorphism (Overriding & Overloading)

Class Sewa.java memiliki method sewaFilm() yang dibuat dalam 2 versi (Overriding & Overloading).

<img width="763" height="528" alt="image" src="https://github.com/user-attachments/assets/d4d4e8e2-31bd-455e-a4b9-45990e87439f" />

---

<img width="957" height="532" alt="image" src="https://github.com/user-attachments/assets/16e0dc0a-f966-4086-b177-3f0a341a297b" />




