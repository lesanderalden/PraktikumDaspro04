package Pertemuan3;
import java.util.Scanner;

public class GajiKaryawan04 {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);
        int gajiPokok;
        double bonus;
        double totGaji;
        double tunjTransp=600000;
        double tunjMkn=400000;

        gajiPokok=alden.nextInt();
        bonus= 0.05*gajiPokok;
        totGaji=gajiPokok+tunjTransp+tunjMkn+bonus-(0.1*gajiPokok);

        int totalGaji = (int) totGaji;

        System.out.println("Bonus Bulanan anda adalah Rp. " +bonus);
        System.out.println("Gaji yang diterima adalah Rp. " +totalGaji);
        alden.close();
    }
}
