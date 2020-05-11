/**
 * Сортировка методом выбора
 */
package grokaemalgoritmi;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] mas = {2, 40, 0, 9, -1, -10};
        System.out.println(Arrays.toString(selectionSort(mas)));
    }
    public static int[] selectionSort(int[] arr) {
        int min;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int t = arr[i];
            arr[i] = arr[min];
            arr[min] = t;
        }

        return arr;
    }
}

