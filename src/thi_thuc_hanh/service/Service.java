package thi_thuc_hanh.service;

import thi_thuc_hanh.exception.NotFoundSavingException;
import thi_thuc_hanh.model.Car;
import thi_thuc_hanh.model.NguoiDangKy;
import thi_thuc_hanh.model.Truck;
import thi_thuc_hanh.utils.ReadAndWriteFile;
import thi_thuc_hanh.utils.Regex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Service {
    Scanner sc = new Scanner(System.in);

    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    final String REGEX_SDK = "^[A-Z]\\d-\\d{4}$";
    final String REGEX_TEN = "^[a-zA-Z_ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶ" +
            "ẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợ" +
            "ụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ\\s]+$";
    ArrayList<NguoiDangKy> nguoiDangKyArrayList = new ArrayList<>();
    ArrayList<Car> cars = new ArrayList<>();
    ArrayList<Truck> trucks = new ArrayList<>();

    public String inputSDK() {
        return Regex.regexStr(sc.nextLine(), REGEX_SDK, "Sai định dạng, định dạng đúng là Yx-xxxx, với Y là chữ in hoa, x là số\n" +
                "Nhập lại: ");
    }
    public String inputName(){
        return Regex.regexStr(sc.nextLine(), REGEX_TEN, "Sai định dạng tên!\n" +
                "Nhập lại: ");
    }
    public boolean checkExist(String input) {
        for (NguoiDangKy nguoi : nguoiDangKyArrayList) {
            if (nguoi.getId().equals(input)) {
                return true;
            }
        }
        return false;
    }

    public void addTruck() {
        nguoiDangKyArrayList = ReadAndWriteFile.readNguoiDangKy("E:\\Codegym\\module_2\\src\\thi_thuc_hanh\\data\\gdkpt.csv");
        trucks = ReadAndWriteFile.readTruck("E:\\Codegym\\module_2\\src\\thi_thuc_hanh\\data\\phuongTienTruck.csv");
        for (Truck truck : trucks){
            System.out.println(truck);
        }
        System.out.print("Nhập mã người dùng: ");
        String soDangKy = inputSDK();
        while (checkExist(soDangKy)) {
            System.out.println("Số đã tồn tại, vui lòng nhập lại: ");
            soDangKy = sc.nextLine();
        }
        System.out.println("Nhập tên đăng ký: ");
        String tenNguoiDangKy = inputName();
        System.out.println("Nhập ngày đăng ký: ");
        Date ngayDangKy = null;
        try {
            ngayDangKy = df.parse(Regex.regexAge(sc.nextLine()));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.print("Nhập mã phương tiện: ");
        String id = sc.nextLine();
        boolean check = true;
        for (Truck truck : trucks){
            String maPhuongTien = truck.getMaPhuongTien();
            System.out.println(maPhuongTien);
            if (id.equals(maPhuongTien)){
                nguoiDangKyArrayList.add(new NguoiDangKy(soDangKy, tenNguoiDangKy, ngayDangKy, id, truck));
                System.out.println("Đã đăng ký thành công!");
                check = false;
                break;
            }
        }

        while (check){
            System.out.println("Không tìm thấy mã phương tiện\n" +
                    "Nhập lại: ");
            id = sc.nextLine();
            for (Truck truck : trucks){
                System.out.println(truck.getMaPhuongTien());
                if (id.equals(truck.getMaPhuongTien())){
                    nguoiDangKyArrayList.add(new NguoiDangKy(soDangKy, tenNguoiDangKy, ngayDangKy, id, truck));
                    System.out.println("Đã đăng ký thành công!");
                    check = false;
                    break;
                }
            }
        }
        ReadAndWriteFile.writeNguoiDangKy(nguoiDangKyArrayList, "E:\\Codegym\\module_2\\src\\thi_thuc_hanh\\data\\gdkpt.csv");
    }

    public void addCar() {
        nguoiDangKyArrayList = ReadAndWriteFile.readNguoiDangKy("E:\\Codegym\\module_2\\src\\thi_thuc_hanh\\data\\gdkpt.csv");
        System.out.print("Nhập mã người dùng: ");
        String soDangKy = inputSDK();
        while (checkExist(soDangKy)) {
            System.out.println("Số đã tồn tại, vui lòng nhập lại: ");
            soDangKy = sc.nextLine();
        }
        System.out.println("Nhập tên đăng ký: ");
        String tenNguoiDangKy = inputName();
        System.out.println("Nhập ngày đăng ký: ");
        Date ngayDangKy = null;
        try {
            ngayDangKy = df.parse(Regex.regexAge(sc.nextLine()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        cars = ReadAndWriteFile.readCar("E:\\Codegym\\module_2\\src\\thi_thuc_hanh\\data\\phuongTienCar.csv");

        System.out.println("Nhập mã phương tiện: ");
        String id = sc.nextLine();
        boolean check = true;
        for (Car car : cars){
            if (car.getMaPhuongTien().equals(id)){
                nguoiDangKyArrayList.add(new NguoiDangKy(soDangKy, tenNguoiDangKy, ngayDangKy, id, car));
                check = false;
                break;
            }
        }
        while (check){
            System.out.println("Không tìm thấy mã phương tiện\n" +
                    "Nhập lại: ");
            id = sc.nextLine();
            for (Car car : cars){
                if (car.getMaPhuongTien().equals(id)){
                    nguoiDangKyArrayList.add(new NguoiDangKy(soDangKy, tenNguoiDangKy, ngayDangKy, id, car));
                    check = false;
                    break;
                }
            }
        }
        ReadAndWriteFile.writeNguoiDangKy(nguoiDangKyArrayList, "E:\\Codegym\\module_2\\src\\thi_thuc_hanh\\data\\gdkpt.csv");
    }

    public void displayNDKList() {
        nguoiDangKyArrayList = ReadAndWriteFile.readNguoiDangKy("E:\\Codegym\\module_2\\src\\thi_thuc_hanh\\data\\gdkpt.csv");
        for (NguoiDangKy nguoiDangKy : Objects.requireNonNull(nguoiDangKyArrayList)) {
            nguoiDangKy.toStringTruck();
            if (nguoiDangKy.getTruck() != null){
                System.out.println(nguoiDangKy.toStringTruck());
            } else if (nguoiDangKy.getCar() != null){
                System.out.println(nguoiDangKy.toStringCar());
            } else System.out.println("Không tìm thấy!");
            System.out.println();
        }
    }

    public void unregister() {
        nguoiDangKyArrayList = ReadAndWriteFile.readNguoiDangKy("E:\\Codegym\\module_2\\src\\thi_thuc_hanh\\data\\gdkpt.csv");
        boolean notFound = false;
        System.out.println("Nhập số đăng ký: ");
        String soDangKy = inputSDK();
        for (NguoiDangKy nguoiDangKy : nguoiDangKyArrayList) {
            if (nguoiDangKy.getSoDangKy().equals(soDangKy)) {
                System.out.println("Bạn có muốn xoá? (1. Có, 2. Không)");
                int choice = 0;
                try {
                    choice = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e){
                    System.out.println("Sai định dạng!");
                }
                switch (choice){
                    case 1:
                        nguoiDangKyArrayList.remove(nguoiDangKy);
                        ReadAndWriteFile.writeNguoiDangKy(nguoiDangKyArrayList, "E:\\Codegym\\module_2\\src\\thi_thuc_hanh\\data\\gdkpt.csv");
                        System.out.println("Đã xoá người đăng ký!");
                        break;

                    case 2:
                        System.out.println("Không xoá.");
                        break;
                }
                notFound = true;
            }
        }
        if (notFound) {
            try {
                throw new NotFoundSavingException("Không tìm thấy!");
            } catch (NotFoundSavingException e) {
                e.printStackTrace();
            }
        }
        displayNDKList();
    }
}
