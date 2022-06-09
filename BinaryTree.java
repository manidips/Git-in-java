import java.util.Scanner;

public class BinaryTree {
    class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public Node create() {

        int data;
        Scanner sc = new Scanner(System.in);
        Node root = null;
        System.out.print("Enter value ");
        data = sc.nextInt();
        if (data == -1)
            return null;
        root = new Node(data);
        System.out.print("Enter left child of " + root.data);
        root.left = create();
        System.out.print("Enter right child of " + root.data);
        root.right = create();
        return root;

    }

    public void inorder(Node root) // LNR
    {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public void preorder(Node root) // NLR
    {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public void postorder(Node root) // LRN
    {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        BinaryTree list = new BinaryTree();
        Node root = list.create();
        System.out.println(root.data);
        list.inorder(root);
        System.out.println();
        list.preorder(root);
        System.out.println();
        list.postorder(root);
    }

}
