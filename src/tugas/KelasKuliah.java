/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;

public class KelasKuliah {

    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    public void tambahMahasiswa(Mahasiswa mhs) {
        daftarMahasiswa.add(mhs);
    }

    public double hitungRataRata() {
        double total = 0;

        for (Mahasiswa m : daftarMahasiswa) {
            total += m.getNilai();
        }

        return total / daftarMahasiswa.size();
    }

    public int jumlahLulus() {
        int jumlah = 0;

        for (Mahasiswa m : daftarMahasiswa) {
            if (m.lulus()) {
                jumlah++;
            }
        }

        return jumlah;
    }

    public void tampilkanSemua() {
        System.out.println("=== DATA MAHASISWA ===");

        for (Mahasiswa m : daftarMahasiswa) {

            String status;

            if (m.lulus()) {
                status = "LULUS";
            } else {
                status = "TIDAK LULUS";
            }

            System.out.println(
                    "Nama : " + m.getNama()
                    + " | NPM : " + m.getNpm()
                    + " | Nilai : " + m.getNilai()
                    + " | " + status);
        }
    }

    public int jumlahMahasiswa() {
        return daftarMahasiswa.size();
    }
}
    
