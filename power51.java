class fo {
    void linerS(int[] array, int number) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.println("The number found index number is " + i);
                temp = temp + 1;
            }
        }
        if (temp == 0) {
            System.out.println("The number is not found");
        }
    }
}

public class power51 {
    public static void main(String[] args) {
        int[] array = { 15, 27, 9, 34, 82 };
        int number = 27;
        fo obj = new fo();
        obj.linerS(array, number);
    }
}
