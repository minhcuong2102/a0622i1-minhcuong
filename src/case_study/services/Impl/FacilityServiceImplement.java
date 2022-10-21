package case_study.services.Impl;

import case_study.models.facility.House;
import case_study.models.facility.Room;
import case_study.models.facility.Villa;
import case_study.services.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImplement implements FacilityService {
    private static final FacilityServiceImplement manager3 = new FacilityServiceImplement();
    private static final Map<House, Integer> houseMap = new LinkedHashMap<>();
    private static final Map<Villa, Integer> villaMap = new LinkedHashMap<>();
    private static final Map<Room, Integer> roomMap = new LinkedHashMap<>();
    Scanner sc = new Scanner(System.in);

    public void display() {
        System.out.println("-----------VILLA LIST------------");
        for (int i = 0; i < 60; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("|%16s|%16s|%16s|%16s|%16s|%20s|%16s|%16s\n",
                "Tên dịch vụ", "Diện tích", "Giá thuê", "Giới hạn người", "Loại thuê", "Tiêu chuẩn phòng",
                "Diện tích hồ bơi", "Tầng");
        for (int i = 0; i < 60; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (Map.Entry<Villa, Integer> villa : villaMap.entrySet()) {
            System.out.printf("|%16s|%16s|%16s|%16s|%16s|%20s|%16s|%16s\n",
                    villa.getKey().getServiceName(), villa.getKey().getUsingArea(), villa.getKey().getRentCost(),
                    villa.getKey().getPersonCap(), villa.getKey().getRentType(), villa.getKey().getRoomStandard(),
                    villa.getKey().getPoolArea(), villa.getKey().getFloor());
        }
        System.out.println();


        System.out.println("-----------HOUSE LIST------------");
        for (int i = 0; i < 60; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("|%16s|%16s|%16s|%16s|%16s|%20s|%16s\n",
                "Tên dịch vụ", "Diện tích", "Giá thuê", "Giới hạn người", "Loại thuê", "Tiêu chuẩn phòng",
                "Diện tích hồ bơi");
        for (int i = 0; i < 60; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (Map.Entry<House, Integer> house : houseMap.entrySet()) {
            System.out.printf("|%16s|%16s|%16s|%16s|%16s|%20s|%16s\n",
                    house.getKey().getServiceName(), house.getKey().getUsingArea(), house.getKey().getRentCost(),
                    house.getKey().getPersonCap(), house.getKey().getRentType(), house.getKey().getRoomStandard(),
                    house.getKey().getPoolArea());
        }
        System.out.println();

        System.out.println("-----------ROOM LIST------------");
        for (int i = 0; i < 60; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("|%16s|%16s|%16s|%16s|%16s|%20s\n",
                "Tên dịch vụ", "Diện tích", "Giá thuê", "Giới hạn người", "Loại thuê", "Dịch vụ miễn phí");
        for (int i = 0; i < 60; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (Map.Entry<Room, Integer> room : roomMap.entrySet()) {
            System.out.printf("|%16s|%16s|%16s|%16s|%16s|%20s\n",
                    room.getKey().getServiceName(), room.getKey().getUsingArea(), room.getKey().getRentCost(),
                    room.getKey().getPersonCap(), room.getKey().getRentType(), room.getKey().getFreeService());
        }
        System.out.println();
    }

    @Override
    public void displayFacilitiesNeedMaintainance() {

    }

    @Override
    public void addNewVilla() {
        System.out.print("Nhập dịch vụ: ");
        String serviceName = sc.nextLine();
        System.out.print("Nhập diện tích: ");
        double usingArea = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập giá thuê: ");
        int rentCost = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập giới hạn người: ");
        int personCap = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập loại thuê: ");
        String rentType = sc.nextLine();
        System.out.print("Nhập tiêu chuẩn phòng: ");
        String roomStandard = sc.nextLine();
        System.out.print("Nhập diện tích hồ bơi: ");
        double poolArea = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập số tầng: ");
        int floor = Integer.parseInt(sc.nextLine());

        Villa villa = new Villa(serviceName, usingArea, rentCost, personCap, rentType, roomStandard, poolArea, floor);
        villaMap.put(villa, 0);
    }

    @Override
    public void addNewRoom() {
        System.out.print("Nhập dịch vụ: ");
        String serviceName = sc.nextLine();
        System.out.print("Nhập diện tích: ");
        double usingArea = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập giá thuê: ");
        int rentCost = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập giới hạn người: ");
        int personCap = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập loại thuê: ");
        String rentType = sc.nextLine();
        System.out.println("Nhập tên dịch vụ miễn phí: ");
        String freeService = sc.nextLine();

        Room room = new Room(serviceName, usingArea, rentCost, personCap, rentType, freeService);
        roomMap.put(room, 0);
    }

    @Override
    public void addNewHouse() {
        System.out.print("Nhập dịch vụ: ");
        String serviceName = sc.nextLine();
        System.out.print("Nhập diện tích: ");
        double usingArea = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập giá thuê: ");
        int rentCost = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập giới hạn người: ");
        int personCap = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập loại thuê: ");
        String rentType = sc.nextLine();
        System.out.print("Nhập tiêu chuẩn phòng: ");
        String roomStandard = sc.nextLine();
        System.out.print("Nhập diện tích hồ bơi: ");
        double poolArea = Double.parseDouble(sc.nextLine());

        House house = new House(serviceName, usingArea, rentCost, personCap, rentType, roomStandard, poolArea);
        houseMap.put(house, 0);
    }
}
