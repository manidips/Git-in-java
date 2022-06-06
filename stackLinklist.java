public class stackLinklist {
    Node head;
    private int size;

    stackLinklist() {
        head = null;
        this.size = 0;
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void push(int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }

    public int peak() {
        if (head == null) {
            System.out.println("underflow");
        }
        return head.data;
    }

    public int pop() {
        if (head == null) {
            System.out.println("underflow");
        }
        int res = head.data;
        head = head.next;
        size--;
        return res;
    }

    boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        stackLinklist obj = new stackLinklist();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.pop();
        obj.push(80);
        obj.printList();
        System.out.println(obj.peak());
        System.out.println(obj.getSize());
    }
}
