package thi_thu.utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
    public static Scanner sc = new Scanner(System.in);

    public static String regexStr(String input, String regex, String error) {
        boolean check = true;
        do {
            if (input.matches(regex)) {
                check = false;
            } else {
                System.out.println(error);
                input = sc.nextLine();
            }
        } while (check);
        return input;
    }

    public static String regexAge(String temp, String regex) {
        boolean check = true;
        while (check) {
            try {
                if (Pattern.matches(regex, temp)) {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate age = LocalDate.parse(temp, formatter);
                    LocalDate now = LocalDate.now();
                    int current = Period.between(age, now).getYears();
                    if (current < 100 && current > 18) {
                        check = false;
                    } else {
                        throw new AgeException("Tuổi phải lớn hơn 18 và bé hơn 100.");
                    }
                } else {
                    throw new AgeException("Định dạng nhập vào không đúng, vui lòng nhập đúng định dạng : dd/MM/YYYY.");
                }
            } catch (AgeException e) {
                System.out.println(e.getMessage());
                temp = sc.nextLine();
            }
        }
        return temp;
    }
}
