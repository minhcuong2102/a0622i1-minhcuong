package thi_lai.model;

public abstract class Phone {
    private int id;
    private String ten;
    private int giaBan;
    private int soLuong;
    private String nhaSanXuat;

    public Phone(int id, String ten, int giaBan, int soLuong, String nhaSanXuat) {
        this.id = id;
        this.ten = ten;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.nhaSanXuat = nhaSanXuat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public abstract String getInfo();

    public String getData(){
        return this.id + "," + this.ten + "," + this.giaBan + "," + this.soLuong + "," + this.nhaSanXuat;
    }

    @Override
    public String toString() {
        return "ten='" + ten + '\'' +
                ", giaBan=" + giaBan +
                ", soLuong=" + soLuong +
                ", nhaSanXuat='" + nhaSanXuat;
    }
}
