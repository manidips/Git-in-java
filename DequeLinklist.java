public class DequeLinklist {

    private int size = 0;

    class Node {
        int data;
        Node next, prev;

        public Node(int data) {
            this.data = data;
            size++;
        }
    }

    Node front = null;
    Node rear = null;

    public void insertFront(int data) {
        Node newNode = new Node(data);
        if (front == null) {
            front = rear = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
    }

    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
    }

    public void deleteFront() {
        if (front == null) {
            System.out.println("list is Empty");
        }
        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
            front.prev = null;
        }
        size--;
    }

    public void deleteEnd() {
        if (rear == null) {
            System.out.println("list is Empty");
        }
        if (rear == front) {
            front = rear = null;
        } else {
            rear = rear.prev;
            rear.next = null;
        }
        size--;
    }

    public int getSize() {
        return size;
    }

    public int getFront() {
        if (front != null) {
            return front.data;
        }
        return -1;
    }

    public int getEnd() {
        if (rear != null) {
            return rear.data;
        }
        return -1;
    }

    public boolean isEmpty() {
        if (front == null) {
            return true;
        }
        return false;
    }

    public void Erase() {
        rear = null;

        while (front != null) {
            front.prev = null;
            front = front.next;
        }
        size = 0;
    }

    public void printList() {
        if (front == null) {
            System.out.println("List is empty");
        }
        while (front != null) {
            System.out.print(front.data + " -- ");
            front = front.next;
        }

    }

    public static void main(String[] args) {
        DequeLinklist list = new DequeLinklist();
        list.insertFront(10);
        list.insertFront(20);
        list.insertEnd(45);
        list.insertFront(30);
        list.insertEnd(55);
        list.deleteFront();
        list.deleteEnd();
        System.out.println(list.getSize());
        System.out.println(list.getFront());
        System.out.println(list.getEnd());
        System.out.println(list.isEmpty());
        list.Erase();
        System.out.println(list.isEmpty());
        list.insertFront(10);
        System.out.println(list.getSize());
        list.printList();

    }
}
