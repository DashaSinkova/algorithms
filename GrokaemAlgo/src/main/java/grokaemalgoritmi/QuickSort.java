package grokaemalgoritmi;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {10, 3, -1, 1, 8, -5, -20, 20, 0};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] array, int left, int right) {
        if (left < right) {
            int index = partition(array, left, right);
            sort(array, index, right);
            sort(array, left, index - 1);
        }
    }

    private static int partition(int[] array, int left, int right) {
        int i = left;
        int j = right;
        int pivot = array[(left + right) / 2];
        while (i <= j) {
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
        }
        return i;
    }
}
