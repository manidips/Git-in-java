abstract class progamming {
    public abstract void Developer();

    public void book() {
        System.out.println("af kon ho");
    }
}

class html extends progamming {
    public void Developer() {
        System.out.println("hi kasha ho ap");
    }
}

class java extends progamming {
    public void Developer() {
        System.out.println("Hello hi ap kon ho");
    }

    public void pen() {
        System.out.println("Mara pan khaya ha");
    }
}

public class power31 {
    public static void main(String[] args) {
        // java obj = new java();
        // obj.Developer();
        // obj.book();

        progamming obj = new java();
        obj.Developer();
        obj.book();

    }
}
