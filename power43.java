class AD {
    int ka(int a, int b) throws ArithmeticException {
        int c;
        c = a / b;
        return c;
    }
}

public class power43 {
    public static void main(String[] args) {
        AD obj = new AD();
        int a = 100;
        int b = 0;
        try {
            System.out.println(obj.ka(a, b));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Hello");

    }
}
