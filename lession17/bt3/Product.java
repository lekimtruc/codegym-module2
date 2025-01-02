package lession17.bt3;

import java.io.Serializable;

public class Product implements Serializable{
    private int maSanPham;
    private String tenSanPham;
    private int price;
    private String hangSanXuat;
    private String moTa;

    public Product() {
    }

    public Product(int maSanPham, String tenSanPham, int price, String hangSanXuat, String moTa) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.price = price;
        this.hangSanXuat = hangSanXuat;
        this.moTa = moTa;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "Product{" +
                "maSanPham=" + maSanPham +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", price=" + price +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", moTa='" + moTa + '\'' +
                '}';
    }
}
