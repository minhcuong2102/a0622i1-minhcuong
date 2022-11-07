package thi_thu.utils;

import thi_thu.model.AccountLessor;
import thi_thu.model.AccountRenter;

import java.io.*;
import java.util.ArrayList;

public class ReadAndWriteFile {
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
                renterList.add(new AccountRenter(atribute[0], atribute[1], atribute[2],
                        Integer.parseInt(atribute[3]), Boolean.parseBoolean(atribute[4]), Float.parseFloat(atribute[5]),
                        Float.parseFloat(atribute[6]), Integer.parseInt(atribute[7]), Integer.parseInt(atribute[8])));
            }
            return renterList;
        } catch (IOException e) {
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
                lessorList.add(new AccountLessor(atribute[0], atribute[1], atribute[2],
                        Integer.parseInt(atribute[3]), Boolean.parseBoolean(atribute[4]), Float.parseFloat(atribute[5]),
                        atribute[6], Integer.parseInt(atribute[7]), Integer.parseInt(atribute[8])));
            }
            return lessorList;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
