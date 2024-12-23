package lession11.bt4;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountStringMain {
    public static void main(String[] args) {
        CountString<String, Integer> countString = new CountString<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your string: ");
        String string = sc.nextLine();
        String[] stringArr = string.split(" ");

        for (String str : stringArr) {
            if(countString.constainsKey(str)){
                int value = countString.get(str);
                value += 1;
                countString.put(str, value);
            }else{
                countString.put(str, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : countString.entrySet()) {
            System.out.println("Chuỗi: " + entry.getKey() + ", Số lần xuất hiện: " +entry.getValue());
        }
    }
}
