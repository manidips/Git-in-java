import java.util.Scanner;

public class power16 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of Array ");
        int n = obj.nextInt();
        int[] teacher = new int[n];
        System.out.println("Enter the element of the array ");
        for (int i = 0; i < n; i++) {
            teacher[i] = obj.nextInt();
        }
        System.out.println("Array Element are ");

        for (int i = 0; i < n; i++) {
            System.out.println("The index is " + i + " and the value is " + teacher[i]);
        }

        obj.close();
    }
}
