package Pertemuan5;
import java.util.Scanner;

public class TugasParkir04 {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);
        int lamaParkir;
        int tarif;

        System.out.print("Masukkan lama parkir dalam jam: ");
        lamaParkir = alden.nextInt();

        if (lamaParkir <= 2) {
            tarif = 2000;
        } else {
            tarif = 2000 + (lamaParkir - 2) * 1000;
        }

        System.out.println("Tarif yang harus dibayar: "+tarif);
        alden.close();
    }
}
