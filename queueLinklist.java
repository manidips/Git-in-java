public class queueLinklist {
    private int size;

    queueLinklist() {
        this.size = 0;
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            size++;
        }
    }

    Node front, rear;

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (front == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    int dequeue() {
        if (front == null) {
            System.out.println("list is empty");
        }
        size--;
        int result = front.data;
        front = front.next;
        return result;
    }

    public void display() {
        if (front == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = front;
        while (currNode != null) {
            System.out.print(currNode.data + " <-- ");
            currNode = currNode.next;
        }
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        queueLinklist list = new queueLinklist();
        list.enqueue(10);
        list.enqueue(15);
        list.enqueue(20);
        list.dequeue();
        list.enqueue(32);
        list.enqueue(42);
        list.dequeue();
        System.out.println(list.getSize());
        list.display();
    }
}
