package Pertemuan6;
import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);
        boolean isRabu;
        double diskon;
        int jumlahBuku, persenDiskon;
        String jenisBuku;

        System.out.print("Masukkan jenis buku: ");
        jenisBuku = alden.nextLine();
        System.out.print("Masukkan jumlah buku: ");
        jumlahBuku = alden.nextInt();
        System.out.print("Apakah sekarang hari Rabu? (true/false): ");
        isRabu = alden.nextBoolean();

        if (isRabu) {
            if (jenisBuku.equalsIgnoreCase("Kamus") && jumlahBuku > 2) {
                diskon = 0.14;
            } else if (jenisBuku.equalsIgnoreCase("Kamus")) {
                diskon = 0.12;
            } else if (jenisBuku.equalsIgnoreCase("Novel") && jumlahBuku >= 3) {
                diskon = 0.06;
            } else if (jenisBuku.equalsIgnoreCase("Novel")) {
                diskon = 0.05;
            } else if (jumlahBuku > 3) {
                diskon = 0.03;
            } else {
                diskon = 0;
            }
        } else {
            diskon = 0;
        }

        persenDiskon = (int) (diskon * 100);

        System.out.println("Diskon yang didapat: "+persenDiskon+"%");
        alden.close();
    }
}
