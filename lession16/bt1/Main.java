package lession16.bt1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();

        SumInFile sumInFile = new SumInFile();
        sumInFile.readFileText(path);
    }
}
