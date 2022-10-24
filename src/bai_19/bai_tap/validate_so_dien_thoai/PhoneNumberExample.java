package bai_19.bai_tap.validate_so_dien_thoai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExample {
    private static Pattern pattern;

    private static final String EMAIL_REGEX = "^[(]*[0-9]{2}+[)]-[(]+[0-9]{10}+[)]$";

    public PhoneNumberExample() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String regex) {
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
