package thi_thu.service;

import thi_thu.exception.IDInvalidException;
import thi_thu.model.AccountLessor;
import thi_thu.model.AccountRenter;
import thi_thu.utils.ReadAndWriteFile;
import thi_thu.utils.Regex;
import thi_thu.utils.Validate;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import static thi_thu.controller.Menu.menu;

public class Controller {
    public ArrayList<AccountRenter> renterList = new ArrayList<>();
    public ArrayList<AccountLessor> lessorList = new ArrayList<>();

    private static final Scanner sc = new Scanner(System.in);
    private static final String CCCD_REGEX = "^[0-9]{12}$";
    final static String REGEX_BIRTHDAY = "(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/](0[13578]|1[02]))|((29|30)[\\/](0[4,6,9]|11)))[\\/](19|[2-9][0-9])\\d\\d$)|(^29[\\/]02[\\/](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)";


    private String inputCccd() {
        return Regex.regexStr(sc.nextLine(), CCCD_REGEX, "CCCD phải gồm chuỗi 12 chữ số, vui lòng nhập lại: ");
    }

    public boolean checkExistCccd(String input) {
        for (AccountRenter acc : renterList) {
            if (input.equals(acc.getCccd())) {
                return true;
            }
        }
        for (AccountLessor acc : lessorList) {
            if (input.equals(acc.getCccd())) {
                return true;
            }
        }
        return false;
    }

    public void addAccountRenter() {
        System.out.print("Nhập CCCD: ");
        String cccd = inputCccd();
        while (checkExistCccd(cccd)) {
            System.out.println("CCCD này đã tồn tại, vui lòng nhập lại: ");
            cccd = sc.nextLine();
        }
        System.out.print("Nhập tên: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        Date birthday = null;
        while (birthday == null) {
            System.out.println("Nhập ngày sinh: ");
            String dateAsString = sc.nextLine();
            try {
                birthday = Validate.validateDate(dateAsString);
            } catch (IDInvalidException e) {
                System.out.println(e.getMessage());
            }

            if (birthday == null) {
                System.out.println("Vui lòng nhập đúng định dạng dd/mm/YYYY: ");
            }
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String ngaySinh = simpleDateFormat.format(birthday);
        System.out.print("Nhập giới tính (0 - NỮ, 1 - Nam): ");
        int gioiTinh = 0;
        try {
            gioiTinh = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Sai định dạng!");
        }
        System.out.print("Nhập trạng thái (true - đã giao dịch, false - chưa giao dịch): ");
        boolean trangThai = Boolean.parseBoolean(sc.nextLine());
        System.out.print("Nhập diện tích lớn nhất: ");
        float maxDienTich = 0.0f;
        try {
            maxDienTich = Float.parseFloat(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Sai định dạng!");
        }
        System.out.print("Nhập diện tích nhỏ nhất: ");
        float minDienTich = 0.0f;
        try {
            minDienTich = Float.parseFloat(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Sai định dạng!");
        }
        System.out.print("Nhập giá tiền nhỏ nhất: ");
        int minGiaTien = 0;
        try {
            minGiaTien = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Sai định dạng!");
        }
        System.out.print("Nhập giá tiền lớn nhất: ");
        int maxGiaTien = 0;
        try {
            maxGiaTien = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Sai định dạng!");
        }

        AccountRenter renter = new AccountRenter(cccd, hoTen, ngaySinh, gioiTinh, trangThai,
                maxDienTich, minDienTich, minGiaTien, maxGiaTien);
        renterList.add(renter);
    }
    public void addRenterToFile(){
        ReadAndWriteFile.writeRenter(renterList, "E:\\Codegym\\module_2\\src\\thi_thu\\data\\renter.csv");
    }

    public void addAccountLessor() {
        System.out.print("Nhập CCCD: ");
        String cccd = inputCccd();
        while (checkExistCccd(cccd)) {
            System.out.println("CCCD này đã tồn tại, vui lòng nhập lại: ");
            cccd = sc.nextLine();
        }
        System.out.print("Nhập tên: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        Date birthday = null;
        while (birthday == null) {
            System.out.println("Nhập ngày sinh: ");
            String dateAsString = sc.nextLine();
            try {
                birthday = Validate.validateDate(dateAsString);
            } catch (IDInvalidException e) {
                System.out.println(e.getMessage());
            }

            if (birthday == null) {
                System.out.println("vui lòng nhập đúng định dạng dd/mm/YYYY: ");
            }
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String ngaySinh = simpleDateFormat.format(birthday);
        System.out.print("Nhập giới tính (0 - NỮ, 1 - Nam): ");
        int gioiTinh = 0;
        try {
            gioiTinh = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Sai định dạng!");
        }
        System.out.print("Nhập trạng thái (true - đã giao dịch, false - chưa giao dịch): ");
        boolean trangThai = Boolean.parseBoolean(sc.nextLine());
        System.out.print("Nhập diện tích: ");
        float dienTich = 0.0f;
        try {
            dienTich = Float.parseFloat(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Sai định dạng!");
        }
        System.out.print("Nhập địa chỉ nhà cho thuê: ");
        String diaChi = sc.nextLine();
        System.out.print("Nhập số người tối đa: ");
        int soNguoi = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập giá tiền cho thuê: ");
        int giaTien = Integer.parseInt(sc.nextLine());

        AccountLessor lessor = new AccountLessor(cccd, hoTen, ngaySinh, gioiTinh, trangThai, dienTich, diaChi, soNguoi, giaTien);
        lessorList.add(lessor);
    }

    public void addLessorToFile(){
        ReadAndWriteFile.writeLessor(lessorList, "E:\\Codegym\\module_2\\src\\thi_thu\\data\\lessor.csv");
    }

    public void display() {
        System.out.println("1. Hiển thị renter.\n" +
                "2. Hiển thị lessor.\n" +
                "3. Thoát.\n" +
                "Lựa chọn: ");
        int choice = 0;
        try {
            choice = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Sai định dạng!");
        }
        switch (choice) {
            case 1:
                for (AccountRenter renter : renterList) {
                    System.out.println(renter.toString());
                }
                break;

            case 2:
                for (AccountLessor lessor : lessorList) {
                    System.out.println(lessor.toString());
                }
                break;

            case 3:
                menu();
                break;
        }
    }

    public void deleteRenterAccount() {
        System.out.println("1. Xoá renter.\n" +
                "2. Xoá lessor.\n" +
                "3. Thoát.\n" +
                "Lựa chọn: ");
        int choice = 0;
        try {
            choice = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Sai định dạng!");
        }
        switch (choice) {
            case 1:
                System.out.println("nhập CCCD account bạn muốn xóa: ");
                String checkId = inputCccd();
                boolean flag = false;
                for (AccountRenter account : renterList) {
                    if (checkId.equals(account.getCccd())) {
                        System.out.println("Bạn có muốn account có mã IDCard là " + checkId + " không?");
                        System.out.println("1: Có.");
                        System.out.println("2: Không.");
                        int checkDel = sc.nextInt();
                        switch (checkDel) {
                            case 1:
                                renterList.remove(account);
                                System.out.println("Đã xóa thành công");
                                break;
                            case 2:
                                System.out.println("Không xóa");
                                break;
                        }
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    System.out.println("Không tồn tại account có mã IDcard là " + checkId);
                }
                display();
                break;

            case 2:
                System.out.println("nhập CCCD account bạn muốn xóa: ");
                String checkId1 = inputCccd();
                boolean flag1 = false;
                for (AccountLessor account : lessorList) {
                    if (checkId1.equals(account.getCccd())) {
                        System.out.println("Bạn có muốn account có mã IDCard là " + checkId1 + " không?");
                        System.out.println("1: Có.");
                        System.out.println("2: Không.");
                        int checkDel = sc.nextInt();
                        switch (checkDel) {
                            case 1:
                                lessorList.remove(account);
                                System.out.println("Đã xóa thành công");
                                break;
                            case 2:
                                System.out.println("Không xóa");
                                break;
                        }
                        flag1 = true;
                        break;
                    }
                }
                if (!flag1) {
                    System.out.println("Không tồn tại account có mã IDcard là " + checkId1);
                }
                display();
                break;
            case 3:
                menu();
        }
    }

    public void readRenter(){
        renterList = ReadAndWriteFile.readRenter("E:\\Codegym\\module_2\\src\\thi_thu\\data\\renter.csv");
    }

    public void readLessor() {
        lessorList = ReadAndWriteFile.readLessor("E:\\Codegym\\module_2\\src\\thi_thu\\data\\lessor.csv");
    }
}
