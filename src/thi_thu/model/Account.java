package thi_thu.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Account {
    protected String cccd;
    protected String hoTen;
    protected Date ngaySinh;
    protected int gioiTinh;
    protected boolean trangThai = false;
    protected final SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");


    public Account() {}

    public Account(String cccd, String hoTen, Date ngaySinh, int gioiTinh, boolean trangThai) {
        this.cccd = cccd;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.trangThai = trangThai;
    }

    public Account(String string) {
        String[] data = string.split(",");
        setCccd(data[0]);
        setHoTen(data[1]);
        try {
            setNgaySinh(df.parse(data[2]));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        setGioiTinh(Integer.parseInt(data[3]));
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String gioiTinh(int gioiTinh) {
        if (gioiTinh == 0) {
            return "Nữ";
        } else if (gioiTinh == 1) {
            return "Nam";
        } else return "Nhập 0 hoặc 1";
    }

    public String trangThai(boolean trangThai) {
        if (trangThai) {
            return "Đã giao dịch";
        }
        return "Chưa giao dịch";
    }

    public abstract String getInfo();

    public String getData() {
        return getCccd() + "," + getHoTen() + "," + df.format(getNgaySinh()) + "," + gioiTinh(gioiTinh) + "," + trangThai(trangThai);
    }

    public String toString() {
        return "CCCD: " + cccd + ", họ tên: " + hoTen + ", ngày sinh: " + ngaySinh + ", giới tính: " + gioiTinh(gioiTinh) + ", trạng thái: " + trangThai(trangThai);
    }

    public int compareTo(Account account) {
        if (this.hoTen.equals(account.hoTen)) {
            return -this.ngaySinh.compareTo(account.ngaySinh);
        }
        return this.hoTen.compareTo(account.hoTen);
    }
}
