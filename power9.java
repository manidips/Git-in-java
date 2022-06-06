import java.util.Scanner;

public class power9 {
    public static void main(String[] args) {
        Scanner sce = new Scanner(System.in);
        int marks = 80;
        System.out.println("Enter the madhyamik computer number ");
        int marks1 = sce.nextInt();
        System.out.println("Enter the Secondary computer number ");
        int marks2 = sce.nextInt();
        if (marks1 >= marks && marks2 >= marks) {
            System.out.println("You can Admission in the Collage");
        } else {
            System.out.println("You can't Admission in the Collage");
        }

        sce.close();
    }
}
