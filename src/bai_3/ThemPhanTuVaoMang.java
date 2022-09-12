package bai_3;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 5, 6, 4, 2, 8, 7, 9};
        System.out.println("Mảng ban đầu là: " + Arrays.toString(arr));

        System.out.print("Chọn phần tử muốn thêm: ");
        int ele = sc.nextInt();
        System.out.print("Chọn vị trí muốn thêm: ");
        int pos = sc.nextInt();

        for (int i = arr.length - 1; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = ele;

        System.out.print("Mảng mới là: " + Arrays.toString(arr));
    }
}
