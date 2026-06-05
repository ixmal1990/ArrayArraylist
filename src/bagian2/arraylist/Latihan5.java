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

public class Latihan5 {
public static void main(String[] args) {
ArrayList<Integer> nilai = new ArrayList<>();
nilai.add(80);
nilai.add(75);
nilai.add(90);
int total = 0;
total = nilai.stream().map((n) -> n).reduce(total, Integer::sum); // for-each pada ArrayList
double rata = (double) total / nilai.size();
System.out.println("Data : " + nilai);
System.out.println("Total : " + total);
System.out.println("Rata-rata : " + rata);
}
}
