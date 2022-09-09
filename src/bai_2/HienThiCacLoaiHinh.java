package bai_2;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập lựa chọn: \n" +
                "1. Vẽ hình chữ nhật, 2. Vẽ tam giác vuông, 3. Vẽ tam giác cân, 4. Thoát.");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                int chieuDai, chieuRong;
                System.out.print("Nhập chiều dài: ");
                chieuDai = scanner.nextInt();
                System.out.print("Nhập chiều rộng: ");
                chieuRong = scanner.nextInt();
                for (int i = 0; i < chieuRong; i++) {
                    for (int j = 0; j < chieuDai; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Chọn kiểu dáng hình tam giác: \n" +
                        "1. Top-left, 2. Top-right, 3. Bottom-left, 4. Bottom-right.");
                int choice1 = scanner.nextInt();
                System.out.print("Nhập chiều cao: ");
                int chieuCao = scanner.nextInt();
                switch (choice1) {
                    case 1:
                        for (int i = chieuCao; i >= 1; i--) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print(" * ");
                            }
                            System.out.println();
                        }
                        break;

                    case 2:
                        for (int i = 0; i <= chieuCao; i++) {
                            for (int j = 0; j <= chieuCao - 1; j++) {
                                if (j >= i) {
                                    System.out.print(" *");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                            System.out.println();
                        }
                        break;

                    case 3:
                        for (int i = 1; i <= chieuCao; i++) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print(" * ");
                            }
                            System.out.println();
                        }
                        break;

                    case 4:
                        for (int i = 1; i <= chieuCao; i++) {
                            for (int j = 0; j <= chieuCao - 1; j++) {
                                if (j < chieuCao - i) {
                                    System.out.print("   ");
                                } else {
                                    System.out.print(" * ");
                                }
                            }
                            System.out.println();
                        }
                        break;
                }
            case 3:
                System.out.print("Nhập chiều cao: ");
                chieuCao = scanner.nextInt();
                for (int i = 1; i <= chieuCao; i++) {
                    for (int j = chieuCao; j > i; j--) {
                        System.out.print("   ");
                    }
                    for (int k = 1; k <= i * 2 - 1; k++) {
                        System.out.print(" * ");
                    }
                    System.out.println();
                }
                break;
            case 4:
                break;
        }
    }
}
