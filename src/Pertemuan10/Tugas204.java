package Pertemuan10;

import java.util.Scanner;

public class Tugas204 {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);
        int n, total = 0;

        System.out.print("Masukkan nilai n: ");
        n = alden.nextInt();

        if (n >= 3) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    int nilai = j*i;
                    System.out.printf("%4d", nilai);
                    total += nilai;
                }
                System.out.println();
            }
        } else {
            System.out.println("Input n tidak valid!");
        }
        System.out.println("Jumlah seluruh angka: "+total);
        alden.close();
    }
}
