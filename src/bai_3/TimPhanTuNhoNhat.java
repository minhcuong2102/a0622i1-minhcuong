package bai_3;

import java.util.Scanner;
import java.util.Arrays;

public class TimPhanTuNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.print("Nhập số phần tử: ");
        for (int i = 0; i < num; i++) {
            System.out.print("Nhập phần tử thứ " + i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Mảng đã cho: " + Arrays.toString(arr));

        int min = arr[0];
        for (int i = 0; i < num; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }

        System.out.print("Phần tử nhỏ nhất là: " + min);
    }
}
