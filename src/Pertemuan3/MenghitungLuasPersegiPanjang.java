package Pertemuan3;
import java.util.Scanner;

public class MenghitungLuasPersegiPanjang {
    public static void main(String[] args) {
        int panjang;
        int lebar;
        int luas;
        Scanner alden = new Scanner(System.in);

        panjang=alden.nextInt();
        lebar=alden.nextInt();
        luas=panjang*lebar;

        System.out.println("Luas persegi adalah " +luas);
        alden.close();
    }
}
