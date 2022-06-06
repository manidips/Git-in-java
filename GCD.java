public class GCD {
    public static void main(String[] args) {
        int num1 = 84;
        int num2 = 26;
        int min, gcd = 0;

        if (num2 > num1) {
            min = num1;
        } else {
            min = num2;
        }
        for (int i = 1; i < min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        System.out.println(gcd);
    }
}
