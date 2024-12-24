package lession14.bt3;

public class Main {
    public static void main(String[] args) {
        double[] list = SelectionSort.selectionSort();
        for (int i = 0; i < list.length; i++) {
            System.out.println("list[" + i + "]: " + list[i]);
        }
    }
}
