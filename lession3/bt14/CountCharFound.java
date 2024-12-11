package lession3.bt14;

import java.util.Scanner;

public class CountCharFound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        int count = 0;

        System.out.print("Enter character want to count: ");
        String input = sc.nextLine();
        char c = input.charAt(0);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c){
                count++;
            }
        }

        System.out.println("Character " +c+ " is found " +count+ " time");
    }
}
