// CircularQueueUsingLinklist

public class circularLinklist {
    private int size;

    circularLinklist() {
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
        if ((rear == null) && (front == null)) {
            front = rear = newNode;
            rear.next = front;
        } else {
            rear.next = newNode;
            rear = newNode;
            rear.next = front;
        }
    }

    public void dequeue() {
        if ((front == null) && (rear == null)) {
            System.out.println("Queue is empty ");
        } else if (front == rear) {
            size--;
            front = rear = null;
        } else {
            size--;
            front = front.next;
            rear.next = front;
        }
    }

    public int getSize() {
        return size;
    }

    public void printList() {
        Node currNode = front;
        if ((front == null) && (rear == null)) {
            System.out.println("Queue is empty");
        } else {
            do {
                System.out.print(currNode.data + "--");
                currNode = currNode.next;
            } while (currNode != front);
        }
    }

    public static void main(String[] args) {
        circularLinklist list = new circularLinklist();
        list.enqueue(13);
        list.enqueue(15);
        list.enqueue(19);
        list.enqueue(21);
        list.enqueue(23);
        list.dequeue();
        list.enqueue(25);
        list.dequeue();
        list.dequeue();
        list.dequeue();
        list.dequeue();
        list.dequeue();
        list.enqueue(27);
        System.out.println(list.getSize());
        list.printList();
    }
}
