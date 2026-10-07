package Pertemuan2;
import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);

        System.out.print("Masukkan gaji pokok: ");
        int gajiPokok = alden.nextInt();

        System.out.print("Masukkan tunjangan anak: ");
        int tunjanganAnak = alden.nextInt();

        System.out.print("Masukkan jumlah anak: ");
        int jumlahAnak = alden.nextInt();
        
        float simpananPensiun = 0.1f;

        float gajiBersih = gajiPokok + (jumlahAnak * tunjanganAnak) - (gajiPokok * simpananPensiun);
        System.out.println("Gaji Bersih: " + gajiBersih);
        alden.close();
    }
}