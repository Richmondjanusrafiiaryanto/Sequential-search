/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpratikum01;

import java.util.Scanner;

/**
 *
 * @author surga 2019
 */
public class Latihanpratikum01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int cari;
         boolean found = false;
         int[] data = new int[]{29, 4, 10, 94, 96};
         Scanner input = new Scanner(System.in);
         System.out.println("Masukkan data yang ingin dicari");
         cari = input.nextInt();
         for (int i = 0; i < data.length; i++) {
         if (cari == data[i]) {
         found = true;
         break;
         }
         }
         if (found == true) {
         System.out.println("Data ditemukan");
         } else {
         System.out.println("Data tidak ditemukan!");
         }*/
        Scanner input = new Scanner(System.in);
        String cari;
        boolean found = false;
        String[] namakota = new String[]{"jakarta", "manado", "sulawesi", "makassar", "sidoarjo", "malang"};
        System.out.print("Masukkan nama kota yang ingin dicari : ");
        cari = input.nextLine();
        
        for (int i = 0; i < namakota.length; i++ ) {
            if (cari.equalsIgnoreCase(namakota[i])) {
                found = true;
                break;
            }
        }
        if (found == true) {
            System.out.println("itulah namakota yang anda cari");
        } else {
            System.out.println("namakota yang anda cari tidak ada");
        }
    }
}
