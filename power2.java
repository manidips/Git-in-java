import java.util.Scanner;

public class power2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = sc.nextInt();
        System.out.println("Enter the next number ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println(c);

        sc.close();
    }
}
