class Employee1 {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

}

public class power24 {
    public static void main(String[] args) {
        Employee1 obj = new Employee1();
        obj.salary = 45152;
        obj.setName("Manidip Santra");
        System.out.println(obj.getName());
        System.out.println(obj.getSalary());
    }

}
