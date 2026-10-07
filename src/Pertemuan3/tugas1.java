package Pertemuan3;
import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);
        double hargaLaptop, uangMuka, sisaHarga, persentaseBunga=0.02, bunga, cicilanPokok, jumlahCicilan;
        int lamaCicilan;

        System.out.print("Masukkan harga laptop : ");
        hargaLaptop = alden.nextDouble();
        System.out.print("Masukkan uang muka : ");
        uangMuka = alden.nextDouble();
        System.out.print("Masukkan lama cicilan dalam bulan : ");
        lamaCicilan = alden.nextInt();

        sisaHarga = hargaLaptop - uangMuka;
        bunga = persentaseBunga * sisaHarga;
        cicilanPokok = sisaHarga / lamaCicilan;
        jumlahCicilan = cicilanPokok + bunga;

        System.out.print("Jumlah cicilan yang harus dibayar Rina tiap bulan adalah: Rp" +jumlahCicilan);
        alden.close();
    }
}
