package grokaemalgoritmi;

import java.util.Arrays;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int res = search(new int[]{4, 6, 7, 10, 15}, 20);
        if (res >= 0) {
            System.out.println("Значение в списке расположена в позиции " + res);
        } else  {
            System.out.println("Значение не найдено");
        }
    }
    public static int search(int[] arr, int value) {
        if (arr.length == 1 && arr[0] != value) {
            return -1;
        } else {
            return binarySearch(arr, value, 0, arr.length - 1);
        }
    }
        public static int binarySearch(int[] arr, int value, int low, int high) {
        if (low > high) {
            return -1;
        }
            int mid = (low + high) / 2;
            int guess = arr[mid];
            if (guess == value) {
                return mid;
            } else if (guess > value) {
                high = mid - 1;
            } else if (guess < value) {
                low = mid + 1;
            }
            return binarySearch(arr, value, low, high);
        }
    }

