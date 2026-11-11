package Pertemuan12;
import java.util.Scanner;

public class NilaiMhs_04 {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);
        @SuppressWarnings ("unused")
        String nama, status, lanjut;
        int kuis, uts, uas, tugas, jumlahMahasiswa = 0;
        int lulus = 0, tdkLulus =0;
        double rataTugas, totalTugas, nilaiAkhir;

        do {
            totalTugas = 0;
            System.out.print("Nama mahasiswa: ");
            nama = alden.nextLine();
            System.out.print("Nilai kuis: ");
            kuis = alden.nextInt();
            System.out.print("Nilai UTS: ");
            uts = alden.nextInt();
            System.out.print("Nilai UAS: ");
            uas = alden.nextInt();

            int i = 1;
            while (i <= 2) {
                System.out.print("Nilai Tugas"+i+": ");
                tugas = alden . nextInt();
                if (tugas < 0 || tugas > 100) {
                    System.out.println("Nilai tidak valid, ulangi!");
                    continue;
                } else {
                    totalTugas += tugas;
                }
                i++;
            }
            alden.nextLine();
            rataTugas = totalTugas / 2;
            nilaiAkhir = (double) (0.35 * kuis) + (0.15 * uts) + (0.3 * uas) + (0.2 * rataTugas);
            if (nilaiAkhir > 50) {
                lulus++;
            } else {
                tdkLulus++;
            }
            System.out.println("Rata-rata tugas: "+rataTugas);
            System.out.println("Nilai akhir: "+nilaiAkhir);
            System.out.print("Tambah mahasiswa? (y/t): ");
            lanjut = alden.nextLine();
            jumlahMahasiswa++;
        } while (lanjut.equalsIgnoreCase("y"));
        System.out.println("========================== REKAP ==========================");
        System.out.println("Jumlah mahasiswa: "+jumlahMahasiswa);
        System.out.println("Jumlah lulus: "+lulus);
        System.out.println("Jumlah tidak lulus: "+tdkLulus);
        alden.close();
    }
}
