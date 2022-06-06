interface A4 {
    void display1();

    static void extracted() {
        System.out.println("I am Statis method");
    }

    default void kalo() {
        System.out.println("I am default method");
    }

}

abstract class A2 {
    abstract void display();

    void foo() {
        System.out.println("This is parent method");
    }
}

class A3 extends A2 implements A4 {
    void foo() {
        super.foo();
        System.out.println("This is child methord ");
    }

    @Override
    void display() {
        System.out.println("This is Override method");
    }

    public void display1() {
        System.out.println("This is interface override method");
    }
}

public class power39 {
    public static void main(String[] args) {
        A3 obj = new A3();
        obj.foo();
        obj.display();
        obj.display1();
    }
}
