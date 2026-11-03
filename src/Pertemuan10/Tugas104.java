package Pertemuan10;

import java.util.Scanner;

public class Tugas104 {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);
        int n, total = 0;

        System.out.print("Masukkan nilai n: ");
        n = alden.nextInt();

        for (int i = 1; i <= n; i++) {
            int nilai = 1;
            total = 0;
            for (int j = 1; j <= i; j++) {
                System.out.print(nilai+" ");
                total += nilai;
                nilai++;
            }
            System.out.println();
        }
        System.out.println("Total angka tercetak: "+total);
        alden.close();
    }
}
