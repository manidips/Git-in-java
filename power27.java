class Key {
    Key() {
        System.out.println("i am a constructor");
    }

    Key(int x) {
        System.out.println("i am a constructor " + x);
    }
}

class mouse extends Key {
    mouse() {
        // super(5);
        System.out.println("I am a mouse class constructor ");
    }

    mouse(int x, int y) {
        super(x);
        System.out.println("I am a mouse class constructor " + y);
    }
}

public class power27 {
    public static void main(String[] args) {
        // Key obj = new Key();
        // mouse obj1 = new mouse(4, 6);

    }
}
