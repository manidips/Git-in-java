class BubbleSort {
    int[] BubbleS(int[] array) {
        int temp;
        for (int i = array.length; i > 0; i--) {
            int flag = 0;
            for (int j = 0; j < i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                System.out.println("fack you");
                break;
            }
        }
        return array;
    }
}

public class Bubble {
    public static void main(String[] args) {
        int[] array = { 5, 2, 9, 7, 3, 1, 8, 6, 4 };
        BubbleSort obj = new BubbleSort();
        int[] val = obj.BubbleS(array);
        for (int i = 0; i < val.length; i++) {
            System.out.print(val[i] + " ");
        }
    }
}
