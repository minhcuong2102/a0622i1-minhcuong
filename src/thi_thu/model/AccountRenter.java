package thi_thu.model;

public class AccountRenter extends Account implements Comparable<AccountRenter>{
    private float minDienTich;
    private float maxDienTich;
    private int minGiaTien;
    private int maxGiaTien;

    public AccountRenter(){}
    public AccountRenter(String cccd, String hoTen, String ngaySinh,
                         int gioiTinh, boolean trangThai, float minDienTich,
                         float maxDienTich, int minGiaTien, int maxGiaTien) {
        super(cccd, hoTen, ngaySinh, gioiTinh, trangThai);
        this.minDienTich = minDienTich;
        this.maxDienTich = maxDienTich;
        this.minGiaTien = minGiaTien;
        this.maxGiaTien = maxGiaTien;
    }
    public AccountRenter(String string) {
        String[] data = string.split(",");
        setCccd(data[0]);
        setHoTen(data[1]);
        setNgaySinh((data[2]));
        setGioiTinh(Integer.parseInt(data[3]));
        setMinDienTich(Float.parseFloat(data[5]));
        setMaxDienTich(Float.parseFloat(data[6]));
        setMinGiaTien(Integer.parseInt(data[7]));
        setMaxGiaTien(Integer.parseInt(data[8]));
    }
    public float getMinDienTich() {
        return minDienTich;
    }

    public void setMinDienTich(float minDienTich) {
        this.minDienTich = minDienTich;
    }

    public float getMaxDienTich() {
        return maxDienTich;
    }

    public void setMaxDienTich(float maxDienTich) {
        this.maxDienTich = maxDienTich;
    }

    public int getMinGiaTien() {
        return minGiaTien;
    }

    public void setMinGiaTien(int minGiaTien) {
        this.minGiaTien = minGiaTien;
    }

    public int getMaxGiaTien() {
        return maxGiaTien;
    }

    public void setMaxGiaTien(int maxGiaTien) {
        this.maxGiaTien = maxGiaTien;
    }

    @Override
    public String getInfo() {
        return getData() + "," + minDienTich + "," + maxDienTich + "," + minGiaTien + "," + maxGiaTien;
    }

    public String toString() {
        return super.toString() + ", max diện tích: " + this.maxDienTich + "min diện tích: " + this.minDienTich
                + ", min giá tiền: " + this.minGiaTien + ", max giá tiền: " + this.maxGiaTien;
    }

    @Override
    public int compareTo(AccountRenter o) {
        return 0;
    }

    public int compareTo(Account account) {
        if (this.hoTen.equals(account.hoTen)) {
            return - this.ngaySinh.compareTo(account.ngaySinh);
        }
        return this.hoTen.compareTo(account.hoTen);
    }
}
