class A {
    public void za() {
        System.out.println("Hi Hello ");
    }

    public void ab(int a, int b) {
        System.out.println("Kothay tumi " + a + "and " + b);
    }
}

class B extends A {

    public void ka() {
        System.out.println("Tumi ka ");
    }

    public void ab(int a, int b, int c) {
        super.ab(a, b);
        System.out.println(" Ghora acchi " + a + " and " + b + " and " + c);
    }
}

public class power29 {
    public static void main(String[] args) {
        // A obj = new B();
        // B obj = new B();
        // obj.za();
        // obj.ab(5, 6);

    }
}
