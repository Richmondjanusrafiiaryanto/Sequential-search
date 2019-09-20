/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspratikum1;

import java.util.Scanner;

/**
 *
 * @author surga 2019
 */
public class Tugaspratikum1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner rafi = new Scanner(System.in);
        
        
        int cari;
        int[] data = new int[]{74, 98, 72, 74, 72, 82, 90, 81, 72};
        System.out.println("Data pada array:");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
            
        }
        System.out.print("\nMasukkan nilai yang anda cari: ");
        cari = rafi.nextInt();
        int a = 0;
        for (int j = 0; j < data.length; j++) {
            if (cari == data[j]) {
                a++;
            }
        }
        System.out.println("Data yang dicari ditemukan sebanyak " + a + " kali");
        if(a == 0){
            System.out.println("Data tidak ditemukan");
        }
    }
    
}
