package Pertemuan6;
import java.util.Scanner;

public class operatorLogikaWifi04 {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);
        boolean mahasiswa;
        boolean dosen;
        boolean akunDiblokir;

        System.out.print("Apakah pengguna mahasiswa? (true/false): ");
        mahasiswa = alden.nextBoolean();

        System.out.print("Apakah pengguna dosen? (true/false): ");
        dosen = alden.nextBoolean();

        System.out.print("Apakah akun sedang diblokir? (true/false): ");
        akunDiblokir = alden.nextBoolean();

        if ((mahasiswa && dosen) && !akunDiblokir) {
            System.out.println("Akses WiFi diberikan");
        } else {
            System.out.println("Akses WiFi ditolak");
        }
        alden.close();
    }
}
