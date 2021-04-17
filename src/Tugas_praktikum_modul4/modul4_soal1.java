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
public class modul4_soal1 {
     public static void insertionShort(int[] A) {
         System.out.println("Nama: Reza Maulana Rizky");
     for (int i = 1; i < A.length; i++) {
         int key = A[i];
         int j = i - 1;
         while ((j >= 0) && (A[j] > key)) {
             
             A[j + 1] = A[j];
             j--;
         }
         A[j + 1] = key;
     }
   }
    
public static void tampil(int data[]) {
    for (int i = 0; i < data.length; i++) {
        System.out.print(data[i] + " ");
    }
    System.out.println();
}

public static void main(String[] args) {
    int A[] = {25, 7, 99, 13, 3};
    modul4_soal1.tampil(A);
    modul4_soal1.insertionShort(A);
    modul4_soal1.tampil(A);
}
}