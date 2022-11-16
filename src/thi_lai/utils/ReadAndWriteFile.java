package thi_lai.utils;

import thi_lai.model.AuthenticPhone;
import thi_lai.model.Phone;
import thi_lai.model.PortablePhone;
import thi_thu.model.AccountRenter;
import thi_thuc_hanh.model.NguoiDangKy;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;

public class ReadAndWriteFile {
    public static void writeAuthenticPhone(ArrayList<AuthenticPhone> authenticPhones, String file) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, false))) {
            for (AuthenticPhone phone : authenticPhones) {
                bufferedWriter.write(phone.getInfo());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<AuthenticPhone> readAuthenticPhone(String file) {
        ArrayList<AuthenticPhone> phones = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                String[] atribute = line.split(",");
                if (atribute[6].equals("Toan Quoc") || atribute[6].equals("Quoc Te")) {
                    phones.add(new AuthenticPhone(Integer.parseInt(atribute[0]), atribute[1], Integer.parseInt(atribute[2]),
                            Integer.parseInt(atribute[3]), atribute[4], Integer.parseInt(atribute[5]), atribute[6]));
                }
            }
            return phones;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void writePortablePhone(ArrayList<PortablePhone> portablePhones, String file) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, false))) {
            for (PortablePhone phone : portablePhones) {
                bufferedWriter.write(phone.getInfo());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<PortablePhone> readPortablePhone(String file) {
        ArrayList<PortablePhone> phones = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                String[] atribute = line.split(",");
                if (atribute[6].equals("Da sua chua") || atribute[6].equals("Chua sua chua")) {
                    phones.add(new PortablePhone(Integer.parseInt(atribute[0]), atribute[1], Integer.parseInt(atribute[2]),
                            Integer.parseInt(atribute[3]), atribute[4], atribute[5], atribute[6]));
                }
            }
            return phones;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<Phone> readPhone(String file) {
        ArrayList<Phone> phones = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                String[] atribute = line.split(",");
                if (atribute[6].equals("Toan Quoc") || atribute[6].equals("Quoc Te")) {
                    phones.add(new AuthenticPhone(Integer.parseInt(atribute[0]), atribute[1], Integer.parseInt(atribute[2]),
                            Integer.parseInt(atribute[3]), atribute[4], Integer.parseInt(atribute[5]), atribute[6]));
                } else {
                    phones.add(new PortablePhone(Integer.parseInt(atribute[0]), atribute[1], Integer.parseInt(atribute[2]),
                            Integer.parseInt(atribute[3]), atribute[4], atribute[5], atribute[6]));
                }
            }
            return phones;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void writePhone(ArrayList<Phone> phones, String file) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, false))) {
            for (Phone phone : phones) {
                bufferedWriter.write(phone.getInfo());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
