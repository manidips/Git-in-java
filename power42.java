class AK {
    void ka(int a, int b) {
        int c;
        try {
            c = a / b;
            System.out.println(c);

        } catch (Exception e) {
            e.printStackTrace();
        }
        // System.out.println(c);
    }
}

public class power42 {
    public static void main(String[] args) {
        AK obj = new AK();
        int a = 100;
        int b = 2;
        obj.ka(a, b);
    }
}
