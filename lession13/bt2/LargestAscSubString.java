package lession13.bt2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargestAscSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String string = sc.nextLine();
        List<String> strings = new ArrayList();
        strings.add(String.valueOf(string.charAt(0)));
        String nextSmallString;

        for (int i = 0; i < string.length() - 1; i++) {
            if(string.charAt(i) < string.charAt(i+1)){
                nextSmallString = String.valueOf(string.charAt(i+1));
                strings.add(nextSmallString);
            }
        }

        System.out.println(String.join("", strings));
    }
}
