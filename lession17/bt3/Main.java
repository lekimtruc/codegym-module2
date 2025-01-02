package lession17.bt3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static lession12.bt4.Product.addProduct;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        int choice = -1;

        while (choice != 0) {
            System.out.println("========Menu========");
            System.out.println("1. Add product");
            System.out.println("2. Search product");
            System.out.println("3. List all products");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    addProduct(sc);
                    break;
                case 2:
                    searchProduct(sc);
                    break;
                case 3:
                    List<Product> productsFromFile = listProduct();
                    for (Product product : productsFromFile) {
                        System.out.println(product);
                    }
                    break;
                default:
                    System.out.println("No choice!!!");
            }
        }
    }

    private static List<Product> listProduct() {
        List<Product> products = new ArrayList<>();
        String path = "D:\\codegym\\module 2\\baitap\\lession17\\bt3\\products.txt";

        try (
                FileInputStream fis = new FileInputStream(path);
                ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            products = (List<Product>) ois.readObject();
            System.out.println("Từ hàm list" +products);
        } catch (IOException e) {
            e.getStackTrace();
        } catch (Exception e) {
            e.getStackTrace();
        }
        return products;
    }

    private static void searchProduct(Scanner sc) {
        System.out.print("Nhập tên sản phẩm muốn tìm: ");
        sc.nextLine();
        String tenSanPham = sc.nextLine();
        List<Product> products = listProduct();

        for (Product product : products) {
            if (product.getTenSanPham().equals(tenSanPham)) {
                System.out.println(product);
            }
        }
    }

    private static void addProduct(Scanner sc) {
        String path = "D:\\codegym\\module 2\\baitap\\lession17\\bt3\\products.txt";
        try (
                FileOutputStream fos = new FileOutputStream(path);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
        ) {
            System.out.print("Nhập mã sản phẩm: ");
            int maSanPham = sc.nextInt();
            sc.nextLine();
            System.out.print("Nhập tên sản phẩm: ");
            String tenSanPham = sc.nextLine();
            System.out.print("Nhập giá: ");
            int price = sc.nextInt();
            sc.nextLine();
            System.out.print("Nhập hàng sản xuất: ");
            String hangSanXuat = sc.nextLine();
            System.out.print("Nhập mô tả: ");
            String moTa = sc.nextLine();

            List<Product> products = listProduct();
            System.out.println(products);
            Product product = new Product(maSanPham, tenSanPham, price, hangSanXuat, moTa);
            products.add(product);
            System.out.println(products);
            oos.writeObject(products);
            System.out.println("Add successful!!!");
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
