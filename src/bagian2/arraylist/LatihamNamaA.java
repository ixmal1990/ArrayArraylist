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

public class LatihamNamaA {
    public static void main(String[] args) {

        ArrayList<String> nama = new ArrayList<>();

        nama.add("Andi");
        nama.add("Budi");
        nama.add("Ayu");
        nama.add("Citra");
        nama.add("Adit");
        nama.add("Doni");

        System.out.println("Nama yang diawali huruf A:");

        nama.stream().filter((n) -> (n.startsWith("A"))).forEachOrdered((n) -> {
            System.out.println(n);
        });
    }
}
