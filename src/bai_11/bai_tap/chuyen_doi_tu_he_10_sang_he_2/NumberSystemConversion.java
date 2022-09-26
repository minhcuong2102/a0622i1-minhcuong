package bai_11.bai_tap.chuyen_doi_tu_he_10_sang_he_2;

import java.util.*;

public class NumberSystemConversion {
    public static void DecimalToBinary(int input) {
        Stack<Integer> stack = new Stack<>();
        while (input != 0) {
            int surplus = input % 2;
            stack.push(surplus);
            input /= 2;
        }
        while (!(stack.isEmpty())) {
            System.out.print(stack.pop());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số: ");
        int num = sc.nextInt();
        System.out.println("Kết quả nhị phân là: ");
        NumberSystemConversion.DecimalToBinary(num);
    }
}
