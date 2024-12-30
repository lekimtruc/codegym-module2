package lession16.bt3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập đường dẫn file input: ");
        String srcFile = sc.nextLine();
        System.out.print("Nhập đường dẫn file output: ");
        String desFile = sc.nextLine();

        CopyFile.copyFile(srcFile, desFile);
    }
}
