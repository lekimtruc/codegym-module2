package lession3.bt11;

import java.util.Scanner;

public class CountPassedStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of student: ");
        int numberStudent = sc.nextInt();
        if (numberStudent > 30) {
            System.out.println("Number of student must to <=30");
        } else {
            double[] arr = new double[numberStudent];
            int passedStudent = 0;

            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter score of student " + (i + 1) + " : ");
                arr[i] = sc.nextDouble();
                if (arr[i] >= 5) {
                    passedStudent++;
                }
            }
            System.out.println("Number of passed student is: " + passedStudent);
        }
    }
}
