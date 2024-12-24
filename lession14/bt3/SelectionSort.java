package lession14.bt3;

public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static double[] selectionSort() {
        for (int i = 0; i < list.length - 1; i++) {
            int minIndex = i;
            double min = list[i];
            for (int j = i + 1; j < list.length; j++) {
                if (list[minIndex] > list[j]) {
                    minIndex = j;
                    min = list[j];
                }
            }
            if (minIndex != i) {
                list[minIndex] = list[i];
                list[i] = min;
            }
        }
        return list;
    }
}
