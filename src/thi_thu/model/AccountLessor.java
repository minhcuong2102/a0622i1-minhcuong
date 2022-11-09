package thi_thu.model;

import java.util.Date;

public class AccountLessor extends Account implements Comparable<AccountLessor>{
    private float dienTich;
    private String diaChi;
    private int soNguoi;
    private int giaTien;

    public AccountLessor(String cccd, String hoTen, Date ngaySinh,
                         int gioiTinh, boolean trangThai, float dienTich,
                         String diaChi, int soNguoi, int giaTien) {
        super(cccd, hoTen, ngaySinh, gioiTinh, trangThai);
        this.dienTich = dienTich;
        this.diaChi = diaChi;
        this.soNguoi = soNguoi;
        this.giaTien = giaTien;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSoNguoi() {
        return soNguoi;
    }

    public void setSoNguoi(int soNguoi) {
        this.soNguoi = soNguoi;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }

    @Override
    public String getInfo() {
        return super.getData() + "," + dienTich + "," + diaChi + "," + soNguoi + "," + giaTien;
    }

    public String toString() {
        return super.toString() + ", diện tích: " + this.dienTich +
                ", địa chỉ: " + this.diaChi + ", số người: " + this.soNguoi + ", giá tiền: " + this.giaTien;
    }


    public int compareTo(AccountLessor account) {
        if (this.hoTen.equals(account.hoTen)) {
            return this.ngaySinh.compareTo(account.ngaySinh);
        }
        return this.hoTen.compareTo(account.hoTen);
    }
}
