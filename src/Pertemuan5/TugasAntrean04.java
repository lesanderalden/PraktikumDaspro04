package Pertemuan5;
import java.util.Scanner;

public class TugasAntrean04 {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);
        int kode;

        System.out.print("Masukkan kode : ");
        kode = alden.nextInt();

        switch (kode) {
            case 1:
                System.out.println("Anda memilih : Legalisir Ijazah");
                System.out.println("Silahkan menuju ke Loket A");
                break;
            case 2:
                System.out.println("Anda memilih : Surat Keterangan Aktif Kuliah");
                System.out.println("Silahkan menuju ke Loket B");
                break;
            case 3:
                System.out.println("Anda memilih : Pembayaran UKT");
                System.out.println("Silahkan menuju ke Loket C");
                break;
            case 4:
                System.out.println("Anda memilih : Pengajuan Cuti Akademik");
                System.out.println("Silahkan menuju ke Loket D");
                break;
            default:
                System.out.println("Kode layanan tidak tersedia");
                break;
        }
        alden.close();
    }
}
