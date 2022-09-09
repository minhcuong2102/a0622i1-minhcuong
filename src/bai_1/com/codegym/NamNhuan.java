package com.codegym;
import java.util.Scanner;
public class NamNhuan {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        boolean isLeapYear = false;
        System.out.print("Nhập năm: ");
        int year = scanner.nextInt();

        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    isLeapYear = true;
                }
            }else {
                isLeapYear = true;
            }
        }
        if (isLeapYear){
            System.out.printf("%d là năm nhuận!", year);
        }else {
            System.out.printf("%d không phải là năm nhuận!", year);
        }
    }
}
