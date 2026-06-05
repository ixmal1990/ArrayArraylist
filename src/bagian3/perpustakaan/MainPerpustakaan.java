/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagian3.perpustakaan;

/**
 *
 * @author ASUS
 */
public class MainPerpustakaan {
     public static void main(String[] args) {

        Perpustakaan perpus = new Perpustakaan();

        perpus.tambahBuku(
                new Buku("Laskar Pelangi",
                        "Andrea Hirata",
                        2005));

        perpus.tambahBuku(
                new Buku("Bumi Manusia",
                        "Pramoedya",
                        1980));

        perpus.tambahBuku(
                new Buku("Negeri 5 Menara",
                        "Ahmad Fuadi",
                        2009));

        perpus.tampilkanKoleksi();

        System.out.println();

        perpus.pinjamBuku("Bumi Manusia");

        System.out.println();

        perpus.tampilkanKoleksi();

        System.out.println();

        // Latihan 3.4 No 1
        perpus.kembalikanBuku("Bumi Manusia");

        System.out.println();

        perpus.tampilkanKoleksi();

        System.out.println();

        // Latihan 3.4 No 3
        perpus.cariPenulis("Andrea Hirata");

        System.out.println();

        System.out.println("Jumlah buku tersedia : "
                + perpus.jumlahTersedia());
    }
}
