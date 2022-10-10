package bai_13.bai_tap.tim_kiem_nhi_phan_de_quy;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchRecursion {
    public static int BinarySearch(int[] arr, int left, int right, int value) {
        while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] == value) {
                return middle;
            } else if (value > arr[middle]) {
                left = middle + 1;
                BinarySearch(arr, left, right, value);
            } else {
                right = middle - 1;
                BinarySearch(arr, left, right, value);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] > list[j]) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(list));

        System.out.print("Nhập giá trị cần tìm: ");
        int value = sc.nextInt();
        System.out.println("Giá trị trên tìm được ở vị trí " + BinarySearch(list, 0, list.length - 1, value));
    }
}
