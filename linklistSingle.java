public class linklistSingle {
    Node head;
    private int size;

    linklistSingle() {
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

    // add first,last
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void specify(int data, int position) {
        Node newNode = new Node(data);

        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node curreNode = head;
        for (int i = 0; i < position - 1; i++) {
            try {
                curreNode = curreNode.next; /// code
            } catch (Exception e) {
                e.printStackTrace();
            }

            if (curreNode == null) {
                System.out
                        .println("value of position = " + position + " is greater than number of nodes in the list !!");
            }
        }
        try {
            newNode.next = curreNode.next; /// code
            curreNode.next = newNode; /// code
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void deleteSpecify(int position) {
        if (position == 0) {
            head = head.next;
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node curreNode = head;
        Node lastNode = head.next;
        for (int i = 0; i < position - 1; i++) {
            lastNode = lastNode.next;
            curreNode = curreNode.next;

            // try {
            // curreNode = curreNode.next; /// code
            // } catch (Exception e) {
            // e.printStackTrace();
            // }

            // if (curreNode == null) {
            // System.out
            // .println("value of position = " + position + " is greater than number of
            // nodes in the list !!");
            // }
        }
        curreNode.next = curreNode.next.next;
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

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        linklistSingle list = new linklistSingle();
        list.addFirst(15);
        list.addFirst(20);
        list.addLast(100);
        list.specify(10, 3);
        list.deleteSpecify(1);
        // list.deleteFirst();
        // list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
    }
}
