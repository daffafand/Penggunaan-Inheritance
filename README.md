Proyek Pemrograman Berorientasi Objek (OOP) - Single File Java

Proyek ini adalah implementasi konsep Pemrograman Berorientasi Objek (OOP) menggunakan bahasa pemrograman Java yang disusun dalam satu berkas (Main.java).

Konsep OOP yang Diterapkan

Inheritance (Pewarisan)

Kelas Manusia bertindak sebagai Superclass (parent class).

Kelas Mahasiswa dan Dosen bertindak sebagai Subclass (child class) yang mewarisi atribut nama dan usia dari kelas Manusia.

Polymorphism & Method Overriding

Kelas Mahasiswa dan Dosen meng-override method tampilkanInfo() milik kelas Manusia untuk menampilkan detail spesifik masing-masing (NIM/Jurusan untuk Mahasiswa, serta NIP/Fakultas untuk Dosen).

Super Keyword

Penggunaan super() pada konstruktor subclass untuk memanggil konstruktor superclass.

Penggunaan super.tampilkanInfo() untuk mencetak informasi dasar sebelum mencetak informasi spesifik subclass.

Access Modifiers & Single File Scope

Semua kelas disimpan dalam satu berkas Main.java. Kelas utama Main menggunakan modifier public, sedangkan kelas pembantu (Manusia, Mahasiswa, Dosen) menggunakan akses package-private (default).
