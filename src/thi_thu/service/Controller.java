package thi_thu.service;

import thi_thu.model.AccountLessor;
import thi_thu.model.AccountRenter;
import thi_thu.utils.ReadAndWriteFile;
import thi_thu.utils.Regex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static thi_thu.controller.Menu.menu;

public class Controller {
    public ArrayList<AccountRenter> renterList = new ArrayList<>();
    public ArrayList<AccountLessor> lessorList = new ArrayList<>();

    private static final Scanner sc = new Scanner(System.in);
    private static final String CCCD_REGEX = "^[0-9]{12}$";
    private final SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");


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
        Date ngaySinh = null;
        try {
            ngaySinh = df.parse(Regex.regexAge(sc.nextLine()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
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

    public void addRenterToFile() {
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
//        System.out.print("Nhập ngày sinh: ");
        Date ngaySinh = null;
        try {
            ngaySinh = df.parse(Regex.regexAge(sc.nextLine()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
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

    public void addLessorToFile() {
        ReadAndWriteFile.writeLessor(lessorList, "E:\\Codegym\\module_2\\src\\thi_thu\\data\\lessor.csv");
    }

    public void display() {
        int gioiTinh;
        boolean trangThai;
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
                System.out.println("-----------------------------------------Danh sách người thuê-------------------------------------------\n");
                for (int i = 0; i < 178; i++) {
                    System.out.print("-");
                }
                System.out.println();
                System.out.printf("|%-15s|%-15s|%-20s|%-16s|%-22s|%-20s|%-20s|%-20s|%-20s|\n", "CCCD", "Họ và tên", "Ngày sinh",
                        "Giới tính", "Trạng thái giao dịch", "Diện tích lớn nhất", "Diện tích nhỏ nhất",
                        "Giá tiền nhỏ nhất", "Giá tiền lớn nhất");
                for (int i = 0; i < 178; i++) {
                    System.out.print("-");
                }
                System.out.println();
                Collections.sort(renterList);
                for (AccountRenter renter : renterList) {
                    gioiTinh = renter.getGioiTinh();
                    trangThai = renter.isTrangThai();
                    System.out.printf("|%-15s|%-15s|%-20s|%-16s|%-22s|%-20s|%-20s|%-20s|%-20s|\n", renter.getCccd(), renter.getHoTen(),
                            df.format(renter.getNgaySinh()), renter.gioiTinh(gioiTinh), renter.trangThai(trangThai), renter.getMaxDienTich(),
                            renter.getMinDienTich(), renter.getMinGiaTien(), renter.getMaxGiaTien());
                    for (int i = 1; i < 178; i++) {
                        System.out.print("-");
                    }
                    System.out.println();
                }
                break;

            case 2:
                System.out.println("--------------------------------------Danh sách người cho thuê----------------------------------------\n");
                for (int i = 1; i < 156; i++) {
                    System.out.print("-");
                }
                System.out.println();
                System.out.printf("|%-15s|%-15s|%-20s|%-16s|%-22s|%-15s|%-12s|%-16s|%-15s|\n", "CCCD", "Họ và tên",
                        "Ngày sinh", "Giới tính", "Trạng thái giao dịch", "Diện tích nhà",
                        "Địa chỉ", "Số người tối đa", "Giá tiền");
                for (int i = 0; i < 156; i++) {
                    System.out.print("-");
                }
                System.out.println();
                Collections.sort(lessorList);
                for (AccountLessor lessor : lessorList) {
                    gioiTinh = lessor.getGioiTinh();
                    trangThai = lessor.isTrangThai();
                    System.out.printf("|%-15s|%-15s|%-20s|%-16s|%-22s|%-15s|%-12s|%-16s|%-15s|\n", lessor.getCccd(), lessor.getHoTen(),
                            df.format(lessor.getNgaySinh()), lessor.gioiTinh(gioiTinh), lessor.trangThai(trangThai), lessor.getDienTich(),
                            lessor.getDiaChi(), lessor.getSoNguoi(), lessor.getGiaTien());
                    for (int i = 1; i < 156; i++) {
                        System.out.print("-");
                    }
                    System.out.println();
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

    public void readRenter() {
        renterList = ReadAndWriteFile.readRenter("E:\\Codegym\\module_2\\src\\thi_thu\\data\\renter.csv");
    }

    public void readLessor() {
        lessorList = ReadAndWriteFile.readLessor("E:\\Codegym\\module_2\\src\\thi_thu\\data\\lessor.csv");
    }

    public void search() {
        renterList = ReadAndWriteFile.readRenter("E:\\Codegym\\module_2\\src\\thi_thu\\data\\renter.csv");
        System.out.print("Nhập CCCD: ");
        String cccd = inputCccd();
        boolean isEqual = false;
        for (AccountRenter renter : renterList){
            isEqual = renter.getCccd().equals(cccd);
        }
        while (!isEqual) {
            System.out.print("Số CCCD này không tồn tại.\n" +
                    "Nhập lại cccd: ");
            cccd = inputCccd();
        }
        float minDienTich = 0f;
        float maxDienTich = 0f;
        int minGiaTien = 0;
        int maxGiaTien = 0;
        ArrayList<AccountLessor> temp = new ArrayList<>();
        for (AccountRenter renter : renterList){
            if (renter.getCccd().equals(cccd)){
                minDienTich = renter.getMinDienTich();
                maxDienTich = renter.getMaxDienTich();
                minGiaTien = renter.getMinGiaTien();
                maxGiaTien = renter.getMaxGiaTien();
            }
        }
        for (AccountLessor lessor : lessorList){
            boolean condition1 = lessor.getDienTich() > minDienTich && lessor.getDienTich() <= maxDienTich;
            boolean condition2 = lessor.getGiaTien() > minGiaTien && lessor.getGiaTien() <= maxGiaTien;
            if (condition1 && condition2){
                temp.add(lessor);
            }
        }
        System.out.println("Danh sách người cho thuê cần tìm\n");
        for (int i = 0; i < 156; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("|%-15s|%-15s|%-20s|%-16s|%-22s|%-15s|%-12s|%-16s|%-15s|\n", "CCCD",
                "Họ và tên", "Ngày sinh", "Giới tính", "Trạng thái giao dịch", "Diện tích nhà",
                "Địa chỉ", "Số người tối đa", "Giá tiền");
        for (int i = 0; i < 156; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (AccountLessor account : temp) {
            System.out.printf("|%-15s|%-15s|%-20s|%-16s|%-22s|%-15f|%-12s|%-16d|%-15d|\n", account.getCccd(),
                    account.getHoTen(), df.format(account.getNgaySinh()), account.getGioiTinh(), account.isTrangThai(),
                    account.getDienTich(), account.getDiaChi(), account.getSoNguoi(), account.getGiaTien());
            for (int i = 0; i < 156; i++) {
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println();
    }
}
