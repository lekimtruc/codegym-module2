package lession10.bt5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeveloperManagement {

    private static List<Developer> listDeveloper;

    static {
        Developer dev1 = new Developer(1L, "Truc", 23, "Java Dev", 3000);
        Developer dev2 = new Developer(2L, "Phung", 23, "C Dev", 3000);
        Developer dev3 = new Developer(3L, "Duong", 23, "C++ Dev", 3000);
        Developer dev4 = new Developer(4L, "Khanh", 23, "UI/UX", 3000);
        Developer dev5 = new Developer(5L, "Trang", 23, "Tester", 3000);

        listDeveloper = new ArrayList<>();
        listDeveloper.add(dev1);
        listDeveloper.add(dev2);
        listDeveloper.add(dev3);
        listDeveloper.add(dev4);
        listDeveloper.add(dev5);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("========Menu========");
            System.out.println("1. Add developer");
            System.out.println("2. Update developer info");
            System.out.println("3. Delete developer");
            System.out.println("4. Search developer");
            System.out.println("5. List all developers");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    addDeveloper(sc);
                    break;
                case 2:
                    updateDeveloper(sc);
                    break;
                case 3:
                    deleteDeveloper(sc);
                    break;
                case 4:
                    searchDeveloper(sc);
                    break;
                case 5:
                    System.out.println(listDeveloper);
                    break;
                default:
                    System.out.println("No choice!!!");
            }
        }
    }

    private static void searchDeveloper(Scanner sc) {
        System.out.print("Enter developer name want to search: ");
        sc.nextLine();
        String searchName = sc.nextLine();
        for (int i = 0; i < listDeveloper.size(); i++) {
            if (searchName.equals(listDeveloper.get(i).getName())) {
                System.out.println(listDeveloper.get(i));
            }
        }
    }

    private static void deleteDeveloper(Scanner sc) {
        System.out.print("Enter developer id want to delete: ");
        Long deleteId = sc.nextLong();
        for (int i = 0; i < listDeveloper.size(); i++) {
            if (deleteId == listDeveloper.get(i).getId()) {
                listDeveloper.remove(i);
                System.out.println("Delete successfull!");
            }
        }
    }

    private static void updateDeveloper(Scanner sc) {
        System.out.print("Enter developer id want to update: ");
        Long updateId = sc.nextLong();
        sc.nextLine();
        for (int i = 0; i < listDeveloper.size(); i++) {
            if (updateId == listDeveloper.get(i).getId()) {
                Developer updateDev = listDeveloper.get(i);
                System.out.print("Enter new name: ");
                String newName = sc.nextLine();
                updateDev.setName(newName);
                System.out.print("Enter new age: ");
                int newAge = sc.nextInt();
                sc.nextLine();
                updateDev.setAge(newAge);
                System.out.print("Enter new position: ");
                String newPosition = sc.nextLine();
                updateDev.setPosition(newPosition);
                System.out.print("Enter new salary: ");
                int newSalary = sc.nextInt();
                updateDev.setSalary(newSalary);
                System.out.println("Update successfull!");
            }
        }
    }

    private static void addDeveloper(Scanner sc) {
        System.out.print("Enter id: ");
        Long newId = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter name: ");
        String newName = sc.nextLine();
        System.out.print("Enter age: ");
        int newAge = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter position: ");
        String newPosition = sc.nextLine();
        System.out.print("Enter salary: ");
        int newSalary = sc.nextInt();
        Developer newDev = new Developer(newId, newName, newAge, newPosition, newSalary);
        listDeveloper.add(newDev);
        System.out.println("Add successfull!");
    }
}
