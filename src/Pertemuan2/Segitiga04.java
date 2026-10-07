package Pertemuan2;
import java.util.Scanner;

public class Segitiga04 {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);
        int alas, tinggi;
        float luas;

        System.out.print("Masukkan alas: ");
        alas = alden.nextInt();
        System.out.print("Masukkan tinggi: ");
        tinggi = alden.nextInt();

        luas = alas * tinggi / 2;

        System.out.println("Luas segitiga: " + luas);
        alden.close();
    }
}
