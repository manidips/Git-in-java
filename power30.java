class ParentClass {
    int a;
    int b;
    int e;

    ParentClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void ad() {
        e = a + b;
        System.out.println(e);
    }
}

class ChildeClass extends ParentClass {
    int c;

    ChildeClass(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    void ad() {
        super.ad();
        System.out.println(a + b + c);
    }
}

public class power30 {
    public static void main(String[] args) {
        ChildeClass obj = new ChildeClass(5, 8, 5);
        // obj.show();
        obj.ad();

    }
}
