package Pertemuan6;
import java.util.Scanner;

public class nestedUjianSkripsi04 {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);
        String pesan;
        System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak): ");
        String bebasKompen = alden.nextLine().trim();

        System.out.print("Masukkan jumlah log bimbingan Pembimbing 1: ");
        int bimbinganP1 = alden.nextInt();
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 2: ");
        int bimbinganP2 = alden.nextInt();

        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 10 && bimbinganP2 >=4) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbinganP1 < 10 && bimbinganP2 < 4) {
                pesan = "Gagal! Log bimbingan P1 kurang dari 10 kali dan P2 kurang dari 4 kali";
            } else if (bimbinganP1 < 10) {
                pesan = "Gagal! Log bimbingan P1 belum mencapai 10 kali";
            } else {
                pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali";
            }
        } else {
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
        }
        System.out.println(pesan);
        alden.close();
    }
}
