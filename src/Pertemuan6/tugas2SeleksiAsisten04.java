package Pertemuan6;
import java.util.Scanner;

public class tugas2SeleksiAsisten04 {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);
        boolean mahasiswaAktif, diSanksi, adaSertif;
        int nilaiDaspro, nilaiWawancara;
        String pesan;

        System.out.print("Apakah anda mahasiswa aktif? (true/false): ");
        mahasiswaAktif = alden.nextBoolean();
        System.out.print("Apakah anda sedang disanksi? (true/false): ");
        diSanksi = alden.nextBoolean();

        if (mahasiswaAktif && !diSanksi) {
            System.out.print("Masukan nilai Dasar Pemrograman anda: ");
            nilaiDaspro = alden.nextInt();
            System.out.print("Apakah anda memiliki sertifikat kompetensi pemrograman? (true/false): ");
            adaSertif = alden.nextBoolean();
            if ((nilaiDaspro >= 79 && nilaiDaspro <= 100) || adaSertif) {
                System.out.print("Masukkan nilai tes wawancara anda: ");
                nilaiWawancara = alden.nextInt();
                if (nilaiWawancara >= 74 && nilaiWawancara <= 100) {
                    pesan = "Selamat, anda lolos seleksi calon asisten praktikum!";
                } else {
                    pesan = "Anda tidak lolos karena nilai wawancara dibawah batas minimal";
                }
            } else {
                pesan = "Anda tidak lolos karena nilai DasPro dibawah batas minimal atau tidak memiliki sertifikat kompetensi pemgrograman";
            }
        } else {
            pesan = "Status mahasiswa tidak memenuhi syarat";
        }
        System.out.println(pesan);
        alden.close();
    }
}
