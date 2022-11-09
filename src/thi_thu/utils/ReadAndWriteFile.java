package thi_thu.utils;

import thi_thu.model.AccountLessor;
import thi_thu.model.AccountRenter;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class ReadAndWriteFile {
    static final SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    public static void writeRenter(ArrayList<AccountRenter> renterList, String file) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, false))) {
            for (AccountRenter renter : renterList) {
                bufferedWriter.write(renter.getInfo());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<AccountRenter> readRenter(String file) {
        ArrayList<AccountRenter> renterList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                String[] atribute = line.split(",");
                int gender = 2;
                if (atribute[3].equals("Nam")){
                    gender = 1;
                } else if (atribute[3].equals("Nữ")){
                    gender = 0;
                }
                boolean isStatus = false;
                if (atribute[4].equals("Đã giao dịch")){
                    isStatus = true;
                } else if (atribute[4].equals("Chưa giao dịch")){
                    isStatus = false;
                }
                renterList.add(new AccountRenter(atribute[0], atribute[1], df.parse(atribute[2]),
                        gender, isStatus, Float.parseFloat(atribute[5]),
                        Float.parseFloat(atribute[6]), Integer.parseInt(atribute[7]), Integer.parseInt(atribute[8])));
            }
            return renterList;
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void writeLessor(ArrayList<AccountLessor> lessorList, String file) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            for (AccountLessor renter : lessorList) {
                bufferedWriter.write(renter.toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<AccountLessor> readLessor(String file) {
        ArrayList<AccountLessor> lessorList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                String[] atribute = line.split(", ");
                int gender = 2;
                if (atribute[3].equals("Nam")){
                    gender = 1;
                } else if (atribute[3].equals("Nữ")){
                    gender = 0;
                }
                boolean isStatus = false;
                if (atribute[4].equals("Đã giao dịch")){
                    isStatus = true;
                } else if (atribute[4].equals("Chưa giao dịch")){
                    isStatus = false;
                }
                lessorList.add(new AccountLessor(atribute[0], atribute[1], df.parse(atribute[2]),
                        gender, isStatus, Float.parseFloat(atribute[5]),
                        atribute[6], Integer.parseInt(atribute[7]), Integer.parseInt(atribute[8])));
            }
            return lessorList;
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
