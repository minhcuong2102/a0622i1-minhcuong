package bai_3;

import java.util.Arrays;
import java.util.Scanner;

public class TimPhanTuLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        int row = sc.nextInt();
        System.out.print("Nhập số cột:");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Nhập phần tử thứ " + row + "-" + col + ": ");
                arr[i][j] = sc.nextInt();
            }
        }

        int max = arr[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }

        System.out.println("Phần tử lớn nhất của mảng là: " + max);
    }
}
