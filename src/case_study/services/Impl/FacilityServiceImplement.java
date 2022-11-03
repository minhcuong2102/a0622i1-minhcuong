package case_study.services.Impl;

import case_study.models.facility.Facility;
import case_study.models.facility.House;
import case_study.models.facility.Room;
import case_study.models.facility.Villa;
import case_study.services.FacilityService;
import case_study.utils.ReadAndWrite;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import case_study.utils.RegexData;

import static case_study.controllers.FuramaController.facilityManage;

public class FacilityServiceImplement implements FacilityService {
    private static Map<House, Integer> houseMap = new LinkedHashMap<>();
    private static Map<Villa, Integer> villaMap = new LinkedHashMap<>();
    private static Map<Room, Integer> roomMap = new LinkedHashMap<>();
    private static final Map<Facility, Integer> facilityMap = new LinkedHashMap<>();
    Scanner sc = new Scanner(System.in);
    private static final String REGEX_SERVICE_NAME = "^[A-Z]\\w+$";
    private static final String REGEX_STANDARD = "^[A-Z]\\w+$";
    private static final String REGEX_AREA = "^([3-9][1-9]\\d*)|([1-9][0-9]\\d+)$";
    private static final String REGEX_COST = "^(\\d)([,]|[.]|\\d+)+$";
    private static final String REGEX_MAXIMUM_PEOPLE = "^[1-9]|([1][0-9])$";
    private static final String REGEX_FLOOR = "^\\d+$";
    private static final String REGEX_VILLA_ID = "^(SVVL)-\\d{4}$";
    private static final String REGEX_HOUSE_ID = "^(SVHO)-\\d{4}$";
    private static final String REGEX_ROOM_ID = "^(SVRO)-\\d{4}$";
    private static int villaCount = 0;
    private static int houseCount = 0;
    private static int roomCount = 0;

    public void display() {
        System.out.println("-----------VILLA LIST------------");
        for (int i = 0; i < 100; i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.printf("|%16s|%16s|%16s|%16s|%16s|%20s|%16s|%16s\n",
                "Tên dịch vụ", "Diện tích", "Giá thuê", "Giới hạn người", "Loại thuê", "Tiêu chuẩn phòng",
                "Diện tích hồ bơi", "Tầng");
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println();
        villaMap = ReadAndWrite.readVilla("E:\\Codegym\\module_2\\src\\case_study\\data\\villa.csv");
        assert villaMap != null;
        Set<Map.Entry<Villa, Integer>> villas = villaMap.entrySet();
        for (Map.Entry<Villa, Integer> villa : villas) {
            System.out.printf("|%16s|%16s|%16s|%16s|%16s|%20s|%16s|%16s\n",
                    villa.getKey().getServiceName(), villa.getKey().getUsingArea(), villa.getKey().getRentCost(),
                    villa.getKey().getPersonCap(), villa.getKey().getRentType(), villa.getKey().getRoomStandard(),
                    villa.getKey().getPoolArea(), villa.getKey().getFloor());
        }
        System.out.println();


        System.out.println("-----------HOUSE LIST------------");
        for (int i = 0; i < 100; i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.printf("|%4s|%16s|%16s|%16s|%16s|%16s|%20s|%16s\n",
                "STT", "Tên dịch vụ", "Diện tích", "Giá thuê", "Giới hạn người",
                "Loại thuê", "Tiêu chuẩn phòng", "Diện tích hồ bơi");
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println();
        houseMap = ReadAndWrite.readHouse("E:\\Codegym\\module_2\\src\\case_study\\data\\house.csv");
        assert houseMap != null;
        Set<Map.Entry<House, Integer>> houses = houseMap.entrySet();
        for (Map.Entry<House, Integer> house : houses) {
            System.out.printf("|%4s|%16s|%16s|%16s|%16s|%16s|%20s|%16s\n",
                    house.getKey().getId(), house.getKey().getServiceName(), house.getKey().getUsingArea(),
                    house.getKey().getRentCost(), house.getKey().getPersonCap(), house.getKey().getRentType(),
                    house.getKey().getRoomStandard(), house.getKey().getPoolArea());
        }
        System.out.println();

        System.out.println("-----------ROOM LIST------------");
        for (int i = 0; i < 100; i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.printf("|%4s|%16s|%16s|%16s|%16s|%16s|%20s\n",
                "STT", "Tên dịch vụ", "Diện tích", "Giá thuê",
                "Giới hạn người", "Loại thuê", "Dịch vụ miễn phí");
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println();
        roomMap = ReadAndWrite.readRoom("E:\\Codegym\\module_2\\src\\case_study\\data\\room.csv");
        assert roomMap != null;
        Set<Map.Entry<Room, Integer>> rooms = roomMap.entrySet();
        for (Map.Entry<Room, Integer> room : rooms) {
            System.out.printf("|%4s|%16s|%16s|%16s|%16s|%16s|%20s\n",
                    room.getKey().getId(), room.getKey().getServiceName(), room.getKey().getUsingArea(),
                    room.getKey().getRentCost(), room.getKey().getPersonCap(), room.getKey().getRentType(),
                    room.getKey().getFreeService());
        }
        System.out.println();
    }

    @Override
    public void displayFacilitiesNeedMaintainance() {
        if (villaMap.size() >= 5 || houseMap.size() >= 5 || roomMap.size() >= 5) {
            if (villaMap.size() >= 5) {
                facilityMap.putAll(villaMap);
            }
            if (houseMap.size() >= 5) {
                facilityMap.putAll(houseMap);
            }
            if (roomMap.size() >= 5) {
                facilityMap.putAll(roomMap);
            }
        }
        System.out.printf("|%-10s|%-5s|\n", "Dịch vụ cần bảo trì", "Số lần sử dụng");
        Set<Map.Entry<Facility, Integer>> listFacilityNeedMaintenance = facilityMap.entrySet();
        for (Map.Entry<Facility, Integer> element : listFacilityNeedMaintenance) {
            System.out.printf("|%-10s|%-5d|\n", element.getKey().getServiceName(), element.getValue());
        }
    }

    private String inputName() {
        System.out.println("Nhập tên dịch vụ: ");
        return RegexData.regexStr(sc.nextLine(), REGEX_SERVICE_NAME,
                "Sai định dạng, tên dịch vụ phải bắt đầu bằng chữ viết in hoa.\n" +
                "Nhập lại tên: ");
    }

    private String inputStandard() {
        System.out.println("Nhập tiêu chuẩn phòng: ");
        return RegexData.regexStr(sc.nextLine(), REGEX_STANDARD,
                "Sai định dạng, tên tiêu chuẩn phòng phải được viết hoa chữ cái đầu.\n" +
                "Nhập lại tiêu chuẩn phòng:");
    }
    private String inputArea(String name) {
        System.out.println("Nhập " + name + ": ");
        return RegexData.regexStr(sc.nextLine(), REGEX_AREA,
                "Sai định dạng, diện tích phải là số thực lớn hơn 30 mét vuông.\n" +
                        "Vui lòng nhập lại:");
    }
    private String inputCost() {
        System.out.println("Vui lòng nhập chi phí thuê: ");
        return RegexData.regexStr(sc.nextLine(), REGEX_COST,
                "Sai định dạng, chi phí thuê phải là số dương.\n" +
                        "Vui lòng nhập lại:");
    }
    private String inputFloor() {
        System.out.println("Vui lòng nhập số tầng: ");
        return RegexData.regexStr(sc.nextLine(), REGEX_FLOOR,
                "Sai định dạng, diện tích phải là số thực lớn hơn 30 mét vuông.\n" +
                        "Vui lòng nhập lại!");
    }

    private String inputID(String name) {
        if (name.equals("villa")) {
            System.out.println("Vui lòng nhập id villa: ");
            return RegexData.regexStr(sc.nextLine(), REGEX_VILLA_ID,
                    "Sai định dạng, mã dịch vụ cho villa phải có dạng: SVVL-XXXX (với X là các số từ 0-9).\n" +
                            "Vui lòng nhập lại: ");
        } else if (name.equals("house")) {
            System.out.println("Vui lòng nhập id house:");
            return RegexData.regexStr(sc.nextLine(), REGEX_HOUSE_ID,
                    "Sai định dạng, mã dịch vụ cho house phải có dạng: SVHO-XXXX (với X là các số từ 0-9).\n" +
                            "Vui lòng nhập lại: ");
        }else {
            System.out.println("Vui lòng nhập id Room:");
            return RegexData.regexStr(sc.nextLine(), REGEX_ROOM_ID,
                    "Sai định dạng, mã dịch vụ cho room phải có dạng: SVRO-XXXX (với X là các số từ 0-9).\n" +
                            "Vui lòng nhập lại: ");
        }
    }

    private String inputPeople() {
        System.out.println("Vui lòng nhập số lượng người tối đa: ");
        return RegexData.regexStr(sc.nextLine(), REGEX_MAXIMUM_PEOPLE,
                "Sai định dạng, số lượng người tối đa phải lớn hơn 0 và nhỏ hơn 20 người.\n" +
                        "Vui lòng nhập lại!");
    }


    public void add(){
        int choice1 = 0;
        System.out.print("Chọn cơ sở cần thêm: " +
                "1. Villa\t2. House\t3. Room\t4. Thoát\n" +
                "Nhập lựa chọn: ");
        try {
            choice1 = sc.nextInt();
        } catch (NumberFormatException e) {
            System.out.println("Nhập sai định dạng!");
        }
        switch (choice1) {
            case 1:
                System.out.println("-------Add villa-------\n");
                addNewVilla();

                break;

            case 2:
                System.out.println("-------Add house-------\n");
                addNewHouse();
                break;

            case 3:
                System.out.println("-------Add room-------\n");
                addNewRoom();
                break;

            case 4:
                facilityManage();
                break;

            default:
                System.out.println("Nhập số từ 1-4!");
                add();
                break;
        }
    }

    @Override
    public void addNewHouse() {
        houseCount++;
        int id = Integer.parseInt(inputID("house"));
        String nameService = inputName();
        double usingArea = Double.parseDouble(inputArea("diện tích sử dụng"));
        int rentCost = Integer.parseInt(inputCost());
        int personCap = Integer.parseInt(inputPeople());
        System.out.println("Chọn kiểu cho thuê:");
        String rentType = "";
        int luaChon = 0;
        do {
            System.out.println("1.\tThuê theo năm\n" +
                    "2.\tThuê theo tháng\n" +
                    "3.\tThuê theo ngày\n" +
                    "4.\tThuê theo giờ\n");
            System.out.print("Nhập lựa chọn: ");
            try {
                luaChon = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Sai định dạng");
            }
            switch (luaChon) {
                case 1:
                    rentType = "Năm";
                    break;
                case 2:
                    rentType = "Tháng";
                    break;
                case 3:
                    rentType = "Ngày";
                    break;
                case 4:
                    rentType = "Giờ";
                    break;
                default:
                    System.out.println("Nhập từ 1-4");
            }
        } while (luaChon < 1 || luaChon > 4);


        String roomStandard = inputStandard();

        int floor = Integer.parseInt(inputFloor());
        House house = new House(id, nameService, usingArea, rentCost, personCap, rentType, roomStandard, floor);

        houseMap.put(house, houseMap.size() + 1);
        ReadAndWrite.writeHouse(houseMap,"E:\\Codegym\\module_2\\src\\case_study\\data\\house.csv");
    }

    @Override
    public void addNewRoom() {
        roomCount++;
        int id = Integer.parseInt(inputID("room"));
        String serviceName = inputName();
        double usingArea = Double.parseDouble(inputArea("diện tích sử dụng"));
        int rentCost = Integer.parseInt(inputCost());
        int personCap = Integer.parseInt(inputPeople());
        System.out.println("Chọn kiểu cho thuê:");
        String rentType = "";
        int luaChon=0;
        do {
            System.out.println("1.\tThuê theo năm\n" +
                    "2.\tThuê theo tháng\n" +
                    "3.\tThuê theo ngày\n" +
                    "4.\tThuê theo giờ\n");
            System.out.println("Nhập lựa chọn của bạn:");
            try {
                luaChon = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại!");
            }
            switch (luaChon) {
                case 1:
                    rentType = "Năm";
                    break;
                case 2:
                    rentType = "Tháng";
                    break;
                case 3:
                    rentType = "Ngày";
                    break;
                case 4:
                    rentType = "Giờ";
                    break;
                default:
                    System.out.println("Vui lòng chỉ chọn số từ 1 đến 4");
            }
        } while (luaChon < 1 || luaChon > 4);

        System.out.println("Nhập dịch vụ miễn phí đi kèm:");
        String freeService = sc.nextLine();
        Room room = new Room(id, serviceName, usingArea, rentCost, personCap, rentType, freeService);

        roomMap.put(room, roomMap.size() + 1);
        ReadAndWrite.writeRoom(roomMap,"E:\\Codegym\\module_2\\src\\case_study\\data\\room.csv");
    }

    @Override
    public void addNewVilla() {
        int id = Integer.parseInt(inputID("villa"));
        String serviceName = inputName();
        double usingArea = Double.parseDouble(inputArea("diện tích sử dụng"));
        int rentCost = Integer.parseInt(inputCost());
        int personCap = Integer.parseInt(inputPeople());
        System.out.println("Chọn kiểu cho thuê:");
        String rentType = "";
        int luaChon = 0;

        do {
            System.out.println("1.\tThuê theo năm\n" +
                    "2.\tThuê theo tháng\n" +
                    "3.\tThuê theo ngày\n" +
                    "4.\tThuê theo giờ\n");
            System.out.println("Nhập lựa chọn của bạn:");
            try {
                luaChon = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại!");
            }
            switch (luaChon) {
                case 1:
                    rentType = "Năm";
                    break;
                case 2:
                    rentType = "Tháng";
                    break;
                case 3:
                    rentType = "Ngày";
                    break;
                case 4:
                    rentType = "Giờ";
                    break;
                default:
                    System.out.println("Vui lòng chỉ chọn số từ 1 đến 4");
            }
        } while (luaChon < 1 || luaChon > 4);

        String roomStandard = inputStandard();
        double poolArea = Double.parseDouble(inputArea("diện tích hồ bơi"));
        int floor = Integer.parseInt(inputFloor());

        Villa villa = new Villa(id,serviceName, usingArea, rentCost, personCap, rentType, roomStandard, poolArea, floor);
        villaCount = ReadAndWrite.readBookingCount("E:\\Codegym\\module_2\\src\\case_study\\data\\booking.csv","Villa");
        villaMap.put(villa, villaCount);
        ReadAndWrite.writeVilla(villaMap,"E:\\Codegym\\module_2\\src\\case_study\\data\\villa.csv");
    }
}
