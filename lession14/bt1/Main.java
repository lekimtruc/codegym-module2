package lession14.bt1;

public class Main {
    public static void main(String[] args) {
        int[] list = BubbleSort.bubbleSort();
        for (int i = 0; i < list.length; i++) {
            System.out.println("list[" + i + "]: " + list[i]);
        }
    }
}
