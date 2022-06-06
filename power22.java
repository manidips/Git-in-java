public class power22 {
    // static int sum(int a,int b){
    // return a + b;
    // }
    static int sum(int... arr) {
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("The sum is " + sum(4, 6));
        System.out.println("The sum is " + sum(4, 6, 6));
    }
}
