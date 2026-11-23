package Pertemuan12;

import java.util.Arrays;

public class ArrayBilangan04 {
    public static void main(String[] args) {
        int[] bil = {4, 4+8, -(1+(4%7)), 20+(4%15)};

        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i] + ", double = " + (bil[i] * 2));
        }

        for (int nilai : bil) {
            System.out.println(nilai);
        }

        System.out.println(Arrays.toString(bil));
    }
}
