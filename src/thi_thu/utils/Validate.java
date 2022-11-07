package thi_thu.utils;

import thi_thu.exception.IDInvalidException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Validate {
    public static Date validateDate(String dateAsString) throws IDInvalidException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setLenient(false);
        Date result;
        try {
            result = format.parse(dateAsString);
        } catch (ParseException e) {
            System.out.println("Ngay sinh khong hop le. Format chua dung dd/MM/yyyy");
            return null;
        }
        Date now = new Date();
        if (now.getYear() - result.getYear() < 18) {
            throw new IDInvalidException("Account chua du 18 tuoi");
        }

        return result;
    }
}
