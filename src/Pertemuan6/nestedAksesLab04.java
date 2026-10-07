package Pertemuan6;
import java.util.Scanner;

public class nestedAksesLab04 {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);
        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        boolean punyaIzinDosen;
        boolean asistenLab;
        
        System.out.print("Apakah anda mahasiswa aktif? (true/false): ");
        mahasiswaAktif = alden.nextBoolean();
        System.out.print("Apakah anda sedang disanksi? (true/false): ");
        sedangDisanksi = alden.nextBoolean();
        System.out.print("Apakah anda punya izin dosen? (true/false): ");
        punyaIzinDosen = alden.nextBoolean();
        System.out.print("Apakah anda asisten Lab? (true/false): ");
        asistenLab = alden.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses laboratorium diberikan");
            } else {
                System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab");
            }
        } else {
            System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
        }
        alden.close();
    }
}
