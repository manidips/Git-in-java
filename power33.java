interface Clint {
    void design(int number);

    void develope();
}

abstract class Riki implements Clint {

    @Override
    public void design(int number) {
        System.out.println("green " + number);
    }
}

class Manidip extends Riki {

    @Override
    public void develope() {
        System.out.println("This is my capability ");
    }

}

public class power33 {
    public static void main(String[] args) {
        Manidip obj = new Manidip();
        obj.develope();
        obj.design(145);
    }
}
