package thi_thuc_hanh.model;

import java.util.Date;

public class Car extends Vehicle{
    private int soChoNgoi;
    private String loaiDongCo;

    public Car(String id, String ten, String hangSanXuat, Date namSanXuat,
               int congSuat, int dungTich, int soChoNgoi, String loaiDongCo) {
        super(id, ten, hangSanXuat, namSanXuat, congSuat, dungTich);
        this.soChoNgoi = soChoNgoi;
        this.loaiDongCo = loaiDongCo;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getLoaiDongCo() {
        return loaiDongCo;
    }

    public void setLoaiDongCo(String loaiDongCo) {
        this.loaiDongCo = loaiDongCo;
    }

    public String getInfo(){
        return getData() + "," + this.soChoNgoi + "," + this.loaiDongCo;
    }

    @Override
    public String toString() {
        return super.toString() + "soChoNgoi=" + soChoNgoi + ", loaiDongCo='" + loaiDongCo;
    }
}
