package com.morle;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int key;
    Node left;
    Node right;

    public Node(int k) {
        key = k;
    }
}



public class Main {

    public static void main(String[] args) {
	// write your code here
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.right = new Node(2);
        root.left.left = new Node(8);
        root.left.right = new Node(7);
        root.left.right.left = new Node(9);
        root.left.right.right = new Node(15);
        System.out.println(sizeofbt(root));
//        inorder(root);
//        System.out.println();
//        postorder(root);
//        System.out.println();
//        printknodes(root,2);
    }

    public static void inorder(Node root) {
        if (root!=null)
        {
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }

    }
    public static void preorder(Node root) {
        if (root!=null)
        {
            System.out.print(root.key+" ");
            preorder(root.left);
            preorder(root.right);
        }

    }
    public static void postorder(Node root) {
        if (root!=null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.key+" ");
        }

    }

    static int height(Node root){
        if (root == null)
        {
            return 0;
        }
        else{
            return Math.max(height(root.left),height(root.right)) + 1;
        }
    }

    static void printknodes(Node root,int k)
    {
        if (root == null)
        {
            return ;
        }
        if (k == 0)
        {
            System.out.println(root.key);
        }
            printknodes(root.left,k-1);
            printknodes(root.right,k-1);
    }
    static void levelordertraversal(Node root)
    {
        if (root == null)
        {
            return ;
        }


        Queue <Node> q = new LinkedList<Node>();
        q.add(root);


        while (!q.isEmpty())
        {
            Node curr = q.poll(); //returns and removes the element at the front end
            System.out.print(curr.key+" ");
            if (curr.left != null)
            {
                q.add(curr.left);
            }
            if (curr.right != null)
            {
                q.add(curr.right);
            }
        }
    }

    static int sizeofbt(Node root)
    {
        if (root == null)
        {
            return 0;
        }
        return 1+sizeofbt(root.left)+sizeofbt(root.right);
    }
}
