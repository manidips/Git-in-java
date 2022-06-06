class Employee {
    int id;
    int salary;
    String name;

    public void printDetails() {
        System.out.println("My id is " + id);
        System.out.println("and my name is " + name);
    }

    public int getSalary() {
        return salary;
    }
}

public class power23 {
    public static void main(String[] args) {
        Employee obj = new Employee();
        Employee john = new Employee();
        obj.id = 15;
        obj.name = "Manidip";
        obj.salary = 123255;
        john.id = 152;
        john.name = "John khandelwal";
        john.salary = 245166;
        // System.out.println(obj.id);
        // System.out.println(obj.name);
        obj.printDetails();
        john.printDetails();
        int salary = obj.getSalary();
        System.out.println(salary);
    }
}
