package case_study.services.Impl;

import case_study.models.booking.Booking;
import case_study.models.contract.Contract;
import case_study.services.BookingService;
import case_study.services.ContractService;
import case_study.utils.ReadAndWrite;
import case_study.utils.RegexData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class BookingServiceImplement implements BookingService, ContractService {
    static Scanner sc = new Scanner(System.in);
    public static TreeSet<Booking> bookingList = new TreeSet<>();
    private static Queue<Contract> contractList = new ArrayDeque<>();
    private static final SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    private static final String REGEX_DATE = "^\\d{2}/\\d{2}/\\d{4}$";
    private static final String REGEX_SERVICE_NAME = "^[A-Z]\\w+$";

    public void addNew() throws ParseException{
        int bookingId = 0;
        int customerId = 0;

        try {
            System.out.print("Nhập mã booking: ");
            bookingId = Integer.parseInt(sc.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Sai định dạng!");
        }
        System.out.print("Nhập ngày booking: ");
        Date dayBegin = df.parse(RegexData.regexStr(sc.nextLine(),REGEX_DATE,
                "Sai định dạng, định dạng đúng cho ngày ngày bắt đầu phải là: dd/MM/yyyy\n" +
                        "Nhập lại: "));
        Date dayEnd = df.parse(RegexData.regexStr(sc.nextLine(),REGEX_DATE,
                "Sai định dạng, định dạng đúng cho ngày ngày kết thúc phải là: dd/MM/yyyy\n" +
                        "Nhập lại: "));
        try {
            System.out.println("Nhập mã khách hàng:");
            customerId = Integer.parseInt(sc.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Sai định dạng!");
        }
        System.out.println("Nhập tên dịch vụ:");
        String serviceName = RegexData.regexStr(sc.nextLine(), REGEX_SERVICE_NAME,
                "Sai định dạng, tên dịch vụ phải bắt đầu bằng chữ viết in hoa.\n" +
                        "Nhập lại: ");
        System.out.println("Nhập loại dịch vụ:");
        String serviceType = sc.nextLine();

        Booking booking = new Booking(bookingId, dayBegin, dayEnd, customerId, serviceName, serviceType);
        bookingList.add(booking);
        ReadAndWrite.writeBooking(bookingList,"E:\\Codegym\\module_2\\src\\case_study\\data\\booking.csv");
    }

    public void display(){

    }

    @Override
    public void addNewContracts() {

    }

    @Override
    public void displayContract() {

    }

    @Override
    public void editContract() {

    }
}
