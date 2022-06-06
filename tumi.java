import java.util.Scanner;

public class tumi {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int[] arr = { 15, 24, 36, 95, 24, 8, 4, 15, 36, 24 };
        System.out.println("Enter your chose number ");
        int N = obj.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == N) {
                System.out.println(arr[i] + " and index is " + i);
            }
        }
        obj.close();
    }
}
