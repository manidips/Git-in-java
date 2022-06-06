import java.util.Scanner;

public class power8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your age ");
            int age = sc.nextInt();
            if (age >= 18) {
                System.out.println("You can vote");
            } else if (age == 0) {
                break;
            } else {
                System.out.println("You can't vote");
            }
        }
        sc.close();
    }
}
