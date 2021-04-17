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
public class modul4_soal3 {
    public static void selectionSort(int[] A) {
         System.out.println("Nama: Reza Maulana Rizky");
        int smallIndex;
        int pass, j, n = A.length;
        int temp;
        int l = 0;
        
        for (pass = 0; pass < n - l; pass++) {
            smallIndex = pass;
            for (j = pass + l; j < n; j++) {
                if (A[j]< A[smallIndex]) {
                    smallIndex = j;
                }
            }
            
            temp = A[pass];
            A[pass] = A[smallIndex];
            A[smallIndex] = temp;
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
        modul4_soal3.tampil(A);
        modul4_soal3.selectionSort(A);
        modul4_soal3.tampil(A);
        }
    }
