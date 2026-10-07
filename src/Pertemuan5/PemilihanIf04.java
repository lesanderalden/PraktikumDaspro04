package Pertemuan5;
import java.util.Scanner;

public class PemilihanIf04 {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah pembayaran UKT sudah lunas? (true/false): ");
        boolean uktLunas = alden.nextBoolean();

        String pesan = (uktLunas) ? "Pembayaran UKT terverifikasi \nSilahkan cetak KRS dan minta tanda tangan DPA" : "Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu";
        System.out.println(pesan);
        alden.close();
    }
}
