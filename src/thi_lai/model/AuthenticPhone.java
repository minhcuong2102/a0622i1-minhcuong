package thi_lai.model;

public class AuthenticPhone extends Phone{
    private int thoiGian;
    private String phamVi;

    public AuthenticPhone(int id, String ten, int giaBan, int soLuong, String nhaSanXuat, int thoiGian, String phamVi) {
        super(id, ten, giaBan, soLuong, nhaSanXuat);
        this.thoiGian = thoiGian;
        this.phamVi = phamVi;
    }

    public int getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(int thoiGian) {
        this.thoiGian = thoiGian;
    }

    public String getPhamVi() {
        return phamVi;
    }

    public void setPhamVi(String phamVi) {
        this.phamVi = phamVi;
    }

    public String getInfo(){
        return getData() + "," + this.thoiGian + "," + this.phamVi;
    }

    @Override
    public String toString() {
        return "AuthenticPhone{" +
                "thoiGian=" + thoiGian +
                ", phamVi='" + phamVi + '\'' +
                '}';
    }
}
