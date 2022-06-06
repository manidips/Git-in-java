class Employee {
    float salary = 40000;
}

class programer extends Employee {
    int bouns = 10000;
}

public class power1 {
    public static void main(String[] args) {
        programer obj = new programer();
        System.out.print("This is value of " + obj.bouns + obj.salary);
    }
}
