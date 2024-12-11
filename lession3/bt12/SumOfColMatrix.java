package lession3.bt12;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfColMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix row number: ");
        int row = sc.nextInt();

        System.out.print("Enter matrix column number: ");
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter element at row " + (i + 1) + " column " + (j + 1) + " : ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(new StringBuilder(Arrays.toString(matrix[i])));
        }

        System.out.print("Enter column number want to caculate sum: ");
        int colNumber = sc.nextInt();
        int colSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            colSum += matrix[i][colNumber - 1];
        }
        System.out.println("Sum of column " + (colNumber) + " is: " + colSum);
    }
}
