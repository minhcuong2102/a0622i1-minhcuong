package thi_thuc_hanh.utils;

import thi_thuc_hanh.model.Car;
import thi_thuc_hanh.model.NguoiDangKy;
import thi_thuc_hanh.model.Truck;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class ReadAndWriteFile {
    static final SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    public static void writeNguoiDangKy(ArrayList<NguoiDangKy> nguoiDangKyArrayList, String file) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, false))) {
            for (NguoiDangKy nguoiDangKy : nguoiDangKyArrayList) {
                if (nguoiDangKy.getTruck() != null){
                    bufferedWriter.write(nguoiDangKy.getInfoTruck());
                }else {
                    bufferedWriter.write(nguoiDangKy.getInfoCar());
                }
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<NguoiDangKy> readNguoiDangKy(String file) {
        ArrayList<NguoiDangKy> nguoiDangKyArrayList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                String[] atribute = line.split(",");
                if (atribute[4].equals("Xe tải")){
                    Truck truck = new Truck(atribute[3], atribute[4], atribute[5],
                            df.parse(atribute[6]), Integer.parseInt(atribute[7]),
                            Integer.parseInt(atribute[8]), Integer.parseInt(atribute[9]));
                    nguoiDangKyArrayList.add(new NguoiDangKy(atribute[0], atribute[1], df.parse(atribute[2]), atribute[3], truck));
                    continue;
                }
                Car car = new Car(atribute[3], atribute[4], atribute[5],
                        df.parse(atribute[6]), Integer.parseInt(atribute[7]), Integer.parseInt(atribute[8]),
                        Integer.parseInt(atribute[9]), atribute[10]);
                nguoiDangKyArrayList.add(new NguoiDangKy(atribute[0], atribute[1], df.parse(atribute[2]), atribute[3], car));
            }
            return nguoiDangKyArrayList;
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<Truck> readTruck(String file) {
        ArrayList<Truck> trucks = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                String[] atribute = line.split(",");
                trucks.add(new Truck(atribute[0], atribute[1], atribute[2],
                        df.parse(atribute[3]), Integer.parseInt(atribute[4]),
                        Integer.parseInt(atribute[5]), Integer.parseInt(atribute[6])));
            }
            return trucks;
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<Car> readCar(String file) {
        ArrayList<Car> cars = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                String[] atribute = line.split(",");

                cars.add(new Car(atribute[0], atribute[1], atribute[2],
                        df.parse(atribute[3]), Integer.parseInt(atribute[4]), Integer.parseInt(atribute[5]),
                        Integer.parseInt(atribute[6]), atribute[7]));
            }
            return cars;
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
