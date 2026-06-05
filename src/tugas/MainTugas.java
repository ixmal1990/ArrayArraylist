/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

// Nama : Muhammad Ixmal ALimudin
// NPM  : 2410010280

/**
 *
 * @author ASUS
 */
public class MainTugas {

// Nama : Muhammad Ixmal ALimudin
// NPM  : 2410010280


    public static void main(String[] args) {

        KelasKuliah kelas = new KelasKuliah();

        // Array Mata Kuliah
        String[] mataKuliah = {
            "Pemrograman Berbasis Objek",
            "Basis Data",
            "Jaringan Komputer"
        };

        System.out.println("=== DAFTAR MATA KULIAH ===");

        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }

        System.out.println();

        // Tambah 5 mahasiswa
        kelas.tambahMahasiswa(
                new Mahasiswa("Andi", "231001", 85));

        kelas.tambahMahasiswa(
                new Mahasiswa("Budi", "231002", 55));

        kelas.tambahMahasiswa(
                new Mahasiswa("Citra", "231003", 90));

        kelas.tambahMahasiswa(
                new Mahasiswa("Doni", "231004", 70));

        kelas.tambahMahasiswa(
                new Mahasiswa("Eka", "231005", 45));

        kelas.tampilkanSemua();

        System.out.println();
        System.out.println("Rata-rata Nilai : "
                + kelas.hitungRataRata());

        System.out.println("Jumlah Lulus : "
                + kelas.jumlahLulus());

        System.out.println("Jumlah Mahasiswa : "
                + kelas.jumlahMahasiswa());

        System.out.println();

        // Tambah 1 mahasiswa baru
        kelas.tambahMahasiswa(
                new Mahasiswa("Farhan", "231006", 88));

        System.out.println("=== SETELAH MENAMBAH MAHASISWA BARU ===");

        System.out.println("Jumlah Mahasiswa Sekarang : "
                + kelas.jumlahMahasiswa());

        System.out.println();

        kelas.tampilkanSemua();
    }
}
    

