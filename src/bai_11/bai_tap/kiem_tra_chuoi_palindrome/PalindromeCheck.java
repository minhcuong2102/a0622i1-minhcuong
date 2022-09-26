package bai_11.bai_tap.kiem_tra_chuoi_palindrome;

import java.util.*;

public class PalindromeCheck {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
        String input = "Able was I ere I saw Elba";
        input = input.toLowerCase();
        LinkedListQueue<Character> queue = new LinkedListQueue<>();

        for (int i = input.length() - 1; i >= 0; i--) {
            queue.enqueue(input.charAt(i));
        }

        String reverseString = "";
        while (!queue.isEmpty()) {
            reverseString += queue.dequeue();
        }
        if (input.equals(reverseString)) {
            System.out.println("Đây là chuỗi đối xứng!");
        } else {
            System.out.println("Đây không phải chuỗi đối xứng!");
        }
    }
}
