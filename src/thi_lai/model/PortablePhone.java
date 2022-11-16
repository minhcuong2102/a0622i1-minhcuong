package thi_lai.model;

public class PortablePhone extends Phone {
    private String quocGia;
    private String trangThai;

    public PortablePhone(int id, String ten, int giaBan, int soLuong, String nhaSanXuat, String quocGia, String trangThai) {
        super(id, ten, giaBan, soLuong, nhaSanXuat);
        this.quocGia = quocGia;
        this.trangThai = trangThai;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getInfo() {
        return getData() + "," + this.quocGia + "," + this.trangThai;
    }

    @Override
    public String toString() {
        return "PortablePhone{" +
                "quocGia='" + quocGia + '\'' +
                ", trangThai='" + trangThai + '\'' +
                '}';
    }
}
