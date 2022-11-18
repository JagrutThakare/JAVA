package DSA.BST;

public class Searching {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }
    public static Node insert(Node root, int val) {
        if(root == null) return new Node(val);

        if(root.data > val) root.left = insert(root.left, val);
        else root.right = insert(root.right, val);

        return root;
    }
    
    public static boolean search(Node root, int key) {
        if(root == null) return false;
        else if(root.data > key) return search(root.left, key);
        else if(root.data < key) return  search(root.right, key);
        else return true;
    }
    
    public static void main(String[] args) {
        int values[] = {5, 1, 3, 4, 2 ,7};
        Node root = null;

        for(int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        if(search(root, 2))  System.out.println("found");
        else System.out.println("Not found");
    }
}
