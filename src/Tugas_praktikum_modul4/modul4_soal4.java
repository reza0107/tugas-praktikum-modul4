/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_praktikum_modul4;

/**
 *
 * @author user
 */
public class modul4_soal4 {
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
    
    public static void main(String[] args) {
        int A[] = {25, 7, 9, 13, 3};
        modul4_soal4.tampil(A);
        modul4_soal4.shellsort(A);
        modul4_soal4.tampil(A);
        }
    }


