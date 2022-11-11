package thi_thuc_hanh.utils;

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
        boolean check = true;
        do {
            try {
                if (Pattern.matches("^(?:(?:31([/\\-.])(?:0?[13578]|1[02]))\\1|(?:(?:29|30)([/\\-.])(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29([/\\-.])0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])([/\\-.])(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$", input)) {
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
