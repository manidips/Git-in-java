
public class queueArray {
    int array[];
    int front, rear;
    int capacity;
    private int size;

    public queueArray(int capacity) {
        this.capacity = capacity;
        front = rear = -1;
        array = new int[capacity];
        this.size = 0;
    }

    public void enqueue(int data) {
        if (capacity - 1 == rear) {
            System.out.println("Array is full");
            return;
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            size++;
            array[rear] = data;
        }
        return;
    }

    int dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("list is empty");
        }
        int result = array[front];
        front++;
        size--;
        return result;

    }

    public int getSize() {
        return size;
    }

    public void printArray() {
        if (front == -1) {
            System.out.println("List is empty");
        }
        int current = front;
        for (int i = current; i < rear; i++) {
            System.out.print(array[i] + " <-- ");
        }
    }

    public static void main(String[] args) {
        queueArray obj = new queueArray(8);
        obj.enqueue(12);
        obj.enqueue(14);
        obj.enqueue(16);
        obj.enqueue(18);
        obj.dequeue();
        obj.dequeue();
        obj.enqueue(20);
        obj.enqueue(40);
        obj.enqueue(50);
        obj.enqueue(60);
        obj.enqueue(70);
        System.out.println(obj.getSize());
        obj.printArray();
    }
}
