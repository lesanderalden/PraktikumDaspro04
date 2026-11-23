package Pertemuan12;

import java.util.Arrays;

public class ArrayBilangan04 {
    public static void main(String[] args) {
        int[] bil = new int[4];
        bil[0] = 4;
        bil[1] = 4+8;
        bil[2] = -(1+(4%7));
        bil[3] = 20+(4%15);

        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil["+i+"] = "+bil[i]);
        }

        for (int nilai : bil) {
            System.out.println(nilai);
        }

        System.out.println(Arrays.toString(bil));
    }
}
