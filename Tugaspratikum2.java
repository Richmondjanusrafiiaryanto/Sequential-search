/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspratikum2;

import java.util.Scanner;

/**
 *
 * @author surga 2019
 */
public class Tugaspratikum2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double ratarata = 0;
        int cari;
        int a = 0;
        boolean found = false;
        int[] data = new int[]{83, 76, 45, 90, 85, 80, 78, 74,};
        Scanner I = new Scanner(System.in);

        System.out.println("Data pada array :");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i] + "\t");
            if (data[i] < a) {
                a = data[i];

            }
        }
        for (int i = 0; i < data.length; i++) {
            ratarata += data[i];
        }
        ratarata /= data.length;
        System.out.println("\nrata-rata nilai array = " + ratarata);
        System.out.print("\nnilai yang diatas rata-rata adalah : ");
        for (int j = 0; j < data.length; j++) {
            if (data[j] > ratarata) {
                System.out.print(data[j] + "\t");
            }

        }
    }
}
