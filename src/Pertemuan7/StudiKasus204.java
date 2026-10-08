package Pertemuan7;
import java.util.Scanner;

public class StudiKasus204 {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);
        String namaMahasiswa, jenisKegiatan;
        String pesan = "";
        int pendanaanPKM = 0;
        int jumlahDokumen, peringkatJuara, kurangDokumen;

        System.out.print("Nama mahasiswa : ");
        namaMahasiswa = alden.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenisKegiatan = alden.nextLine();
        System.out.print("Jumlah dokumen : ");
        jumlahDokumen = alden.nextInt();

        if (jenisKegiatan.equalsIgnoreCase("belmawa")||
            jenisKegiatan.equalsIgnoreCase("bakorma")||
            jenisKegiatan.equalsIgnoreCase("mandiri")) {
                System.out.print("Peringkat juara : ");
                peringkatJuara = alden.nextInt();
                if (jumlahDokumen == 4) {
                    if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                        pesan = "Dokumen lengkap! Dana penghargaan diberikan.";
                    } else if (peringkatJuara == 0) {
                        pesan = "Anda tidak juara. Dana penghargaan tidak diberikan.";
                    } else {
                        pesan = "Juara yang anda masukkan tidak valid.";
                    }
                } else if (jumlahDokumen >= 0 && jumlahDokumen <=3) {
                    kurangDokumen = 4 - jumlahDokumen;
                    pesan = "Dokumen tidak lengkap (kurang "+kurangDokumen+" dokumen)";
                } else {
                    pesan = "Masukan jumlah dokumen tidak valid.";
                }
        } else if (jenisKegiatan.equalsIgnoreCase("pkm")||
                jenisKegiatan.equalsIgnoreCase("Program Kreativitas Mahasiswa")) {
            System.out.print("Status Pendanaan PKM (1/0) : ");
            pendanaanPKM = alden.nextInt();
            if (pendanaanPKM == 1) {
                pesan = "Pendanaan diberikan.";
            } else if (pendanaanPKM == 0) {
                pesan = "Pendanaan tidak diberikan.";
            } else {
                pesan = "Kode pendanaan PKM tidak valid";
            }
        } else {
            pesan = "Tidak mendapat penandaan";
        }
        System.out.println("Status mahasiswa "+namaMahasiswa+" : "+pesan);
        alden.close();
    }
}
