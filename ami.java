import java.util.*;

class sum {
    // public void sumArr(int[] array) {

    // for (int i = 0; i < array.length; i++) {
    // for (int j = i + 1; j < array.length; j++) {
    // if (array[i] + array[j] == 0) {
    // System.out.println("Posible number is " + array[i] + " and " + array[j]);
    // }
    // }
    // }
    // }
    // }
    public void sumArr(int[] array) {
        int left = 0;
        int rigth = array.length - 1;
        // Sorted Array
        Arrays.sort(array);
        while (array[left] < array[rigth]) {
            int sum = array[left] + array[rigth];
            if (sum == 0) {
                System.out.println(array[left] + " and " + array[rigth]);
                rigth--;
                left++;
            } else if (sum > 0) {
                rigth--;
            } else {
                left++; // int[] array = { -5,-4,-2,0,3,6,4,8 };
            }
        }
    }
}

public class ami {
    public static void main(String[] args) {
        // int[] arr = { 15, 24, 2, 6, 1, 5 };
        // int len = arr.length;
        // int temp;
        // System.out.println(arr[0]);
        // temp = arr[0];
        // arr[0] = arr[len - 1];
        // arr[len - 1] = temp;

        // for (int ap : arr) {
        // System.out.print(ap + " ");
        // }
        // System.out.println();
        // System.out.println(arr[0]);

        sum obj = new sum();
        int[] array = { -7, 4, -3, -2, 0, -5, -4, -6, 2 };
        obj.sumArr(array);

    }
}
