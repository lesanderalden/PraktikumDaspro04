package Pertemuan12;
import java.util.Scanner;

public class ArrayRataNilai04 {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = alden.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];
        int total = 0;
        int lulus = 0;
        String predikat;
        double rata2;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = alden.nextInt();
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                lulus++;
            }
        }
        rata2 = (double) total / nilaiMhs.length;
        System.out.println("Total nilai: "+total);
        System.out.println("Rata-rata: " + rata2);

        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];

        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) tertinggi = nilaiMhs[i];
            if (nilaiMhs[i] < terendah) terendah = nilaiMhs[i];
        }

        if (rata2 >= 85) {
            predikat = "SANGAT BAIK";
        } else if (rata2 >= 70) {
            predikat = "BAIK";
        } else {
            predikat = "PERLU PENDAMPINGAN";
        }

        System.out.println("Mahasiswa Lulus: "+lulus);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Predikat kelas: "+predikat);
        alden.close();
    }
}
