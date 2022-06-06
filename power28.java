class Ekclass {
    int a;

    public int getA() {
        return a;
    }

    Ekclass(int p) {
        this.a = p;
    }

    public int returnone() {
        return 1;
    }
}

public class power28 {
    public static void main(String[] args) {
        Ekclass abc = new Ekclass(5);
        System.out.println(abc.getA());
        System.out.println(abc.returnone());
    }
}
