package GrokaemAlgoritmi;

public class BinarySearch {
    public static void main(String[] args) {
       int res = search(new int[]{4, 6, 7, 10, 15}, 4);
       if (res >= 0) {
           System.out.println("Значение в списке расположена в позиции " + res);
       } else  {
           System.out.println("Значение не найдено");
       }
    }
    public static int search(int[]mas, int value ) {
        int low = 0;
        int high = mas.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
           int guess = mas[mid];
            if (guess == value) {
                return mid;
            } else if (guess < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
