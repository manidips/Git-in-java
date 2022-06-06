class A1 {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

public class power38 {
    public static void main(String[] args) {
        A1 obj = new A1();
        obj.setAge(186);
        System.out.println(obj.getAge());
    }
}
