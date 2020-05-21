package grokaemalgoritmi;

import java.text.Format;
import java.util.Arrays;

public class Recursion {
    public static int arraySum(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
            int sum = arr[0] + arraySum(Arrays.copyOfRange(arr, 1, arr.length));
        return sum;
    }
    public static int count(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        return 1 + count(Arrays.copyOfRange(arr, 1, arr.length));
    }
    public static int max(int[] arr) {
        if (arr.length == 2) {
            return arr[0] > arr[1] ? arr[0] : arr[1];
        }
        int maxEl = max(Arrays.copyOfRange(arr, 1, arr.length));
        return arr[0] > maxEl ? arr[0] : maxEl;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2, 4, 12};
        System.out.println(String.format("Сумма элементов в массиве: %s, Кол-во элементов в массиве: %s", arraySum(arr), count(arr)));
        System.out.println("Максимальный элемент: " + max(arr));
    }
}
