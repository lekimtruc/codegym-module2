package lession3.bt13;

import java.util.Arrays;
import java.util.Scanner;

public class PrincipalDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter square matrix size: ");
        int size = sc.nextInt();

        int[][] matrix = new int[size][size];

        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Enter element at row " +(i+1)+ " column " +(j+1)+ " : ");
                matrix[i][j] = sc.nextInt();
                if (i == j){
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println("Matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(new StringBuilder(Arrays.toString(matrix[i])));
        }
        System.out.println("Sum of Principal Diagonal is: " + sum);
    }
}
