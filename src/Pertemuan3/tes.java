package Pertemuan3;
import java.util.Scanner;

public class tes {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);
        System.out.print("Coba masukkan disini terserah :");
        String disini = alden.nextLine();
        System.out.println(disini);
        System.out.println(9%2);
        System.out.println(10%8);
        System.out.println(73%11);
        alden.close();
    }
}
