class Scarch {
    int binaryS(int[] array, int number) {
        int min = 0;
        int max = array.length - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            System.out.println("Mid " + mid + " Min " + min + " Max " + max);
            if (array[mid] == number) {
                return mid;
            } else if (array[mid] < number) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return -1;
    }
}

public class binary {
    public static void main(String[] args) {
        int[] array = { 2, 4, 6, 7, 8, 9, 10, 13, 15, 18, 19 };
        int number = 13;
        Scarch obj = new Scarch();
        int val = obj.binaryS(array, number);
        System.out.println(val);
    }
}
