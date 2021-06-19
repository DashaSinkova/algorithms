package grokaemalgoritmi;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {10, 3, -1, 1, 8, -5, -20, 20, 0};
        System.out.println(Arrays.toString(quickSort(arr)));
    }
    public static int[] quickSort(int[] array) {
        if (array.length < 2) {
            return array;
        }
        return sort(array, 0, array.length - 1);
    }
    private static int[] sort(int[] array, int left, int right) {
        if (right <= left) {
            return array;
        }
        int i = left;
        int j = right;
        int pivotIndex = (left + right) / 2;
        int pivot = array[pivotIndex];
        do {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int t = array[i];
                array[i] = array[j];
                array[j] = t;
                i++;
                j--;
            }
        } while (i <= j);
        sort(array, i, right);
        sort(array, left, j);

        return array;
    }
}
