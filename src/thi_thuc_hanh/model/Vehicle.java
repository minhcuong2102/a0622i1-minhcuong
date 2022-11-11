package thi_thuc_hanh.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Vehicle {
    protected String maPhuongTien;
    protected String ten;
    protected String hangSanXuat;
    protected Date namSanXuat;
    protected int congSuat;
    protected int dungTich;
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

    public Vehicle(String maPhuongTien, String ten, String hangSanXuat, Date namSanXuat, int congSuat, int dungTich) {
        this.maPhuongTien = maPhuongTien;
        this.ten = ten;
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.congSuat = congSuat;
        this.dungTich = dungTich;
    }

    public String getMaPhuongTien() {
        return this.maPhuongTien;
    }

    public void setMaPhuongTien(String maPhuongTien) {
        this.maPhuongTien = maPhuongTien;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public Date getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(Date namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public abstract String getInfo();

    public String getData(){
        return this.getTen() + "," + this.getHangSanXuat() + "," + df.format(this.namSanXuat)
                + "," + this.getCongSuat() + "," + this.getDungTich();
    }

    @Override
    public String toString() {
        return "id=" + maPhuongTien + ", ten=" + ten +
                ", hangSanXuat=" + hangSanXuat+
                ", namSanXuat=" + df.format(namSanXuat) +
                ", congSuat=" + congSuat +
                ", dungTich=" + dungTich;
    }
}
