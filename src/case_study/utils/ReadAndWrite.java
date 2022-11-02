package case_study.utils;

import case_study.models.booking.Booking;
import case_study.models.person.*;
import case_study.models.facility.*;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ReadAndWrite {
    private static SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

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

    public static LinkedList<Customer> readCustomer(String diaChi) {
        LinkedList<Customer> customerList = new LinkedList<>();
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

    public static Map<Villa, Integer> readVilla(String diaChi) {
        Map<Villa, Integer> villaMap = new LinkedHashMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(diaChi))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                String[] lineArr = line.split(",");
                Villa newVilla = new Villa(Integer.parseInt(lineArr[0]), lineArr[1], Double.parseDouble(lineArr[2]),
                        Integer.parseInt(lineArr[3]), Integer.parseInt(lineArr[4]),
                        lineArr[5], lineArr[6], Double.parseDouble(lineArr[7]), Integer.parseInt(lineArr[8]));
                villaMap.put(newVilla, Integer.parseInt(lineArr[9]));
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

    public static Map<House, Integer> readHouse(String diaChi) {
        Map<House, Integer> houseMap = new LinkedHashMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(diaChi))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                String[] lineArr = line.split(",");
                House newHouse = new House(Integer.parseInt(lineArr[0]), lineArr[1], Double.parseDouble(lineArr[2]),
                        Integer.parseInt(lineArr[3]), Integer.parseInt(lineArr[4]),
                        lineArr[5], lineArr[6], Integer.parseInt(lineArr[7]));
                houseMap.put(newHouse, Integer.parseInt(lineArr[8]));
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
            for (Map.Entry<Room, Integer> room : rooms) {
                bufferedWriter.write(room.getKey().toString());
                bufferedWriter.write(room.getValue().toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<Room, Integer> readRoom(String diaChi) {
        Map<Room, Integer> roomMap = new LinkedHashMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(diaChi))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                String[] lineArr = line.split(",");

                Room newRoom = new Room(Integer.parseInt(lineArr[0]), lineArr[1], Double.parseDouble(lineArr[2]),
                        Integer.parseInt(lineArr[3]), Integer.parseInt(lineArr[4]),
                        lineArr[5], lineArr[6]);
                roomMap.put(newRoom, Integer.parseInt(lineArr[7]));
            }
            return roomMap;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static int readBookingCount(String diaChi,String service) {
        int count =0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(diaChi))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                String[] lineArr = line.split(",");
                for (String element : lineArr) {
                    if (element.equals(service)) {
                        count++;
                    }
                }
            }
            return count;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static void writeBooking(TreeSet<Booking> bookingList, String diaChi) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(diaChi))) {
            for (Booking booking : bookingList) {
                bufferedWriter.write(booking.toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static TreeSet<Booking> readBooking(String fileAddress) {

        TreeSet<Booking> bookingList = new TreeSet<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileAddress))) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                String[] lineArr = line.split(",");
                bookingList.add(new Booking(Integer.parseInt(lineArr[0]), df.parse(lineArr[1]),
                        df.parse(lineArr[2]),Integer.parseInt(lineArr[3]),lineArr[4],lineArr[5]));
            }
            return bookingList;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
