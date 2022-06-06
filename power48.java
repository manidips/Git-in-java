import java.util.*;

public class power48 {
    static int searchaing(int[] arr, int number) {
        Arrays.sort(arr);
        int min = 0;
        int max = arr.length - 1;
        while (min <= max) {
            int midindex = ((min + max) / 2);
            System.out.println("midindex " + midindex + " min " + min + " max " + max);
            if (arr[midindex] < number) {
                min = midindex + 1;
            } else if (arr[midindex] > number) {
                max = midindex - 1;
            } else {
                return midindex;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 15, 2, 9, 3, 7, 6, 1, 4, 8, 5, 10, 13, 12, 14, 11 };
        int number = 9;
        int val = searchaing(arr, number);
        System.out.println(val);
    }

}
