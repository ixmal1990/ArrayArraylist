/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagian2.arraylist;

/**
 *
 * @author ASUS
 */


import java.util.ArrayList;

public class LatihanBelanja {
    public static void main(String[] args) {

        ArrayList<String> belanja = new ArrayList<>();

        belanja.add("Beras");
        belanja.add("Gula");
        belanja.add("Minyak");
        belanja.add("Telur");

        // Hapus item ke-2 (indeks 1)
        belanja.remove(1);

        System.out.println("Daftar Belanja:");
        belanja.forEach((item) -> {
            System.out.println("- " + item);
        });

        System.out.println("Jumlah item: " + belanja.size());
    }
}