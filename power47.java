public class power47 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row = 1; row <= n; row++) {
            for (int col = n - 1; col >= row; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
