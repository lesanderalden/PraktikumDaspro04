package Pertemuan5;
import java.util.Scanner;

public class Tugas2Pemilihan {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);
        int jumlahSKS;

        jumlahSKS = alden.nextInt();

        if (jumlahSKS > 24) {
            System.out.println("Melebihi batas");
        } else {
            System.out.println("KRS valid");
        }
    alden.close();
    }
}
    