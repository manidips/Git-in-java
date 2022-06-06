class Base {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void printMe() {
        System.out.println("I am a constructor ");
    }
}

class Derived extends Base {
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class power26 {
    public static void main(String[] args) {
        // Base obj = new Base();
        Derived obj1 = new Derived();
        obj1.setX(152);
        System.out.println(obj1.getX());
    }
}
