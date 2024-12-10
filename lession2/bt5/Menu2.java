package lession2.bt5;

import java.util.Scanner;

public class Menu2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        while (choice != 4){
            System.out.println("=====Menu=====");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("===Rectangle choice===");
                    System.out.print("Width: ");
                    int width = sc.nextInt();

                    System.out.print("Height: ");
                    int height = sc.nextInt();
                    for (int i = 0; i < width; i++) {
                        for (int j = 0; j < height; j++) {
                            if(j == height -1){
                                System.out.println("*");
                            }else{
                                System.out.print("*  ");
                            }
                        }
                    }
                    break;
                case 2:
                    int choice1 = -1;
                    System.out.println("===Square triangle choice===");
                    System.out.println("1. Corner square top-left");
                    System.out.println("2. Corner square top-right");
                    System.out.println("3. Corner square bottom-left");
                    System.out.println("4. Corner square bottom-right");
                    System.out.print("Enter your choice: ");
                    choice1 = sc.nextInt();
                    switch (choice1) {
                        case 1:
                            System.out.print("Height: ");
                            int triangle1Height = sc.nextInt();
                            for (int i = 0; i < triangle1Height; i++) {
                                for (int j = 0; j < triangle1Height; j++) {
                                    if (j < triangle1Height -1 - i) {
                                        System.out.print("*  ");
                                    } else if (j == triangle1Height -1 -i){
                                        System.out.println("*");
                                    }
                                }
                            }
                            break;
                        case 2:
                            System.out.print("Height: ");
                            int triangle2Height = sc.nextInt();
                            for (int i = 0; i < triangle2Height; i++) {
                                for (int j = 0; j < triangle2Height; j++) {
                                    if (j < i) {
                                        System.out.print("   ");
                                    } else{
                                        if (j == triangle2Height - 1){
                                            System.out.println("*");
                                        }else{
                                            System.out.print("*  ");
                                        }
                                    }
                                }
                            }
                            break;
                        case 3:
                            System.out.print("Height: ");
                            int triangle3Height = sc.nextInt();
                            for (int i = 0; i < triangle3Height; i++) {
                                for (int j = 0; j < triangle3Height; j++) {
                                    if (j != i) {
                                        System.out.print("*  ");
                                    } else {
                                        System.out.println("*");
                                        break;
                                    }
                                }
                            }
                            break;
                        case 4:
                            System.out.print("Height: ");
                            int triangle4Height = sc.nextInt();
                            for (int i = 0; i < triangle4Height; i++) {
                                for (int j = 0; j < triangle4Height; j++) {
                                    if (j < triangle4Height -1 - i) {
                                        System.out.print("   ");
                                    } else{
                                        if (j == triangle4Height - 1){
                                            System.out.println("*");
                                        }else{
                                            System.out.print("*  ");
                                        }
                                    }
                                }
                            }
                            break;
                    }
                    break;
                case 3:
                    System.out.println("===Isosceles triangle choice===");
                    System.out.print("Height: ");
                    int isoscelesTriangleHeight = sc.nextInt();
                    for (int i = 0; i < isoscelesTriangleHeight; i++) {
                        for (int j = 0; j < isoscelesTriangleHeight; j++) {
                            if (j != i) {
                                System.out.print("*  ");
                            } else {
                                System.out.println("*");
                                break;
                            }
                        }
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
