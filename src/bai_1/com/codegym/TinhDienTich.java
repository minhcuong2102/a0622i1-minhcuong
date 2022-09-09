package com.codegym;

import java.util.Scanner;

class TinhDienTich {
    public static void main(String[] args) {
        float width, height;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        width = scanner.nextFloat();
        System.out.print("Nhập chiều rộng: ");
        height = scanner.nextFloat();
        float area = width * height;
        System.out.println("Diện tích là: " + area);
    }
}
