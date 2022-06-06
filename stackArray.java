public class stackArray {
    int array[];
    int top;
    int capacity;
    private int size;

    public stackArray(int capacity) {
        this.capacity = capacity;
        top = -1;
        array = new int[capacity];
        this.size = 0;
    }

    public void push(int data) {
        if (top == capacity - 1) {
            System.out.println("Overflow");
        }
        top++;
        size++;
        array[top] = data;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Underflow");
        }
        int res = array[top];
        top--;
        size--;
        return res;
    }

    public int peak() {
        if (top == -1) {
            System.out.println("Underflow");
        }
        return array[top];
    }

    public int getSize() {
        return size;
    }

    boolean isEmpty() {
        return top == -1;
    }

    public void printList() {
        if (top == -1) {
            System.out.println("List is empty");
        }

        while (top != -1) {
            System.out.print(array[top] + " --> ");
            top--;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        stackArray arr = new stackArray(5);
        arr.push(5);
        arr.push(10);
        arr.push(15);
        arr.push(20);
        arr.pop();
        arr.push(30);
        System.out.println(arr.getSize());
        System.out.println(arr.isEmpty());
        arr.printList();
    }
}
