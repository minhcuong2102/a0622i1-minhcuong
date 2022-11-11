package thi_thuc_hanh.model;

import java.util.Date;

public class Truck extends Vehicle{
    private int trongTai;

    public Truck(String id, String ten, String hangSanXuat,
                 Date namSanXuat, int congSuat, int dungTich, int trongTai) {
        super(id, ten, hangSanXuat, namSanXuat, congSuat, dungTich);
        this.trongTai = trongTai;
    }

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }

    public String getInfo(){
        return getData() + "," + this.getTrongTai();
    }

    @Override
    public String toString() {
        return super.toString() + ", trongTai=" + trongTai;
    }
}
