package Pertemuan12;

import java.util.Scanner;

public class SearchNilai04 {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);

        System.out.print("Masukkan banyak data: ");
        int banyakData = alden.nextInt();

        int[] nilai = new int[banyakData];
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan data indeks ke-"+i+": ");
            nilai[i] = alden.nextInt();
        }
        System.out.print("Masukkan keyword yang ingin dicari: ");
        int key = alden.nextInt();
        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
         System.out.println("Nilai " + key + " tidak ditemukan.");
        }
        alden.close();
    }
}