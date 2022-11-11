package thi_thuc_hanh.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NguoiDangKy {
    private String soDangKy;
    private String tenChuDangKy;
    private Date ngayDangKy;
    private String id;
    private Truck truck;
    private Car car;
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

    public NguoiDangKy(String soDangKy, String tenChuDangKy, Date ngayDangKy, String id, Truck truck) {
        this.soDangKy = soDangKy;
        this.tenChuDangKy = tenChuDangKy;
        this.ngayDangKy = ngayDangKy;
        this.id = id;
        this.truck = truck;
    }

    public NguoiDangKy(String soDangKy, String tenChuDangKy, Date ngayDangKy, String id, Car car) {
        this.soDangKy = soDangKy;
        this.tenChuDangKy = tenChuDangKy;
        this.ngayDangKy = ngayDangKy;
        this.id = id;
        this.car = car;
    }

    public String getSoDangKy() {
        return soDangKy;
    }

    public void setSoDangKy(String soDangKy) {
        this.soDangKy = soDangKy;
    }

    public String getTenChuDangKy() {
        return tenChuDangKy;
    }

    public void setTenChuDangKy(String tenChuDangKy) {
        this.tenChuDangKy = tenChuDangKy;
    }

    public Date getNgayDangKy() {
        return ngayDangKy;
    }

    public void setNgayDangKy(Date ngayDangKy) {
        this.ngayDangKy = ngayDangKy;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Truck getTruck() {
        return truck;
    }

    public void setTruck(Truck truck) {
        this.truck = truck;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getInfoTruck(){
        return soDangKy + "," + tenChuDangKy + "," + df.format(ngayDangKy) + "," + id + "," + truck.getInfo();
    }

    public String getInfoCar(){
        return soDangKy + "," + tenChuDangKy + "," + df.format(ngayDangKy) + "," + id + "," + car.getInfo();
    }

    public String toStringTruck() {
        return "NguoiDangKy{" +
                "soDangKy='" + soDangKy + '\'' +
                ", tenChuDangKy='" + tenChuDangKy + '\'' +
                ", ngayDangKy=" + df.format(ngayDangKy) +
                truck +
                '}';
    }

    public String toStringCar() {
        return "NguoiDangKy{" +
                "soDangKy='" + soDangKy + '\'' +
                ", tenChuDangKy='" + tenChuDangKy + '\'' +
                ", ngayDangKy=" + df.format(ngayDangKy) +
                car +
                '}';
    }
}
