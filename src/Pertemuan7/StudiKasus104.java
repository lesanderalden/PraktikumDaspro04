package Pertemuan7;
import java.util.Scanner;

public class StudiKasus104 {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.print("Masukkan Jumlah cup     : ");
        jumlahCup = alden.nextInt();
        System.out.print("Masukkan uang bayar     : ");
        uangBayar = alden.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }
        totalBayar=  totalHarga - diskon;

        System.out.println("Total Harga             : Rp"+totalHarga);
        System.out.println("Diskon                  : Rp"+diskon);
        System.out.println("Total bayar             : Rp"+totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian anda Rp"+kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp"+kurang);
        }
        alden.close();
    }
}
