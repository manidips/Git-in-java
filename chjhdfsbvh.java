public class chjhdfsbvh {
    class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public void creat(int data) {
        Node newNode = new Node(data);
        System.out.println("ndjhfd " + newNode.data);
    }
    // public Node create() {
    // int data = 45;

    // Node root = new Node(data);
    // System.out.println(root.data);
    // return root;
    // // return null;
    // }

    public static void main(String[] args) {
        chjhdfsbvh obj = new chjhdfsbvh();
        // obj.create();
        obj.creat(10);
    }
}
