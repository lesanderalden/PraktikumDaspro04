package Pertemuan2;
import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);
        
        System.out.print("Masukkan lebar tanah: ");
        int lebarTanah = alden.nextInt();
        System.out.print("Masukkan panjang tanah: ");
        int panjangTanah = alden.nextInt();
        System.out.print("Masukkan diameter kolam: ");
        int diameterKolam = alden.nextInt();
        System.out.print("Masukkan sisi taman: ");
        int sisiTaman = alden.nextInt();

        int luasTanah = lebarTanah * panjangTanah;
        float luasKolam = 3.14f * (diameterKolam / 2) * (diameterKolam / 2);
        int luasTaman = sisiTaman * sisiTaman;

        float luasSisa = luasTanah - (luasKolam + luasTaman);
        System.out.println("Luas Sisa: " + luasSisa);
        alden.close();
    }
}
