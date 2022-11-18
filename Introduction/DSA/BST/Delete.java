package DSA.BST;

import java.util.ArrayList;

public class Delete {
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
    
    public static void inorder(Node root) {

        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static Node delete(Node root, int val) {
        if(root.data > val) root.left = delete(root.left, val);
        else if (root.data < val) root.right = delete(root.right, val);
        else {
            //case 1:
            if(root.left == null && root.right == null) return null;
            //case 2:
            else if(root.left == null) return root.right;
            else if(root.right == null) return root.left;
            //case 3:
            else {
                Node IS =  inorderSuccessor(root.right);
                root.data = IS.data;
                root.right = delete(root.right, IS.data);
                
            }
        }
        return root;
    }

    public static Node inorderSuccessor(Node root) {
        while(root.left != null) {
            root = root.left;
        }

        return root;
    }

    public static void printInRange(Node root, int X, int Y) {
        if(root == null) return;
        if(root.data >= X && root.data <= Y) {
            printInRange(root.left, X, Y);
            System.out.print(root.data + " ");
            printInRange(root.right, X, Y);
        }
        else if(root.data >= Y) {
            printInRange(root.left, X, Y);
        }
        else {
            printInRange(root.right, X, Y); 
        }

    }
    
    public static void printPath(ArrayList<Integer> path) {
        for(int i : path) System.out.print(i + "->");

        System.out.println();
    }
    
    public static void rootToLeaf(Node root, ArrayList<Integer> path) {
        if(root == null) return;
        path.add(root.data);

        if(root.left == null && root.right == null) printPath(path);
        else {
            rootToLeaf(root.left, path);

            rootToLeaf(root.right, path);
        }
        path.remove(path.size()-1);
    }
    
    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for(int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
    
        rootToLeaf(root, new ArrayList<>()); 
    
    }
}
