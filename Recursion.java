public class Recursion {
    // static int A(int data) {
    // if (data == 0) {
    // return 1;
    // }
    // System.out.print(data + " ");
    // A(data - 1);
    // System.out.print(" " + data);
    // return data;
    // }

    static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            System.out.println(n);
            int p = n * fact(n - 1);
            System.out.println("the" + p);
            return p;
        }

    }

    public static void main(String[] args) {
        int c = fact(5);
        System.out.println(c);
    }

}
