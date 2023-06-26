package test;

public class BinaryTreeEx {
public static void main(String args[]) {
    Node n= new Node(1);
    n.left = new Node(2);
    n.right = new Node(3);

    n.left.left = new Node(4);
    n.left.right = new Node(6);

    n.right.left = new Node(5);
    n.right.right = new Node(7);
    traversePostOrder(n);




}
public static void traverseInOrder(Node n) {
    if(n!= null) {
        traverseInOrder(n.left);
        System.out.println(n.data);
        traverseInOrder(n.right);
    }

}

    public static void traversePreOrder(Node n) {
        if (n != null) {
            System.out.println(n.data);

            traversePreOrder(n.left);
            traversePreOrder(n.right);
        }
    }

    public static void traversePostOrder(Node n) {
        if(n!= null) {

            traversePostOrder(n.left);
            traversePostOrder(n.right);
            System.out.println(n.data);

        }

    }
}
class Node{
    Node left;
    Node right;
    int data;
    Node(int data) {
        this.data=data;
        left=null;
        right= null;
    }
}
