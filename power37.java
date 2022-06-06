public class power37 {
    public static void main(String[] args) {
        int[] arr = { 15, 2, 4, 3, 6 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = 0;
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]);
        }
    }
}

// int[] arr = { 15, 2, 4, 3, 6 };
// int min = arr[0];

// for (int i = 0; i < arr.length; i++) {
// if (arr[i] < min)
// min = arr[i];
// }
// System.out.println(min);