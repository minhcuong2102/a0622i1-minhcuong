package thi_thu.utils;

import thi_thu.exception.IDInvalidException;

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

    public static String regexAge(String input) {
        Boolean check = true;
        do {
            try {
                if (Pattern.matches("^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$", input)) {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate age = LocalDate.parse(input, formatter);
                    LocalDate now = LocalDate.now();
                    int current = Period.between(age, now).getYears();
                    if (current >= 18) {
                        check = false;
                    } else {
                        throw new IDInvalidException("Người cho thuê/ người thuê nhà phải đủ 18 tuổi!\n" +
                                "Vui lòng nhập lại: ");
                    }
                } else {
                    throw new IDInvalidException("Sai định dạng, định dạng đúng cho ngày sinh phải là dd/MM/yyyy.\n" +
                            "Vui lòng nhập lại: ");
                }
            } catch (IDInvalidException e) {
                System.out.println(e.getMessage());
                input = sc.nextLine();
            }
        } while (check);
        return input;
    }
}
