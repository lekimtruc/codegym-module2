package lession12.bt4;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Product {
    private Long id;
    private String name;
    private int price;

    public Product() {
    }

    public Product(Long id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public static void addProduct(Scanner sc, List<Product> listProduct) {
        System.out.print("Enter product id: ");
        Long id = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter product name: ");
        String name = sc.nextLine();
        System.out.print("Enter product price: ");
        int price = sc.nextInt();
        sc.nextLine();

        Product newProduct = new Product(id, name, price);
        listProduct.add(newProduct);
        System.out.println("Add product successful!!!");
    }

    public static void updateProduct(Scanner sc, List<Product> listProduct) {
        System.out.print("Enter product id want to update: ");
        Long id = sc.nextLong();
        sc.nextLine();
        for (int i = 0; i < listProduct.size(); i++) {
            boolean getProductById = (id == listProduct.get(i).getId());
            if (getProductById) {
                System.out.print("Enter product name: ");
                String name = sc.nextLine();
                listProduct.get(i).setName(name);

                System.out.print("Enter product price: ");
                int price = sc.nextInt();
                sc.nextLine();
                listProduct.get(i).setPrice(price);
            }
        }
    }

    public static void deleteProduct(Scanner sc, List<Product> listProduct) {
        System.out.print("Enter product id want to delete: ");
        Long id = sc.nextLong();
        sc.nextLine();
        for (int i = 0; i < listProduct.size(); i++) {
            boolean getProductById = (id == listProduct.get(i).getId());
            if (getProductById) {
                listProduct.remove(i);
            }
        }
    }

    public static void listAllProducts(List<Product> listProduct) {
        System.out.println("List all products: ");
        for (Product product : listProduct) {
            System.out.println(product);
        }
    }

    public static void search(Scanner sc, List<Product> listProduct){
        System.out.print("Enter product name want to search: ");
        sc.nextLine();
        String name = sc.nextLine();
        for (int i = 0; i < listProduct.size(); i++) {
            boolean getProductByName = (name.equals(listProduct.get(i).getName()));
            if (getProductByName) {
                System.out.println(listProduct.get(i));
                break;
            }
        }
    }

    public static void sortProductByPriceAsc(Scanner sc, List<Product> listProduct){
        sc.nextLine();
        listProduct.sort(Comparator.comparingInt(Product::getPrice));
        listAllProducts(listProduct);
    }

    public static void sortProductByPriceDesc(Scanner sc, List<Product> listProduct){
        sc.nextLine();
        listProduct.sort(Comparator.comparingInt(Product::getPrice).reversed());
        listAllProducts(listProduct);
    }
}
