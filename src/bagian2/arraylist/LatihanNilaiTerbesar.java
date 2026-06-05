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

public class LatihanNilaiTerbesar {
    public static void main(String[] args) {

        ArrayList<Integer> angka = new ArrayList<>();

        angka.add(70);
        angka.add(95);
        angka.add(60);
        angka.add(88);
        angka.add(75);

        int terbesar = angka.get(0);

        for (int n : angka) {
            if (n > terbesar) {
                terbesar = n;
            }
        }

        System.out.println("Data angka : " + angka);
        System.out.println("Nilai terbesar : " + terbesar);
    }
}
