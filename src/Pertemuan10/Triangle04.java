package Pertemuan10;

import java.util.Scanner;

public class Triangle04 {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = alden.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        System.out.println();

        i = 1;
        while (i <= n) {
            int j = 0;
            while (j < (n - (i-1))) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        alden.close();
    }
}
