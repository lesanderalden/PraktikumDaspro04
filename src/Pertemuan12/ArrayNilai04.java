package Pertemuan12;

import java.util.Scanner;

public class ArrayNilai04 {
    public static void main(String[] args) {
        int lulus = 0;
        int tdkLulus = 0;
        int[] nilaiAkhir = new int[10];
        Scanner alden = new Scanner(System.in);

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = alden.nextInt();
        }
        
        for (int i = 0; i < nilaiAkhir.length; i++) {
            String status = (nilaiAkhir[i] > 70) ? "LULUS" : "TIDAK LULUS";
            if (status == "LULUS") { 
                System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" +status+ ")");
                lulus++;
            } else {
                tdkLulus++;
            }
        }
        System.out.println("Jumlah mahasiswa lulus: "+lulus);
        System.out.println("Jumlah mahasiswa tidak lulus: "+tdkLulus);
        alden.close();
    }
}
