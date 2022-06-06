interface myCamera {
    String[] getNetwork();

    void connect(String network);

    default void ka() {
        System.out.println("Hello hi by");
    }

}

interface mywifi {
    void takesnap();

    void recordvideo();
}

class ami {
    void call(int phone) {
        System.out.println("Calling " + phone);
    }
}

class tumi extends ami implements myCamera, mywifi {

    @Override
    public String[] getNetwork() {
        String[] name = { "Riki", "Sani", "Pritam" };
        return name;
    }

    @Override
    public void connect(String network) {
        System.out.println("Connect to " + network);
    }

    @Override
    public void takesnap() {
        System.out.println("I am a takesnap");

    }

    @Override
    public void recordvideo() {
        System.out.println("i am a recordvideo");

    }

    public void hh() {
        System.out.println("This is my capasity");
    }

}

public class power32 {
    public static void main(String[] args) {
        // tumi obj = new tumi();
        // String[] ar = obj.getNetwork();
        // for (String item : ar) {
        // System.out.println(item);
        // }
        // obj.connect("Vodafone");
        // obj.call(9732);
        // obj.ka();

        // myCamera obj = new tumi();
        // obj.getNetwork();
        // obj.takesnap();

    }
}
