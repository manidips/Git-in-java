public class power19 {
    public static void main(String[] args) {
        // int[] arr = { 2, 6, 4, 79, 52, 4 };
        // int l = arr.length;
        // int n = Math.floorDiv(l, 2);
        // int temp;
        // for (int i = 0; i < n; i++) {
        // temp = arr[i];
        // arr[i] = arr[l - 1 - i];
        // arr[l - 1 - i] = temp;
        // }
        // for (int element : arr) {
        // System.out.print(element + " ");
        // }

        // int[] arr = { 1, 54, 21, 52, 56, 85, 5 };
        // int max = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] > max) {
        // max = arr[i];
        // }
        // }
        // System.out.println("the value of the maximum element in this array is " +
        // max);

        // System.out.println(Integer.MAX_VALUE);
        // System.out.println(Integer.MIN_VALUE);

        boolean isSorted = true;
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("The Array is sorted");
        } else {
            System.out.println("The array is not sorted");
        }
    }
}
