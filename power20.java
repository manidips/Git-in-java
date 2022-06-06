public class power20 {
    int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        // x = 2;
        return z;
    }

    public static void main(String[] args) {
        int a = 6;
        int b = 5;
        int c;
        power20 obj = new power20();
        c = obj.logic(a, b);

        // c = logic(a, b);
        System.out.println(c);
    }
}
