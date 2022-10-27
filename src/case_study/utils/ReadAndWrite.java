package case_study.utils;

import case_study.models.person.*;
import case_study.models.facility.*;

import java.io.*;
import java.util.*;

public class ReadAndWrite {
    public static void writeCustomer(LinkedList<Customer> customerList, String diaChi) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(diaChi))) {
            for (Customer customer : customerList) {
                bufferedWriter.write(customer.toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Customer> readCustomer(String diaChi) {
        List<Customer> customerList = new LinkedList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(diaChi))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                String[] lineArr = line.split(",");
                customerList.add(new Customer(lineArr[0], lineArr[1],
                        lineArr[2], Integer.parseInt(lineArr[3]), lineArr[4], lineArr[5],
                        lineArr[6], lineArr[7]));
            }
            return customerList;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void writeEmployee(ArrayList<Employee> employeeList, String diaChi) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(diaChi))) {
            for (Employee employee : employeeList) {
                bufferedWriter.write(employee.toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Employee> readEmployee(String diaChi) {
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(diaChi))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                String[] lineArr = line.split(",");
                employeeArrayList.add(new Employee(lineArr[0], lineArr[1], lineArr[2],
                        Integer.parseInt(lineArr[3]), lineArr[4], lineArr[5],
                        lineArr[6], lineArr[7], Integer.parseInt(lineArr[8])));
            }
            return employeeArrayList;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void writeVilla(Map<Villa, Integer> villaMap, String diaChi) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(diaChi))) {
            Set<Map.Entry<Villa, Integer>> villas = villaMap.entrySet();
            for (Map.Entry<Villa, Integer> villa : villas) {
                bufferedWriter.write(villa.getKey().toString());
                bufferedWriter.write(villa.getValue().toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<Villa,Integer> readVilla(String diaChi) {
        Map<Villa,Integer> villaMap = new LinkedHashMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(diaChi))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                String[] lineArr = line.split(",");
                Villa newVilla = new Villa(lineArr[0],Double.parseDouble(lineArr[1]),
                        Integer.parseInt(lineArr[2]),Integer.parseInt(lineArr[3]),
                        lineArr[4],lineArr[5],Double.parseDouble(lineArr[6]),Integer.parseInt(lineArr[7]));
                villaMap.put(newVilla,Integer.parseInt(lineArr[8]));
            }
            return villaMap;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void writeHouse(Map<House, Integer> houseMap, String diaChi) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(diaChi))) {
            Set<Map.Entry<House, Integer>> houses = houseMap.entrySet();
            for (Map.Entry<House, Integer> house : houses) {
                bufferedWriter.write(house.getKey().toString());
                bufferedWriter.write(house.getValue().toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<House,Integer> readFileHouse(String diaChi) {
        Map<House,Integer> houseMap = new LinkedHashMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(diaChi))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                String[] lineArr = line.split(",");
                House newHouse = new House(lineArr[0],Double.parseDouble(lineArr[1]),
                        Integer.parseInt(lineArr[2]),Integer.parseInt(lineArr[3]),
                        lineArr[4],lineArr[5],Integer.parseInt(lineArr[6]));
                houseMap.put(newHouse,Integer.parseInt(lineArr[7]));
            }
            return houseMap;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void writeRoom(Map<Room, Integer> roomMap, String diaChi) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(diaChi))) {
            Set<Map.Entry<Room, Integer>> rooms = roomMap.entrySet();
            for (Map.Entry<Room , Integer> room : rooms) {
                bufferedWriter.write(room.getKey().toString());
                bufferedWriter.write(room.getValue().toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<Room,Integer> readRoom(String diaChi) {
        Map<Room,Integer> roomMap = new LinkedHashMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(diaChi))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                String[] lineArr = line.split(",");

                Room newRoom = new Room(lineArr[0],Double.parseDouble(lineArr[1]),
                        Integer.parseInt(lineArr[2]),Integer.parseInt(lineArr[3]),
                        lineArr[4],lineArr[5]);
                roomMap.put(newRoom,Integer.parseInt(lineArr[6]));
            }
            return roomMap;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
