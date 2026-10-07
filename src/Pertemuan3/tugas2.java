package Pertemuan3;
import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);
        int lembarDokumen, biayaCetak=500, biayaJilid=5000, totalBiaya;

        System.out.print("Masukkan jumlah lembar dokumen : ");
        lembarDokumen = alden.nextInt();

        totalBiaya = (biayaCetak * lembarDokumen) + biayaJilid;

        System.out.println("Total biaya yang harus dibayar mahasiswa tersebut adalah: Rp" +totalBiaya);
        alden.close();
    }
}
