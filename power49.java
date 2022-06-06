class isSquareChack {
    boolean Square(int[] array1, int[] array2) {
        boolean isSquare = false;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] * array1[i] == array2[j]) {
                    isSquare = true;
                    System.out.println("dxdjh");
                }
                if (j == array2.length - 1) {
                    if (!isSquare) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

public class power49 {
    public static void main(String[] args) {
        isSquareChack obj = new isSquareChack();
        int[] array1 = { 5, 2, 3, 4 };
        int[] array2 = { 9, 10, 16, 25 };
        boolean val = obj.Square(array1, array2);
        System.out.println(val);
    }
}
