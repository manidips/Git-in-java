public class power25 {
    private int id;
    private String name;

    // public power25() {
    // id = 45;
    // name = "Your name is ";
    // }
    public power25(int myid, String myname) {
        this.id = myid;
        this.name = myname;
    }

    public power25(int myid) {
        this.id = myid;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        power25 obj = new power25(51, "Manidip Santra");
        System.out.println(obj.getId());
        System.out.println(obj.getName());
    }
}
