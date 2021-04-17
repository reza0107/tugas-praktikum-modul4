/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_praktikum_modul4;

import java.util.Scanner;
public class modul4_soaal7 {
        public static void main(String[] args) {
            System.out.println("Nama: Reza Maulana Rizky");
       System.out.println("***SEQUENTIAL SEARCH***"+"/n" );
       String data[] = {"Galileo", "Archimedes", "Alkhawarizmi", "Aljabar", "Nama Mahasiswa", "Telsa"};
       String key;
       Scanner scan = new Scanner (System.in);
       System.out.print("Masukkan data yang di  cari: ");
       key = scan.nextLine();
       System.out.println("isi data adalah: ");
       for (int i = 0; i < data.length; i++) {
           System.out.println(data[i] + " ");
       }
       System.out.println("");
       
       for (int i = 0; i <= data.length; i++) {
           if (key.equalsIgnoreCase(data[i])) {
               System.out.println("Data "+key+" berada pada index ke - "+i);
               break;
           }
       }
       System.out.println("/n");
       System.out.println();
       System.out.println("***TERIMA KASIH***");      
    } 
         public static void shellsort(int[] arr) {
         System.out.println("Nama: Reza Maulana Rizky");
         int n = arr.length;
         int C,M;
         int jarak, i, j, kondisi;
         boolean sudah = true;
         int temp;
         C = 0;
          M = 0;
         jarak = n;
                  
         while (jarak >= 1){
             jarak = jarak / 2;
             sudah = true;
             while (sudah) {
                 sudah = false;
                 for (j = 0; j < n - jarak; j++) {
                     i = j + jarak;
                     C++;
                     if (arr[j]> arr[i]) {
                         temp = arr[j];
                         arr[j] = arr[i];
                         arr[i] = temp;
                         sudah = true;
                     }
                            
                 }
             }
         }
     }
    public static void tampil(int data[]) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    
    public static void print(String[] args) {
        int A[] = {25, 7, 9, 13, 3};
        modul4_soal4.tampil(A);
        modul4_soal4.shellsort(A);
        modul4_soal4.tampil(A);
    }
    
}


