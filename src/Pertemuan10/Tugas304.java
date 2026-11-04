package Pertemuan10;

import java.util.Scanner;

public class Tugas304 {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);
        int jumlahToko, jumlahPelanggan, barang, barangTerbanyak = -1, barangPerToko = 0, totalPelanggan = 0, totalBarang = 0, pembelianTerbanyak = 0;

        System.out.print("Masukkan jumlah toko: ");
        jumlahToko = alden.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal adalah 1!");
        } else {
            for (int i = 1; i <= jumlahToko; i++) {
                System.out.println("================== Toko ke-"+i+" ==================");
                do {
                    System.out.print("Masukkan jumlah pelanggan: ");
                    jumlahPelanggan = alden.nextInt();
                    if (jumlahPelanggan < 0) {
                        System.out.print("Jumlah pelanggan tidak boleh negatif!");
                    } else {
                        totalPelanggan += jumlahPelanggan;
                    }
                } while (jumlahPelanggan < 0);
                for (int j = 1; j <= jumlahPelanggan; j++) {
                    do {
                        System.out.print("Barang yang dibeli pelanggan ke-"+j+": ");
                        barang = alden.nextInt();
                        if (barang < 0) {
                            System.out.println("Barang tidak boleh negatif!");
                        }
                    } while (barang < 0);
                    barangPerToko += barang;
                }
                totalBarang += barangPerToko;
                if (barangTerbanyak < barangPerToko) {
                    barangTerbanyak = barangPerToko;
                    pembelianTerbanyak = i;
                }
                System.out.println("Total barang yang dibeli dari toko ke-"+i+" adalah "+barangPerToko);
                barangPerToko = 0;
            }
            System.out.println("===============================================");
            System.out.println("Total pelanggan seluruh toko: "+totalPelanggan);
            System.out.println("Total barang yang terbeli di seluruh toko: "+totalBarang);
            System.out.println("Toko dengan pembelian terbanyak ialah toko ke-"+pembelianTerbanyak);
        }
        alden.close();
    }
}
