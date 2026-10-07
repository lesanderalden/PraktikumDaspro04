package Pertemuan4;
import java.util.Scanner;

public class DepotAir_04 {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);
        int kapasitasGalon = 19;
        int hargaPerGalon = 19500;
        int waktuOperasi = 8;
        
        System.out.print("Masukkan air bermdirrsih yang di produksi per hari dalam Liter: ");
        int airBersih = alden.nextInt(); 

        int jumlahGalon = airBersih / kapasitasGalon;
        System.out.println("Jumlah galon: " +jumlahGalon );

        int sisaAir = airBersih % kapasitasGalon;
        System.out.println("Sisa air (liter): " +sisaAir+ "L");

        double pendapatanSatuHari = hargaPerGalon * jumlahGalon;
        int pendapatanSehari = (int) pendapatanSatuHari;
        System.out.println("Pendapatan: Rp" +pendapatanSehari);

        double rataPerJam = pendapatanSatuHari / waktuOperasi;
        System.out.println("Rata-rata per jam: Rp" +rataPerJam);
        alden.close();
        
        //Jumlah galon: 5
        //Sisa air (liter): 5L
        //Pendapatan: Rp97500
        //Rata-rata per jam: Rp12187.5
    }
}
