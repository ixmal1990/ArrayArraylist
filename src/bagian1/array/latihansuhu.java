/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagian1.array;

/**
 *
 * @author ASUS
 */
public class latihansuhu {
     public static void main(String[] args) {

        double[] suhu = {30.5, 28.0, 33.2, 27.8, 31.1, 29.4};

        double tertinggi = suhu[0];
        double terendah = suhu[0];

        for (double s : suhu) {
            if (s > tertinggi) {
                tertinggi = s;
            }

            if (s < terendah) {
                terendah = s;
            }
        }

        System.out.println("Suhu tertinggi : " + tertinggi);
        System.out.println("Suhu terendah  : " + terendah);
    }
    
}
