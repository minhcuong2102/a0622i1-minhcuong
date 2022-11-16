package thi_lai.service;

import case_study.utils.ReadAndWrite;
import thi_lai.exception.NotFoundProductException;
import thi_lai.model.AuthenticPhone;
import thi_lai.model.Phone;
import thi_lai.model.PortablePhone;
import thi_lai.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.Scanner;

import static thi_lai.controller.Menu.menu;

public class Service {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<AuthenticPhone> authenticPhones = new ArrayList<>();
    static ArrayList<PortablePhone> portablePhones = new ArrayList<>();
    static ArrayList<Phone> phones = new ArrayList<>();

    public void addAuthenticPhone() {
        phones = ReadAndWriteFile.readPhone("E:\\Codegym\\module_2\\src\\thi_lai\\data\\mobiles1.csv");
        int id = 1;
        for (Phone phone : phones){
            if (phone != null){
                id++;
            }
        }
//        System.out.println("Nhập id: ");
//        try {
//            id = Integer.parseInt(sc.nextLine());
//        } catch (NumberFormatException e) {
//            System.out.println("Sai định dạng!");
//        }
        System.out.println("Nhập tên: ");
        String ten = sc.nextLine();
        int giaBan = 0;
        do {
            System.out.println("Nhập giá bán: ");
            try {
                giaBan = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Sai định dạng!");
            }
        } while (giaBan <= 0);
        int soLuong = 0;
        do {
            System.out.println("Nhập số lượng: ");
            try {
                soLuong = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Sai định dạng!");
            }
        } while (soLuong <= 0);
        System.out.println("Nhập nhà sản xuất: ");
        String nhaSanXuat = sc.nextLine();

        int thoiGian = 0;
        do {
            System.out.println("Nhập thời gian bảo hành: ");
            try {
                thoiGian = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Sai định dạng");
            }
        } while (thoiGian < 0 || thoiGian > 730);
        int luaChon = 0;
        String phamVi = "";
        do {
            System.out.println("Nhập phạm vi bảo hành (1. Toan Quoc, 2. Quoc Te): ");
            try {
                luaChon = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Sai định dạng!");
            }
            if (luaChon == 1) {
                phamVi = "Toan Quoc";
            } else if (luaChon == 2) {
                phamVi = "Quoc Te";
            }
        } while (luaChon > 2 || luaChon < 1);
        Phone phone = new AuthenticPhone(id, ten, giaBan, soLuong, nhaSanXuat, thoiGian, phamVi);
        phones.add(phone);
        ReadAndWriteFile.writePhone(phones, "E:\\Codegym\\module_2\\src\\thi_lai\\data\\mobiles1.csv");
        System.out.println("Đã thêm thành công!");
    }

    public void addPortablePhone() {
        phones = ReadAndWriteFile.readPhone("E:\\Codegym\\module_2\\src\\thi_lai\\data\\mobiles1.csv");
        int id = 1;
        for (Phone phone : phones){
            if (phone != null){
                id++;
            }
        }
//        System.out.println("Nhập id: ");
//        try {
//            id = Integer.parseInt(sc.nextLine());
//        } catch (NumberFormatException e) {
//            System.out.println("Sai định dạng!");
//        }
        System.out.println("Nhập tên: ");
        String ten = sc.nextLine();
        int giaBan = 0;
        do {
            System.out.println("Nhập giá bán: ");
            try {
                giaBan = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Sai định dạng!");
            }
        } while (giaBan <= 0);
        int soLuong = 0;
        do {
            System.out.println("Nhập số lượng: ");
            try {
                soLuong = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Sai định dạng!");
            }
        } while (soLuong <= 0);
        System.out.println("Nhập nhà sản xuất: ");
        String nhaSanXuat = sc.nextLine();
        System.out.println("Nhập quốc gia xách tay:");
        String quocGia = sc.nextLine();
        while (quocGia.equals("Viet Nam")) {
            System.out.println("Nhập tên nước khác: ");
            quocGia = sc.nextLine();
        }
        int luaChon = 0;
        String trangThai = "";
        do {
            System.out.println("Nhập trạng thái (1. Da sua chua, 2. Chua sua chua): ");
            luaChon = Integer.parseInt(sc.nextLine());
            if (luaChon == 1) {
                trangThai = "Da sua chua";
            } else if (luaChon == 2) {
                trangThai = "Chua sua chua";
            }
        } while (luaChon > 2 || luaChon < 1);
        Phone phone = new PortablePhone(id, ten, giaBan, soLuong, nhaSanXuat, quocGia, trangThai);
        phones.add(phone);
        ReadAndWriteFile.writePhone(phones, "E:\\Codegym\\module_2\\src\\thi_lai\\data\\mobiles1.csv");
        System.out.println("Đã thêm thành công!");
    }

    public static void deletePhone() throws NotFoundProductException {
        phones = ReadAndWriteFile.readPhone("E:\\Codegym\\module_2\\src\\thi_lai\\data\\mobiles1.csv");
        int id = 0;
        try {
            System.out.println("Nhập mã điện thoại: ");
            id = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Sai định dạng!");
        }
        boolean check1 = true;
        int choice = 0;
        for (Phone phone : phones) {
            if (id == phone.getId()) {
                System.out.println("Bạn có muốn xoá? (1. Có, 2. Không)");
                try {
                    choice = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e){
                    System.out.println("Sai định dạng!");
                }
                if (choice == 1) {
                    phones.remove(phone);
                    ReadAndWriteFile.writePhone(phones,"E:\\Codegym\\module_2\\src\\thi_lai\\data\\mobiles1.csv");
                } else if (choice == 2) {
                    System.out.println("Bạn đã không xoá.");
                    menu();
                }
                check1 = false;
                break;
            }
        }
        while (check1) {
            try {
                throw new NotFoundProductException("Không tìm thấy điện thoại, nhập lại: ");
            } catch (NotFoundProductException e){
                try {
                    System.out.println("Nhập mã điện thoại: ");
                    id = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException exception) {
                    System.out.println("Sai định dạng!");
                }
                for (Phone phone : phones) {
                    if (id == phone.getId()) {
                        System.out.println("Bạn có muốn xoá? (1. Có, 2. Không)");
                        try {
                            choice = Integer.parseInt(sc.nextLine());
                        } catch (NumberFormatException ex){
                            System.out.println("Sai định dạng!");
                        }
                        if (choice == 1) {
                            phones.remove(phone);
                            ReadAndWriteFile.writePhone(phones,"E:\\Codegym\\module_2\\src\\thi_lai\\data\\mobiles1.csv");
                        } else if (choice == 2) {
                            System.out.println("Bạn đã không xoá.");
                            menu();
                        }
                        check1 = false;
                        break;
                    }
                }
            }
        }
        displayList();
    }

    public static void displayList() {
        phones = ReadAndWriteFile.readPhone("E:\\Codegym\\module_2\\src\\thi_lai\\data\\mobiles1.csv");
        for (Phone phone : phones){
            System.out.println(phone.getInfo());
        }
    }

    public static void searchPhone() {
        phones = ReadAndWriteFile.readPhone("E:\\Codegym\\module_2\\src\\thi_lai\\data\\mobiles1.csv");
        int id = 0;
        boolean check = true;
        try {
            System.out.println("Nhập mã điện thoại: ");
            id = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Sai định dạng!");
        }
        for (Phone phone : phones) {
            if (id == phone.getId()) {
                System.out.println(phone.getInfo());
                check = false;
                break;
            }
        }
        while (check){
            try {
                throw new NotFoundProductException("Không tìm thấy!");
            } catch (NumberFormatException | NotFoundProductException e){
                try {
                    System.out.println("Nhập mã điện thoại: ");
                    id = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException exception) {
                    System.out.println("Sai định dạng!");
                }
                for (Phone phone : phones) {
                    if (id == phone.getId()) {
                        System.out.println(phone.getInfo());
                        check = false;
                        break;
                    }
                }
            }
        }
    }
}
