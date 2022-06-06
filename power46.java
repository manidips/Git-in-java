public class power46 {
    public static void main(String[] args) {

        // for (int i = 1; i <= 5; i++) {
        // int number = 1;
        // for (int j = 1; j <= i; j++) {
        // System.out.print(number + " ");
        // number++;
        // // System.out.print(j + " ");
        // }
        // System.out.println();
        // }
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            int number = 1;
            for (int k = 1; k <= i; k++) {
                System.out.print(number + " ");
                // number++;
            }
            System.out.println();
        }
    }
}
