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
public class modul4_soal2 {
    public static void bubblesort(int[] A) {
         System.out.println("Nama: Reza Maulana Rizky");
        int l;
        l = 0;
        int i=l, j, n = A.length;
        int temp;
        while (i<n) {
        j = n-l ;
        while(j>=i) {
            if (A[j-l]>A[j]) {
                temp = A[j];
                A[j] = A[j-l];
                A[j-l] = temp;
            }
            j = j - l;
        }
        i = i + l;
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
        modul4_soal2.tampil(A);
        modul4_soal2.bubblesort(A);
        modul4_soal2.tampil(A);
        }
    }

