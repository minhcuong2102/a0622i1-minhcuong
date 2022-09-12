package bai_3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số phần tử cho mảng 1: ");
        int a = sc.nextInt();
        int[] mang1 = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.println("Nhập phần tử thứ " + i);
            mang1[i] = sc.nextInt();
        }

        System.out.print("Nhập số phần tử cho mảng 2: ");
        int b = sc.nextInt();
        int[] mang2 = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.println("Nhập phần tử thứ " + i);
            mang2[i] = sc.nextInt();
        }

        System.out.print("Mảng 1: " + Arrays.toString(mang1));
        System.out.print("Mảng 2: " + Arrays.toString(mang2));

        int[] mang3 = new int[mang1.length + mang2.length];
        for (int i = 0; i < mang1.length; i++) {
            mang3[i] = mang1[i];
        }
        for (int j = 0; j < mang2.length; j++) {
            mang3[j + mang1.length] = mang2[j];
        }

        System.out.print("Mảng 3: " + Arrays.toString(mang3));
    }
}
