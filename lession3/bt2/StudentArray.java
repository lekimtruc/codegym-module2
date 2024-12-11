package lession3.bt2;

import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên học sinh muốn tìm: ");
        String findName = sc.nextLine();

        String[] listName = {"Lê Minh A", "Dương Thị B", "Nguyễn Văn C"};
        for (int i = 0; i < listName.length; i++) {
            if (findName.equals(listName[i])){
                System.out.println("Tìm thấy tên: " +findName+ " tại vị trí index thứ " + i);
            }else{
                if(i == listName.length -1){
                    System.out.println("Không tìm thấy học sinh");
                }
            }
        }
    }
}
