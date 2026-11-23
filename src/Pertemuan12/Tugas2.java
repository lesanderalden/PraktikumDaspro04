package Pertemuan12;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("======== Daftar Menu Kafe Kampus ========");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp" + harga[i]);
        }

        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int jumlahPesanan = alden.nextInt();
        alden.nextLine();

        String[] daftarPesanan = new String[jumlahPesanan];
        int[] hargaPesanan = new int[jumlahPesanan];
        int totalBiaya = 0;

        for (int i = 0; i < daftarPesanan.length; i++) {
            System.out.print("Masukkan nama menu pesanan ke-" + (i + 1) + ": ");
            String cariMenu = alden.nextLine();

            int indeksDitemukan = -1;

            for (int j = 0; j < menu.length; j++) {
                if (menu[j].equalsIgnoreCase(cariMenu)) {
                    indeksDitemukan = j;
                    break;
                }
            }

            if (indeksDitemukan != -1) {
                System.out.println("-> Menu tersedia! Harga: Rp" + harga[indeksDitemukan]);
                daftarPesanan[i] = menu[indeksDitemukan];
                hargaPesanan[i] = harga[indeksDitemukan];
                totalBiaya += harga[indeksDitemukan];
            } else {
                System.out.println("-> Maaf, menu " + cariMenu + " tidak tersedia. Silakan masukkan ulang.");
                i--;
            }
        }

        for (int i = 0; i < daftarPesanan.length; i++) {
            System.out.println((i + 1) + ". " + daftarPesanan[i] + " \t: Rp" + hargaPesanan[i]);
        }
        System.out.println("-----------------------------------");
        System.out.println("Total Biaya \t: Rp" + totalBiaya);

        alden.close();
    }
}