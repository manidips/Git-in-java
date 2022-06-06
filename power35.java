
interface sampleinterface {
    void math1();

    void math2();
}

interface childSampleInterface extends sampleinterface {
    void math3();

    void math4();
}

class MySampleClass implements childSampleInterface {
    public void math1() {
        System.out.println("MATH1");
    }

    public void math2() {
        System.out.println("MATH2");
    }

    public void math3() {
        System.out.println("math3");
    }

    public void math4() {
        System.out.println("math4");
    }

}

public class power35 {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
        obj.math1();
        obj.math2();
        obj.math3();
        obj.math4();
    }
}
