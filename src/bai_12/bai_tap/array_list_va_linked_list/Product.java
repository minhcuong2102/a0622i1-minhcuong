package bai_12.bai_tap.array_list_va_linked_list;

public class Product {
    private String name;
    private int id;
    private int price;

    public Product() {

    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tên sản phẩm: " + this.name + ", mã sản phầm: " + this.id + ", giá: " + this.price;
    }
}
