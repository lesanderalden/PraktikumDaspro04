package Pertemuan7;
import java.util.Scanner;

public class StudiKasus204 {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);
        String namaMahasiswa, jenisKegiatan;
        String pesan = "";
        int jumlahDokumen, peringkatJuara, kurangDokumen;

        System.out.print("Nama mahasiswa : ");
        namaMahasiswa = alden.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI) : ");
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
        } else {
            pesan = "Jenis Kegiatan tidak valid";
        }
        System.out.println("Status mahasiswa "+namaMahasiswa+" : "+pesan);
        alden.close();
    }
}
