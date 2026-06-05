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

import java.util.ArrayList;

public class Perpustakaan {

    private final ArrayList<Buku> koleksi = new ArrayList<>();

    public void tambahBuku(Buku buku) {
        koleksi.add(buku);
    }

    public void tampilkanKoleksi() {
        System.out.println("=== KOLEKSI BUKU ===");

        for (int i = 0; i < koleksi.size(); i++) {
            System.out.println((i + 1) + ". " + koleksi.get(i).info());
        }
    }

    public void pinjamBuku(String judul) {

        for (Buku b : koleksi) {

            if (b.getJudul().equals(judul)) {

                if (b.isDipinjam()) {
                    System.out.println(judul + " sedang dipinjam.");
                } else {
                    b.setDipinjam(true);
                    System.out.println(judul + " berhasil dipinjam.");
                }

                return;
            }
        }

        System.out.println("Buku tidak ditemukan.");
    }

    // LATIHAN 3.4 NO 1
    public void kembalikanBuku(String judul) {

        for (Buku b : koleksi) {

            if (b.getJudul().equals(judul)) {
                b.setDipinjam(false);
                System.out.println(judul + " telah dikembalikan.");
                return;
            }
        }

        System.out.println("Buku tidak ditemukan.");
    }

    // LATIHAN 3.4 NO 3
    public void cariPenulis(String penulis) {

        System.out.println("\nBuku karya " + penulis + ":");

        boolean ditemukan = false;

        for (Buku b : koleksi) {

            if (b.getPenulis().equalsIgnoreCase(penulis)) {
                System.out.println("- " + b.info());
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada buku ditemukan.");
        }
    }

    public int jumlahTersedia() {

        int jumlah = 0;

        for (Buku b : koleksi) {
            if (!b.isDipinjam()) {
                jumlah++;
            }
        }

        return jumlah;
    }
}