public class power21 {
    static void foo() {
        System.out.println("good Morning bro ");
    }

    static void foo(int a) {
        System.out.println("Good Morning " + a + " Bro");
    }

    static void change(int a) {
        a = 98;
        // System.out.println("The " + a);
    }

    static void change1(int[] arr) {
        arr[0] = 98;
        // System.out.println("The " + a);
    }

    static void telljoke() {
        System.out.println("I invented a new world!");
    }

    public static void main(String[] args) {
        // telljoke();
        // int x = 45;
        // change(x);
        // int[] marks = { 25, 29, 64, 534, 18, 65, 74 };
        // change1(marks);
        // System.out.println("After " + marks[0]);

        // Method Overloding

        foo();
        foo(500);
    }
}
