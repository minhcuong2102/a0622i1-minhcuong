package bai_1.hello.src;

import java.util.Scanner;
class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Xin chào " + name + "!");
    }
}
