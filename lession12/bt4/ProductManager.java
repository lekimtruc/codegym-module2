package lession12.bt4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private static List<Product> listProduct = new ArrayList<>();
    private static Product product = new Product();

    static {
        Product product1 = new Product(1L, "banh", 10000);
        Product product2 = new Product(2L, "keo", 5000);
        Product product3 = new Product(3L, "nuoc", 12000);
        Product product4 = new Product(4L, "kem", 15000);
        Product product5 = new Product(5L, "sua", 20000);

        listProduct.add(product1);
        listProduct.add(product2);
        listProduct.add(product3);
        listProduct.add(product4);
        listProduct.add(product5);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("========Menu========");
            System.out.println("1. Add product");
            System.out.println("2. Update product info");
            System.out.println("3. Delete product");
            System.out.println("4. Search product");
            System.out.println("5. List all products");
            System.out.println("6. Sort product by price asc");
            System.out.println("7. Sort product by price desc");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    Product.addProduct(sc, listProduct);
                    break;
                case 2:
                    Product.updateProduct(sc, listProduct);
                    break;
                case 3:
                    Product.deleteProduct(sc, listProduct);
                    break;
                case 4:
                    Product.search(sc, listProduct);
                    break;
                case 5:
                    Product.listAllProducts(listProduct);
                    break;
                case 6:
                    Product.sortProductByPriceAsc(sc, listProduct);
                    break;
                case 7:
                    Product.sortProductByPriceDesc(sc, listProduct);
                    break;
                default:
                    System.out.println("No choice!!!");
                    break;
            }
        }
    }
}
