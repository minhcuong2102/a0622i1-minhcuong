package com.codegym;
import java.util.Scanner;
class DaysOfMonth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tháng: ");
        int month = scanner.nextInt();
        String ngay;
        switch (month){
            case 2:
                ngay = "28 hoặc 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                ngay = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                ngay = "30";
                break;
            default:
                ngay = "";
        }
        if (!ngay.equals("")) System.out.printf("Tháng %d có %s ngày!", month, ngay);
        else System.out.print("Yêu cầu nhập lại!");
    }
}
